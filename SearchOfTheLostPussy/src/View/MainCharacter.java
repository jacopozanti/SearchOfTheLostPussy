/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Component.*;
import Controller.CollisionDetectorWall;
import Controller.Wasd;
import Model.ElementInGame;
import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author daddi
 */
public class MainCharacter extends GameObject {
    public boolean canShoot;
    public static MainCharacter instance = null; 
    public MainCharacter()
    {
        canMoveSX = true;
        canMoveDX = true;
        canMoveUP = true;
        canMoveDW = true;
        instance = this;
        ElementInGame.ElementInGame.add(this);
        hitBox = new Rectangle(64,64);
        posizione = new Point(20,20);
        animable = true;
        speed = 1;
        movement = new Wasd();
        movement.start();
        canShoot = true;
        width = 64;
        height = 64;

    }

    @Override
    public void MoveUp(int movement) {
        if(this.canMoveDW)
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
        }
        this.direction = Direction.LEFT;
        Shoot();

        }

    @Override
    public void MoveRight(int movement) {

        if(this.canMoveDX)
        {
            this.posizione.x += movement;
            RepositionHitBox();
        }
        this.direction = Direction.RIGHT;
        Shoot();

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
            new Projectile(this.posizione.x + this.width/2, this.posizione.y + this.height/2, this.direction);
            canShoot = false;
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
    
}
