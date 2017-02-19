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
    
    public AI()
    {
        istance = this;
    }
    
    @Override
    public void run()
    {
        while(true)
        {
            for (Object object : ElementInGame.ElementInGame) {
                GameObject gameObject = (GameObject)object;
                if(gameObject.isEnemy)
                {
                    if(gameObject.canMoveDX)
                        gameObject.MoveRight(1);
                    else
                        gameObject.MoveLeft(1);
                }
            }
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(AI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
