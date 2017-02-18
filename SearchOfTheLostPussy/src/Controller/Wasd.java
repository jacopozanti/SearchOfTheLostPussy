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
    
    char movement = 'w';
    
    public void run()
    {
        while(true){
            if(movement == 'w' || movement == 'W'){
                System.out.println("Premo W");
            }

            if(movement == 'a' || movement == 'A'){
                System.out.println("Premo W");
            }

            if(movement == 's' || movement == 'S'){
                System.out.println("Premo W");
            }

            if(movement == 'd' || movement == 'D'){
                System.out.println("Premo W");
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        movement = (char)ke.getKeyCode();
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        movement = ke.getKeyChar();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
