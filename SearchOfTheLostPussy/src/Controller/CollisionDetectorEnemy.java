/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Component.GameObject;
import Model.ElementInGame;
import View.MainCharacter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daddi
 */
public class CollisionDetectorEnemy extends Thread {
    public static CollisionDetectorEnemy instance = null;
    public boolean isRunning = true;
    public CollisionDetectorEnemy(){
        instance = this;
    }
    
    public void run()
    {
        while(isRunning)
        {
            try
            {
                for (Object object : ElementInGame.ElementInGame) {
                    GameObject gameObject = (GameObject)object;
                    if(gameObject.isEnemy && gameObject.hitBox.intersects(MainCharacter.instance.hitBox))
                    {
                        MainCharacter.instance.TakeDamage(gameObject.dmg);
                        try {
                            Thread.sleep(1200);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(CollisionDetectorEnemy.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
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
