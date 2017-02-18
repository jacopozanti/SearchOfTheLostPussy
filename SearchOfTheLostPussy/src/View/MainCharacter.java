/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Component.*;
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
        hitBox = new Rectangle(64,64);
        posizione = new Point(20,20);
        animable = true;
        speed = 1;
        ElementInGame.ElementInGame.add(this);
        movement = new Wasd();
        movement.start();
    }
    @Override
    public void MoveLeft(int movement) {
        if(this.canMoveSX)
            this.posizione.x -= movement;
        this.direction = Direction.LEFT;
        }

    @Override
    public void MoveRight(int movement) {
        if(this.canMoveDX)
            this.posizione.x += movement;
        this.direction = Direction.RIGHT;

    }

    @Override
    public void MoveUp(int movement) {
        if(this.canMoveUP)
            this.posizione.y -= movement;
        this.direction = Direction.UP;

    }

    @Override
    public void MoveDown(int movement) {
        if(this.canMoveDW)
            this.posizione.y += movement;
        this.direction = Direction.DOWN;

    }
    
}
