/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchofthelostpussy;

import Component.LevelInstantiator;
import View.Wall;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author BiPolar_Bears
 */
public class SearchOfTheLostPussy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame gameFrame = new JFrame();
        GameWindow gameWindow = new GameWindow();
        gameFrame.add(gameWindow);
        gameFrame.pack();
        gameFrame.setVisible(true);
        gameFrame.setDefaultCloseOperation(3);

        new LevelInstantiator();
        
        while(true)
        {
            gameWindow.repaint();
        }
        
    }
    
}
