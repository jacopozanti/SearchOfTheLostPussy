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
import searchofthelostpussy.GameWindow;

/**
 *
 * @author daddi
 */
public class Projectile extends GameObject {
    public int dmg;
    public boolean enemies;
    public Projectile(int x, int y, Direction dir, boolean en)
    {
        hitBox = new Rectangle(10,10);
        posizione = new Point(x,y);
        height = 10;
        width = 10;
        direction = dir;
        speed = 4;
        dmg = 1;

        enemies = en;
        if(!enemies)
        {
            image = new ImageIcon(new ImageIcon("Img/Shot/zanti.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));
        }
        else
        {
            image = new ImageIcon(new ImageIcon("Img/Shot/gozzi.png").getImage().getScaledInstance(15, 15, Image.SCALE_DEFAULT));   
        }
        ElementInGame.ProjectileInGame.add(this);
    }

    @Override
    public void MoveUp(int movement) {
        this.posizione.y -= movement;
        RepositionHitBox();

    }

        @Override
    public void MoveLeft(int movement) {
        this.posizione.x -= movement;
        RepositionHitBox();
        }

    @Override
    public void MoveRight(int movement) {
        this.posizione.x += movement;
        RepositionHitBox();

    }

    @Override
    public void MoveDown(int movement) {
        
        this.posizione.y += movement;
        RepositionHitBox();
    }
    
    @Override
    public void RepositionHitBox() {
        if(this.posizione.x > GameWindow.instance.getWidth() || this.posizione.x < 0 || this.posizione.y < 0 || this.posizione.y > GameWindow.instance.getHeight())
        {
        }
        hitBox.x = posizione.x;
        hitBox.y = posizione.y;

    }
    public void RemoveProjectile()
    {
        ElementInGame.ProjectileInGame.remove(this);

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
