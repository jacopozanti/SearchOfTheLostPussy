/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Component.GameObject;
import Model.ElementInGame;

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
        for (Object object : ElementInGame.ElementInGame) {
            GameObject gameObject = (GameObject)object;
            if(gameObject.isEnemy)
            {
                gameObject.MoveLeft(10);
            }
        }
    }
}
