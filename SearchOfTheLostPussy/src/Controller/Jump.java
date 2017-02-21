/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Component.GameObject.Direction;
import View.MainCharacter;
import static java.lang.Math.sin;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author d.gozzi
 */
public class Jump extends Thread{
    public boolean jumping;
    public Direction direction;
    public Jump()
    {
        jumping = false;
        try
        {
            direction = MainCharacter.instance.facing;
        }
        catch(Exception ex)
        {
            
        }
    }
    public void run()
    {
        jumping = true;
        for(int i = 0;i<=100;i++)
        {
            //MainCharacter.instance.canMoveDW = false;
            MainCharacter.instance.MoveUp(2);
            if(direction == Direction.RIGHT)
                MainCharacter.instance.MoveRight(1);
            else if(direction == Direction.LEFT)
                MainCharacter.instance.MoveLeft(1);
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Jump.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        jumping = false;
        for(int i = 0;i<=100;i++)
        {
            if(direction == Direction.RIGHT)
                MainCharacter.instance.MoveRight(1);
            else if(direction == Direction.LEFT)
                MainCharacter.instance.MoveLeft(1);
            try {
                Thread.sleep(2);
            } catch (InterruptedException ex) {
                Logger.getLogger(Jump.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
