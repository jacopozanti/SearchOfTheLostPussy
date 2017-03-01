/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchofthelostpussy;


import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author BiPolar_Bears
 */
public class SearchOfTheLostPussy {

    /**
     * @param args the command line arguments
     */
    public static JFrame gameFrame;
    public static boolean canRefresh = true;
    public static void main(String[] args) {
        gameFrame = new JFrame();
        GameWindow gameWindow = new GameWindow();
        gameFrame.add(gameWindow);
        gameFrame.pack();
        gameFrame.setVisible(true);
        gameFrame.setResizable(false);
        gameFrame.setDefaultCloseOperation(3);
        //new Enemy(90,30);
        System.setProperty("sun.java2d.opengl", "true");
        while(true)
        {
            if(canRefresh)
            {
                gameWindow.repaint();
            }
            try {
                Thread.sleep(16);
            } catch (InterruptedException ex) {
                Logger.getLogger(SearchOfTheLostPussy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
