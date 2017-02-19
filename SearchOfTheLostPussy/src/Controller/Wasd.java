/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.*;
import java.awt.event.*;
import java.util.logging.*;
import searchofthelostpussy.*;



/**
 *
 * @author daddi
 */
public class Wasd extends Thread implements KeyListener{
    
    public Wasd() {
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
        int Where = 0;
        
        if (KeyEvent.VK_A == ke.getKeyCode()) {
            MainCharacter.instance.MoveLeft(5);
        }
        
        if (KeyEvent.VK_S == ke.getKeyCode()) {
            MainCharacter.instance.MoveDown(5);
        }
        
        if (KeyEvent.VK_D == ke.getKeyCode()) {
            MainCharacter.instance.MoveRight(5);
        }
        
        if (KeyEvent.VK_W == ke.getKeyCode()) {
            MainCharacter.instance.MoveUp(5);
        }
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }
}