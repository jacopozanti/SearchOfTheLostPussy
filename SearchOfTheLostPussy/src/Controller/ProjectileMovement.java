/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ElementInGame;
import View.Projectile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daddi
 */
public class ProjectileMovement extends Thread{
    public static ProjectileMovement instance = null;
    public boolean isRunning = true;
    public ProjectileMovement(){
        instance = this;
    }
    
    public void run()
    {
        while(isRunning)
        {
            try
            {
                for (Object object : ElementInGame.ProjectileInGame) {
                    Projectile projectile = (Projectile)object;
                    switch(projectile.direction)
                    {
                        case LEFT:
                            projectile.MoveLeft(20);
                            break;
                        case RIGHT:
                            projectile.MoveRight(20);
                            break;
                        case UP:
                            projectile.MoveUp(20);
                            break;
                        case DOWN:
                            projectile.MoveDown(20);
                            break;       
                    }
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProjectileMovement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            catch(Exception ex)
            {
            }
        }
    }
    public void kill()
    {
        isRunning = false;
    }
}
