/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Component.GameObject;
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
                for (Object objectIn : ElementInGame.ElementInGame) {
                    GameObject gameObject = ((GameObject)objectIn);
                    if(gameObject.hitBox.intersects(wall.hitBox))
                    {
                        if(gameObject.posizione.x > wall.posizione.x)
                        {
                            gameObject.canMoveSX = false;
                        }
                        else
                        {
                            gameObject.canMoveDX = false;
                        }
                        if(gameObject.hitBox.y < wall.hitBox.y + wall.hitBox.height)
                        {
                            gameObject.canMoveUP = false;
                        }
                        if(gameObject.hitBox.y + gameObject.hitBox.height < wall.hitBox.y)
                        {
                            gameObject.canMoveUP = false;                           
                        }
                    }
                    gameObject.canMoveDX = true;
                    gameObject.canMoveSX = true;
                    gameObject.canMoveUP = true;
                    gameObject.canMoveDW = true;                    
                   
                }
            }
        }
    }

    
}
