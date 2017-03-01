/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Component.GameObject;
import Component.LevelInstantiator;
import Controller.AI;
import Controller.CollisionDetectorWall;
import Controller.Jump;
import Model.ElementInGame;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author j.zanti
 */
public class Enemy extends GameObject{

    private int imageIndex;
    public Enemy(int x, int y)
    {
        imageIndex = 0;
        isEnemy = true;
        hitBox = new Rectangle(50,50);
        posizione = new Point(x,y);
        RepositionHitBox();        
        animable = true;
        height = 50;
        width = 50;
        canMoveDX = true;
        canMoveSX = true;
        canMoveUP = true;
        canMoveDW = true;
        direction = Direction.LEFT;
        movement = AI.istance;
        speed = 2;
        life = 3;
        if(AI.istance == null)
        {
            new AI().start();
        }
        ElementInGame.ElementInGame.add(this);
        dmg = 1;
        jump = new Jump();        
        image = new ImageIcon(new ImageIcon("Img/Enemy/bidellofermodx.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));        
        this.movimentoDX = new ImageIcon[4]; // 5 giu 6 su
        this.movimentoSX = new ImageIcon[4]; // 5 giu 6 su
        LoadImage();
        
    }
    
    
    @Override
    public void MoveLeft(int movement) {
        if(this.canMoveSX)
        {
            this.posizione.x -= movement;
            RepositionHitBox();
            image = this.movimentoSX[imageIndex];
            imageIndex++;
            if(imageIndex > 2)
                imageIndex = 0;
        }
        this.direction = Direction.LEFT;
        }

    @Override
    public void MoveRight(int movement) {

        if(this.canMoveDX)
        {
            this.posizione.x += movement;
            RepositionHitBox();
            image = this.movimentoDX[imageIndex];
            imageIndex++;
            if(imageIndex > 2)
                imageIndex = 0;
        }
        this.direction = Direction.RIGHT;

    }

    @Override
    public void MoveUp(int movement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MoveDown(int movement) {
        if(this.canMoveDW)
        {
            this.posizione.y += movement;
            RepositionHitBox();
        }
        this.direction = Direction.DOWN;
    }

    @Override
    public void RepositionHitBox() {
        hitBox.x = posizione.x;
        hitBox.y = posizione.y;
    }

    @Override
    public void TakeDamage(int dmg) {
        life -= dmg;
        if(life < 0)
        {
            ElementInGame.ElementInGame.remove(this);
            if(ElementInGame.ElementInGame.size() == 1)
            {
                LevelInstantiator.instance.ChangeLvl('+');                   
            }
        }
    }

    @Override
    public void Shoot() {

    }
    
    private void LoadImage() {
        String PATH = "Img/Enemy/";
        this.movimentoDX[0] = new ImageIcon(new ImageIcon(PATH+"bidellofermodx.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));

        for(int i = 1; i<3; i++)
        {
            this.movimentoDX[i] = (new ImageIcon(new ImageIcon(PATH+"bidellomov"+i+"dx.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        }
        this.movimentoSX[0] = (new ImageIcon(new ImageIcon(PATH+"bidellofermosx.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));

        for(int i = 1; i<3; i++)
        {
            this.movimentoSX[i] = (new ImageIcon(new ImageIcon(PATH+"bidellomov"+i+"sx.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));
        }
    }
    
    
    
    
    
}
