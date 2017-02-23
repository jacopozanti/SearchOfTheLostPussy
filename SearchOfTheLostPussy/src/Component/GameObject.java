/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Component;

import java.util.List;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;

/**
 *
 * @author j.zanti
 */
public abstract class GameObject {
    public enum Direction
    {
        RIGHT,
        LEFT,
        UP,
        DOWN
    };
    public ImageIcon image = null;
    public boolean isEnemy = false;
    public boolean isWall = false;
    public Rectangle hitBox = null;
    public Point posizione = null;
    public boolean animable = false;
    public List<ImageIcon> movimentoSX = null;
    public List<ImageIcon> movimentoDX = null;
    public List<ImageIcon> attacco = null;
    public int height = 0;
    public int width = 0;
    public Thread jump;
    public boolean canMoveDX = false;
    public boolean canMoveSX = false;
    public boolean canMoveUP = false;
    public boolean canMoveDW = false;
    public boolean canJump = false;
    public Direction direction = Direction.RIGHT;
    public Thread movement = null;
    public Thread collision = null;
    public int speed = 0;
    public int life = 0;
    public int dmg;
    public boolean moveRx = true;
    public boolean canShoot = false;
    //MOVIMENTI
    public abstract void MoveLeft(int movement);
    public abstract void MoveRight(int movement);
    public abstract void MoveUp(int movement);
    public abstract void MoveDown(int movement);
    public abstract void RepositionHitBox();
    public abstract void TakeDamage(int dmg);
    public abstract void Shoot();
}
