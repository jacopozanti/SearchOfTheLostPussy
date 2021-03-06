/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchofthelostpussy;

import Component.*;
import Controller.*;
import Model.*;
import View.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author daddi
 */
public class GameWindow extends JPanel {
    MainCharacter a;
    public static GameWindow instance = null;
    public ImageIcon backGround;
    public GameWindow()
    {
        instance = this;
        this.setPreferredSize(new Dimension(1280,720));
        startThreads();
        new LevelInstantiator();
        backGround = new ImageIcon(new ImageIcon("Img/BackGround.png").getImage().getScaledInstance(1280, 720, Image.SCALE_DEFAULT));

    }
    
    public void stopThreads(){
        Gravity.instance.kill();
        CollisionDetectorWall.instance.kill();
        CollisionDetectorEnemy.instance.kill();
        CollisionDetectorProjectile.instance.kill();
        ProjectileMovement.instance.kill();
        CanShooter.instance.kill();
    }
    
    public void startThreads(){
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

                g.drawImage(backGround.getImage(), 0, 0, instance);
                //g.drawImage(MainCharacter.instance.image.getImage(), MainCharacter.instance.posizione.x, MainCharacter.instance.posizione.y, this);
                for (Object object : ElementInGame.ElementInGame) 
                {
                    GameObject gameObject = ((GameObject)object);
                    //g.drawRect(gameObject.posizione.x, gameObject.posizione.y, gameObject.hitBox.height, gameObject.hitBox.width);
                    g.drawImage(gameObject.image.getImage(), gameObject.posizione.x, gameObject.posizione.y, this);

                }
                for (Object object : ElementInGame.WallInGame)
                {
                    Wall wall = ((Wall)object);
                    //g.drawRect(wall.posizione.x, wall.posizione.y, wall.height , wall.width);    
                    g.drawImage(wall.image.getImage(), wall.posizione.x, wall.posizione.y, this);
                }
                for (Object object : ElementInGame.ProjectileInGame)
                {
                    Projectile projectile = ((Projectile)object);
                    //g.drawRect(projectile.posizione.x, projectile.posizione.y, projectile.height , projectile.width);           
                    g.drawImage(projectile.image.getImage(), projectile.posizione.x, projectile.posizione.y , this);
                }
                for (Object object : ElementInGame.HudInGame) 
                {
                    Health health = (Health)object;
                    for(int i = 0; i < MainCharacter.instance.life; i++)
                    {
                        g.drawImage(health.img.getImage(), health.position.x + 30*i, health.position.y, this);
                    }
                }

            
    }
    
}
