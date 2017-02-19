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
        }

    @Override
    public void MoveRight(int movement) {

        if(this.canMoveDX)
        {
            this.posizione.x += movement;
            RepositionHitBox();
        }
        this.direction = Direction.RIGHT;

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
    
}
