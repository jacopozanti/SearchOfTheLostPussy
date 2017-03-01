/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Component.GameObject;
import Component.LevelInstantiator;
import Controller.AI;
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
public class EnemyShooter extends GameObject{
    private int imageIndex;
    public EnemyShooter(int x, int y)
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
        direction = GameObject.Direction.LEFT;
        movement = AI.istance;
        speed = 2;
        life = 1;
        if(AI.istance == null)
        {
            new AI().start();
        }
        ElementInGame.ElementInGame.add(this);
        dmg = 1;
        jump = new Jump();
        canShoot = true;
        image = new ImageIcon(new ImageIcon("Img/Enemy/bidellofermodx.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));        
        this.movimentoDX = new ImageIcon[1]; // 5 giu 6 su
        this.movimentoSX = new ImageIcon[1]; // 5 giu 6 su
        LoadImage();
    }
    
    
    @Override
    public void MoveLeft(int movement) {
//        if(this.canMoveSX)
//        {
//            this.posizione.x -= movement;
//            RepositionHitBox();
//        }
//        this.direction = GameObject.Direction.LEFT;
        }

    @Override
    public void MoveRight(int movement) {

//        if(this.canMoveDX)
//        {
//            this.posizione.x += movement;
//            RepositionHitBox();
//        }
//        this.direction = GameObject.Direction.RIGHT;
        

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
        //this.direction = GameObject.Direction.DOWN;
    }

    @Override
    public void RepositionHitBox() {
        hitBox.x = posizione.x;
        hitBox.y = posizione.y;
    }
    
    public void Shoot()
    {
        if(canShoot)
        {
            new Projectile(this.posizione.x + this.width/2, this.posizione.y + this.height/2, this.direction, true);
            canShoot = false;
            if(direction == Direction.RIGHT)
            {
                direction = Direction.LEFT;
                image = this.movimentoDX[0];
            }
            else
            {
                direction = Direction.RIGHT;
                image = this.movimentoSX[0];
            }
        }
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
    private void LoadImage() {
        String PATH = "Img/Enemy/";
        this.movimentoDX[0] = new ImageIcon(new ImageIcon(PATH+"bidelloSparadx.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT));


        this.movimentoSX[0] = (new ImageIcon(new ImageIcon(PATH+"bidelloSparasx.png").getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT)));


    }
    
}
