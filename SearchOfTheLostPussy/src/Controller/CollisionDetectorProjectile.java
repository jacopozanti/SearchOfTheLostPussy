/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Component.GameObject;
import Model.ElementInGame;
import View.Projectile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daddi
 */
public class CollisionDetectorProjectile extends Thread{
    
    public void run()
    {
        while(true)
        {
            try
            {
                for (Object object : ElementInGame.ProjectileInGame) {
                    Projectile projectile = (Projectile)object;
                    for (Object objectIn : ElementInGame.ElementInGame) {
                        GameObject gameObject = (GameObject)objectIn;
                        if(gameObject.isEnemy)
                            if(projectile.hitBox.intersects(gameObject.hitBox))
                            {
                                gameObject.TakeDamage(projectile.dmg);
                                projectile.RemoveProjectile();
                            }  
                    }
                }
            }
            catch(Exception ex)
            {
                System.out.println("collsion" + ex);
            }
        }
    }
}
