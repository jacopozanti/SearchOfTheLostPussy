/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.ElementInGame;
import View.Wall;

/**
 *
 * @author j.zanti
 */
public class CollisionDetectorWall extends Thread {
    
    public void run()
    {
        while(true)
        {
            for (Object object : ElementInGame.WallInGame) 
            {
                Wall wall = ((Wall)object);
                for (Object object : col) {
                    
                }
            }
        }
    }
    
}
