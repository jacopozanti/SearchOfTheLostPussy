/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.event.*;


/**
 *
 * @author daddi
 */
public class Wasd extends Thread implements KeyListener{
    public Wasd()
    {
        
    }
    
    public void run()
    {
        
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        int key = ke.getKeyCode();

        if (key == KeyEvent.VK_A) {
            System.out.println("A");
        }
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        
    }

    @Override
    public void keyReleased(KeyEvent ke) {

    }
}
