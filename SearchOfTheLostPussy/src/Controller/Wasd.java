/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Component.GameObject;
import Component.GameObject.Direction;
import Component.LevelInstantiator;
import View.*;
import java.awt.event.*;
import java.util.logging.*;
import searchofthelostpussy.*;



/**
 *
 * @author daddi
 */
public class Wasd extends Thread implements KeyListener{
    public static Wasd instance = null;
    private KeyEvent keyPressed = null;
    public boolean isRunning = true;
    public Wasd() {
        instance = this;
        GameWindow.instance.addKeyListener(this);
        GameWindow.instance.setFocusable(true);
    }
    
    @Override
    public void run() {
        while(isRunning)
        {
            if(keyPressed != null)
            {
                if(keyPressed.getKeyCode() == KeyEvent.VK_D)
                    MainCharacter.instance.MoveRight(10);
                else if(keyPressed.getKeyCode() == KeyEvent.VK_A)
                    MainCharacter.instance.MoveLeft(10);
            }
            try {
                Thread.sleep(20);
            } catch (InterruptedException ex) {
                Logger.getLogger(Wasd.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
        if (KeyEvent.VK_A == ke.getKeyCode()) {
            keyPressed = ke;   
        }
        
        else if (KeyEvent.VK_S == ke.getKeyCode()) {
            keyPressed = ke;   
        }
        
        else if (KeyEvent.VK_D == ke.getKeyCode()) {
            keyPressed = ke;   
        }
        
        else if (KeyEvent.VK_W == ke.getKeyCode()) {
            
            if(MainCharacter.instance.canJump && !MainCharacter.instance.canMoveDW)
            {

                MainCharacter.instance.jump.interrupt();
                try {
                    MainCharacter.instance.jump.join();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Wasd.class.getName()).log(Level.SEVERE, null, ex);
                }
                MainCharacter.instance.jump = new Jump();
                MainCharacter.instance.jump.start();
                MainCharacter.instance.canJump = false;
            }
        }
        else if(KeyEvent.VK_U == ke.getKeyCode())
        {
            LevelInstantiator.instance.ChangeLvl('+');
        }


    }

    @Override
    public void keyReleased(KeyEvent ke) {
        keyPressed = null;
    }
    public void kill()
    {
        isRunning = false;
    }
}