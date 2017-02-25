/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Component.*;
import Controller.CanJump;
import Controller.Jump;
import Controller.ShootArrow;
import Controller.Wasd;
import Model.ElementInGame;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author daddi
 */
public class MainCharacter extends GameObject {
    public boolean canShoot;
    public static MainCharacter instance = null; 
    public Direction facing = Direction.RIGHT;
    private int imageIndex;
    private ImageIcon[] lookDirection;
    public MainCharacter(int x, int y)
    {
        imageIndex = 0;
        canMoveSX = true;
        canMoveDX = true;
        canMoveUP = true;
        canMoveDW = true;
        instance = this;
        image = new ImageIcon(new ImageIcon("Img/Zanti/zantiFermodx.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        ElementInGame.ElementInGame.add(this);
        hitBox = new Rectangle(64,64);
        posizione = new Point(x, y);
        animable = true;
        speed = 1;
        movement = new Wasd();
        movement.start();
        canShoot = true;
        width = 64;
        height = 64;
        jump = new Jump();
        new ShootArrow().start();
        facing = Direction.RIGHT;
        new CanJump().start();
        this.movimentoDX = new ImageIcon[6]; // 5 giu 6 su
        this.movimentoSX = new ImageIcon[6]; // 5 giu 6 su
        LoadImage();
    }

    @Override
    public void MoveUp(int movement) {
        if(this.canMoveUP)
        {
            this.posizione.y -= movement;
            RepositionHitBox();
        }
        this.direction = Direction.DOWN;
    }

        @Override
    public void MoveLeft(int movement) {
        if(this.canMoveSX)
        {
            this.posizione.x -= movement;
            RepositionHitBox();
            image = this.movimentoSX[imageIndex];
            imageIndex++;
            if(imageIndex > 3)
                imageIndex = 0;
        }
        this.direction = Direction.LEFT;
        this.facing = Direction.LEFT;

        }

    @Override
    public void MoveRight(int movement) {

        if(this.canMoveDX)
        {
            this.posizione.x += movement;
            RepositionHitBox();
            image = this.movimentoDX[imageIndex];
            imageIndex++;
            if(imageIndex > 3)
                imageIndex = 0;
        }
        this.direction = Direction.RIGHT;
        this.facing = Direction.RIGHT;

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

    public void Shoot()
    {
        if(canShoot)
        {
            new Projectile(this.posizione.x + this.width/2, this.posizione.y + this.height/2, this.direction, false);
            canShoot = false;
            if(direction == Direction.RIGHT)
                image = movimentoDX[0];
            else if(direction == Direction.LEFT)
                image = movimentoSX[0];
            else if(direction == Direction.UP)
                if(facing == Direction.RIGHT)
                    image = movimentoDX[5];
                else
                    image = movimentoSX[5];
            else 
                if(facing == Direction.RIGHT)
                    image = movimentoDX[4];
                else
                    image = movimentoSX[4];
        }
    }
    
    @Override
    public void TakeDamage(int dmg) {
        life -= dmg;
        if(life < 0)
        {
            System.out.println("death");
        }
    }

    private void LoadImage() {
        String PATH = "Img/Zanti/";
        this.movimentoDX[0] = new ImageIcon(new ImageIcon(PATH+"zantiFermodx.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        this.movimentoDX[4] = new ImageIcon(new ImageIcon(PATH+"zantiFermodxgiu.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        this.movimentoDX[5] = new ImageIcon(new ImageIcon(PATH+"zantiFermodxSu.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));

        for(int i = 1; i<=3; i++)
        {
            this.movimentoDX[i] = (new ImageIcon(new ImageIcon(PATH+"zantimov"+i+"dx.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
        }
        this.movimentoSX[0] = (new ImageIcon(new ImageIcon(PATH+"zantiFermosx.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
        this.movimentoSX[4] = new ImageIcon(new ImageIcon(PATH+"zantiFermosxgiu.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        this.movimentoSX[5] = new ImageIcon(new ImageIcon(PATH+"zantiFermosxSu.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));

        for(int i = 1; i<=3; i++)
        {
            this.movimentoSX[i] = (new ImageIcon(new ImageIcon(PATH+"zantimov"+i+"sx.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT)));
        }
    }
    
}
