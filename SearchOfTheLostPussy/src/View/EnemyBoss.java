/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Component.GameObject;
import Controller.AI;
import Controller.Jump;
import Model.ElementInGame;
import java.awt.Point;
import java.awt.Rectangle;

/**
 *
 * @author j.zanti
 */
//public class EnemyBoss extends GameObject{
//    public static EnemyBoss instance;
//    
//    public Projectile cat = new Projectile(this.posizione.x + this.width/2, this.posizione.y + this.height/2, this.direction, true, true);
//    
//    public EnemyBoss(int x, int y)
//    {
//        instance = this;
//        isEnemy = true;
//        hitBox = new Rectangle(50,50);
//        posizione = new Point(x,y);
//        RepositionHitBox();        
//        animable = false;
//        height = 50;
//        width = 50;
//        canMoveDX = false;
//        canMoveSX = false;
//        canMoveUP = false;
//        canMoveDW = false;
//        direction = GameObject.Direction.LEFT;
//        life = 3;
//        if(AI.istance == null)
//        {
//            new AI().start();
//        }
//        ElementInGame.ElementInGame.add(this);
//        dmg = 5;
//        jump = new Jump();
//        canShoot = true;
//    }
//    
//    
//    @Override
//    public void MoveLeft(int movement) {
//
//    }
//
//    @Override
//    public void MoveRight(int movement) {
//
//    }
//
//    @Override
//    public void MoveUp(int movement) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void MoveDown(int movement) {
//
//    }
//
//    @Override
//    public void RepositionHitBox() {
//        hitBox.x = posizione.x;
//        hitBox.y = posizione.y;
//    }
//    
//    public void Shoot()
//    {
//        if(canShoot)
//        {
//            canShoot = false;
//            if(MainCharacter.instance.hitBox.x < cat.posizione.x)
//            {
//                direction = GameObject.Direction.LEFT;
//            }
//            else if(MainCharacter.instance.hitBox.x > cat.posizione.x)
//            {
//                direction = GameObject.Direction.RIGHT;
//            }
//            else if(MainCharacter.instance.hitBox.y < cat.posizione.y){
//                direction = GameObject.Direction.UP;
//            }
//            else if(MainCharacter.instance.hitBox.y > cat.posizione.y){
//                direction = GameObject.Direction.DOWN;
//            }
//            
//        }
//    }
//
//    @Override
//    public void TakeDamage(int dmg) {
//        life -= dmg;
//        if(life < 0)
//        {
//            ElementInGame.ElementInGame.remove(this);
//        }
//    }
//    
//}
