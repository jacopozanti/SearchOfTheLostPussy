/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Component.GameObject;
import Model.ElementInGame;
import View.MainCharacter;
import View.Projectile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author j.zanti
 */
//public class ProjectileMovementBoss extends ProjectileMovement{
//    public void run(){
//        while(true)
//        {
//            try
//            {
//                for (Object object : ElementInGame.ProjectileInGameBoss) {
//                    Projectile projectile = (Projectile)object;
//                    if(MainCharacter.instance.hitBox.x < EnemyBoss.instance.cat.posizione.x){
//                        EnemyBoss.instance.cat.direction = GameObject.Direction.LEFT;
//                    }
//                    else if(MainCharacter.instance.hitBox.x > EnemyBoss.instance.cat.posizione.x){
//                        EnemyBoss.instance.cat.direction = GameObject.Direction.RIGHT;
//                    }
//                    else if(MainCharacter.instance.hitBox.y < EnemyBoss.instance.cat.posizione.y){
//                        EnemyBoss.instance.cat.direction = GameObject.Direction.UP;
//                    }
//                    else if(MainCharacter.instance.hitBox.y > EnemyBoss.instance.cat.posizione.y){
//                        EnemyBoss.instance.cat.direction = GameObject.Direction.DOWN;       
//                    }
//                }
//                try {
//                    Thread.sleep(10);
//                } catch (InterruptedException ex) {
//                    Logger.getLogger(ProjectileMovement.class.getName()).log(Level.SEVERE, null, ex);
//                }
//            catch(Exception ex)
//            {
//            }
//        }
//        catch(Exception ex)
//        {
//        }
//    }
//    }
//}
