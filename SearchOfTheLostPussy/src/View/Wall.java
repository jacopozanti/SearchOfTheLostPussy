/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Component.GameObject;
import Model.ElementInGame;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author j.zanti
 */
public class Wall extends GameObject {
    
    public Wall(int x, int y)
    {
        this.height = 64 ;
        this.width = 64;
        this.isWall = true;
        this.hitBox = new Rectangle(height, width);
        this.posizione = new Point(x, y);
        this.animable = false;
        image = new ImageIcon(new ImageIcon("Img/imgBlock0.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        RepositionHitBox();
        ElementInGame.WallInGame.add(this);
    }
    
    public Wall(int x, int y, String img){
        this.height = 64 ;
        this.width = 64;
        this.isWall = true;
        this.hitBox = new Rectangle(height, width);
        this.posizione = new Point(x, y);
        this.animable = false;
        image = new ImageIcon(new ImageIcon("Img/img"+img+".png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        RepositionHitBox();
        ElementInGame.WallInGame.add(this);
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

    @Override
    public void RepositionHitBox() {
        hitBox.x = posizione.x;
        hitBox.y = posizione.y;
    }

    @Override
    public void TakeDamage(int dmg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Shoot() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
