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

/**
 *
 * @author j.zanti
 */
public interface GameObject {
    public enum Direction
    {
        RIGHT,
        LEFT,
        UP,
        DOWN
    }
    public boolean isWall = false;
    public Rectangle hitBox = null;
    public Point posizione = null;
    public boolean animable = false;
    public List<BufferedImage> movimentoSX = null;
    public List<BufferedImage> movimentoDX = null;
    public List<BufferedImage> attacco = null;
    public int height = 0;
    public int width = 0;
    //public Thread jump = null;
    public boolean canMoveDX = false;
    public boolean canMoveSX = false;
    public boolean canMoveUP = false;
    public boolean canMoveDW = false;
    public Direction direction = null;
    public Thread movement = null;
    public Thread collision = null;
    public int speed = 0;
    public int life = 0;
    
    //MOVIMENTI
    public void MoveLeft(int movement);
    public void MoveRight(int movement);
    public void MoveUp(int movement);
    public void MoveDown(int movement);
    
        
    
}
