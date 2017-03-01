/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.ElementInGame;
import java.awt.Image;
import java.awt.Point;
import javax.swing.ImageIcon;

/**
 *
 * @author j.zanti
 */
public class Health {
    public static Health health = null;
    public ImageIcon img;
    public Point position;
    public Health()
    {
        if(health == null)
        {
            health = this;
            ElementInGame.HudInGame.add(this);
        }
        img = new ImageIcon(new ImageIcon("Img/Heart.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
        position = new Point(10,10);
    }
}
