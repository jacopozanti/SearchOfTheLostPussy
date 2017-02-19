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
    public static void main(String[] args) {
        JFrame gameFrame = new JFrame();
        GameWindow gameWindow = new GameWindow();
        gameFrame.add(gameWindow);
        gameFrame.pack();
        gameFrame.setVisible(true);
        gameFrame.setResizable(false);
        gameFrame.setDefaultCloseOperation(3);
        new Enemy(90,30);
        new LevelInstantiator("Prova.txt");
        new Gravity().start();
        new CollisionDetectorWall().start();
        new CollisionDetectorEnemy().start();
        new CollisionDetectorProjectile().start();
        new ProjectileMovement().start();
        new CanShooter().start();
        while(true)
        {
            gameWindow.repaint();
        }
        
    }
    
}
