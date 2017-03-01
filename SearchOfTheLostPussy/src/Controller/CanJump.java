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
 * @author j.zanti
 */
public class CanJump extends Thread{
    
    public static CanJump instance = null;
    public boolean isRunning = true;
    public CanJump(){
        instance = this;
    }
    
    public void run()
    {
        while(isRunning)
        {
            MainCharacter.instance.canJump = true;            
            try {
                Thread.sleep(800);
            } catch (InterruptedException ex) {
                Logger.getLogger(CanShooter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public void kill()
    {
        isRunning = false;
    }
}
