/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Component.GameObject;
import Component.GameObject.Direction;
import View.*;
import java.awt.event.*;
import java.util.logging.*;
import searchofthelostpussy.*;



/**
 *
 * @author daddi
 */
public class ShootArrow extends Thread implements KeyListener{
    public static ShootArrow instance = null;
    public boolean isRunning = true;
    public ShootArrow() {
        instance = this;
        GameWindow.instance.addKeyListener(this);
        GameWindow.instance.setFocusable(true);
    }
    
    @Override
    public void run() {

    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
       
        if(KeyEvent.VK_LEFT == ke.getKeyCode())
        {
            MainCharacter.instance.direction = Direction.LEFT;
            MainCharacter.instance.Shoot();
        }
        else if(KeyEvent.VK_RIGHT == ke.getKeyCode())
        {
            MainCharacter.instance.direction = Direction.RIGHT;
            MainCharacter.instance.Shoot();
        }
        else if(KeyEvent.VK_UP== ke.getKeyCode())
        {
            MainCharacter.instance.direction = Direction.UP;
            MainCharacter.instance.Shoot();
        }
        else if(KeyEvent.VK_DOWN == ke.getKeyCode())
        {
            MainCharacter.instance.direction = Direction.DOWN;
            MainCharacter.instance.Shoot();
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }
    public void kill()
    {
        isRunning = false;
    }
}