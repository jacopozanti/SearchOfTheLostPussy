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
public class Gravity extends Thread{
    public static Gravity instance = null;
    public boolean isRunning = true;
    public Gravity(){
        instance = this;
    }
    public void run()
    {
        while(isRunning)
        {
            for (Object object : ElementInGame.ElementInGame) {
                GameObject gameObject = (GameObject)object;
                if(!((Jump)gameObject.jump).jumping)
                {
                    gameObject.MoveDown(3);
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Gravity.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void kill()
    {
        isRunning = false;
    }
}
