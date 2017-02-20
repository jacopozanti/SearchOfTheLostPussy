/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Component.GameObject;
import Model.ElementInGame;
import View.Wall;
import java.awt.Point;

/**
 *
 * @author j.zanti
 */
public class CollisionDetectorWall extends Thread {
    private boolean isTouchingDS = false;
    private boolean isTouchingUPDW = false;
    public void run()
    {
        while(true)
        {
            try
            {
                for (Object objectIn : ElementInGame.ElementInGame) 
                {
                    GameObject gameObject = ((GameObject)objectIn);
                    isTouchingUPDW = false;
                    isTouchingDS = false;
                    for (Object object : ElementInGame.WallInGame) {
                        Wall wall = ((Wall)object);
                        if(gameObject.hitBox.intersects(wall.hitBox))
                        {

                            if(gameObject.posizione.x > wall.posizione.x)
                            {
                                if(wall.hitBox.contains(new Point(gameObject.hitBox.x,gameObject.hitBox.y + gameObject.hitBox.height/2)))
                                {
                                    gameObject.canMoveSX = false;
                                    isTouchingDS = true;
                                }
                            }
                            else
                            {
                                if(wall.hitBox.contains(new Point(gameObject.hitBox.x + gameObject.hitBox.width,gameObject.hitBox.y + gameObject.hitBox.height/2)))
                                {
                                    gameObject.canMoveDX = false;
                                    isTouchingDS = true;
                                }
                            }
                            if(gameObject.hitBox.y < wall.hitBox.y + wall.hitBox.height)
                            {
                                gameObject.canMoveDW = false;
                                isTouchingUPDW=true;
                            }
                            if(gameObject.hitBox.y + gameObject.hitBox.height < wall.hitBox.y)
                            {
                                gameObject.canMoveUP = false;   
                                isTouchingUPDW=true;
                            }
                            
                        }


                    }
                if(!isTouchingDS)
                {
                    gameObject.canMoveDX = true;
                    gameObject.canMoveSX = true;                    
                }
                if(!isTouchingUPDW)
                {
                    gameObject.canMoveUP = true;
                    gameObject.canMoveDW = true;
                }
                }
            }
            catch(Exception ex)
            {
            }
        }
    }

    
}
