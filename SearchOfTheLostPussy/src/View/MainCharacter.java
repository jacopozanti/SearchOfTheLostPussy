/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Component.*;
import Controller.CanJump;
import Controller.CollisionDetectorWall;
import Controller.Jump;
import Controller.ShootArrow;
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
    public Direction facing = Direction.RIGHT;
    public MainCharacter(int x, int y)
    {
        canMoveSX = true;
        canMoveDX = true;
        canMoveUP = true;
        canMoveDW = true;
        instance = this;
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
