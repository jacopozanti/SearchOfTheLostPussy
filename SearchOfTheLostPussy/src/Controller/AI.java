/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Component.GameObject;
import Model.ElementInGame;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author j.zanti
 */
public class AI extends Thread{
    public static AI istance = null;
    public boolean isRunning = true;
    public AI()
    {
        istance = this;
    }
    
    @Override
    public void run()
    {
        while(isRunning)
        {
            try
            {
                for (Object object : ElementInGame.ElementInGame) {
                    GameObject gameObject = (GameObject)object;
                    if(gameObject.isEnemy)
                    {
                        if(gameObject.moveRx)
                        {
                            if(gameObject.canMoveDX)
                                gameObject.MoveRight(2);
                            else
                                gameObject.moveRx = false;
                        }
                        else
                        {
                            if(gameObject.canMoveSX)
                                gameObject.MoveLeft(2);
                            else
                                gameObject.moveRx = true;  
                        }
                        gameObject.Shoot();
                    }

                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    Logger.getLogger(AI.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
            catch (Exception exception)
            {
            }
        }
    }
    public void kill()
    {
        isRunning = false;
    }
}
