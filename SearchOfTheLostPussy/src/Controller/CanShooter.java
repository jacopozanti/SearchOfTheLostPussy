/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.MainCharacter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author daddi
 */
public class CanShooter extends Thread{
    public void run()
    {
        while(true)
        {
            MainCharacter.instance.canShoot = true;
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CanShooter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
