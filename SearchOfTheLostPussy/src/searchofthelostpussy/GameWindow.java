/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchofthelostpussy;

import Component.GameObject;
import Component.LevelInstantiator;
import Controller.CanShooter;
import Controller.CollisionDetectorEnemy;
import Controller.CollisionDetectorProjectile;
import Controller.CollisionDetectorWall;
import Controller.Gravity;
import Controller.ProjectileMovement;
import Model.ElementInGame;
import View.MainCharacter;
import View.Projectile;
import View.Wall;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author daddi
 */
public class GameWindow extends JPanel {
    MainCharacter a;
    public static GameWindow instance = null;
    public GameWindow()
    {
        instance = this;
        this.setPreferredSize(new Dimension(1280,720));
        new LevelInstantiator("Prova.txt");
        new Gravity().start();
        new CollisionDetectorWall().start();
        new CollisionDetectorEnemy().start();
        new CollisionDetectorProjectile().start();
        new ProjectileMovement().start();
        new CanShooter().start();
    }
    @Override
    public void paintComponent(Graphics g)
    {

            super.paintComponent(g);
            for (Object object : ElementInGame.ElementInGame) 
            {
                GameObject gameObject = ((GameObject)object);
                g.drawRect(gameObject.posizione.x, gameObject.posizione.y, gameObject.hitBox.height, gameObject.hitBox.width);
            }
            for (Object object : ElementInGame.WallInGame)
            {
                Wall wall = ((Wall)object);
                g.drawRect(wall.posizione.x, wall.posizione.y, wall.height , wall.width);           
            }
            for (Object object : ElementInGame.ProjectileInGame)
            {
                Projectile projectile = ((Projectile)object);
                g.drawRect(projectile.posizione.x, projectile.posizione.y, projectile.height , projectile.width);           
            }
            
    }
    
}
