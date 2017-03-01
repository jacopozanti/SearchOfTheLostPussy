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
public class CanShooter extends Thread{
    public static CanShooter instance = null;
    
    public CanShooter(){
        instance = this;
    }
    public void run()
    {
        while(true)
        {
            for (Object objectIn : ElementInGame.ElementInGame) {
                GameObject gameObject = (GameObject)objectIn;
                gameObject.canShoot = true;
                MainCharacter.instance.canShoot = true;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CanShooter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
