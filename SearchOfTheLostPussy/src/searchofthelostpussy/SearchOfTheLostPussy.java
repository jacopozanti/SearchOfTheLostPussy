/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchofthelostpussy;

import Component.LevelInstantiator;
import Controller.CanShooter;
import Controller.CollisionDetectorEnemy;
import Controller.CollisionDetectorProjectile;
import Controller.CollisionDetectorWall;
import Controller.Gravity;
import Controller.ProjectileMovement;
import Controller.Wasd;
import View.Enemy;
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
    public static JFrame gameFrame;
    public static void main(String[] args) {
        gameFrame = new JFrame();
        GameWindow gameWindow = new GameWindow();
        gameFrame.add(gameWindow);
        gameFrame.pack();
        gameFrame.setVisible(true);
        gameFrame.setResizable(false);
        gameFrame.setDefaultCloseOperation(3);
        //new Enemy(90,30);

        while(true)
        {
            gameWindow.repaint();
            try {
                Thread.sleep(15);
            } catch (InterruptedException ex) {
                Logger.getLogger(SearchOfTheLostPussy.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}
