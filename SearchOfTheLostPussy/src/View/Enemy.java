/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Component.GameObject;
import java.awt.Rectangle;

/**
 *
 * @author j.zanti
 */
public class Enemy extends GameObject{

    
    public Enemy(int x, int y)
    {
        hitBox = new Rectangle(50,50);
        posizione = new Point(x,y);
        animable = true;
        height = 50;
        width = 50;
        canMoveDX = true;
        canMoveSX = true;
        canMoveUP = true;
        canMoveDW = true;
        

    }
    
    
    @Override
    public void MoveLeft(int movement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MoveRight(int movement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MoveUp(int movement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void MoveDown(int movement) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
