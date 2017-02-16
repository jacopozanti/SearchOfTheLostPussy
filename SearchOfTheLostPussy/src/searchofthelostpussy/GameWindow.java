/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchofthelostpussy;

import Component.GameObject;
import Model.ElementInGame;
import View.MainCharacter;
import View.Wall;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author daddi
 */
public class GameWindow extends JPanel {
    MainCharacter a;

    public GameWindow()
    {
        this.setPreferredSize(new Dimension(1280,720));
        a = new MainCharacter();
    }
    @Override
    public void paintComponent(Graphics g)
    {

            super.paintComponent(g);
            for (Object object : ElementInGame.ElementInGame) 
            {
                GameObject gameObject = ((GameObject)object);
                g.drawRect(gameObject.posizione.x, gameObject.posizione.y, gameObject.hitBox.height, gameObject.hitBox.width);
            }
            for (Object object : ElementInGame.WallInGame)
            {
                Wall wall = ((Wall)object);
                g.drawRect(wall.posizione.x * wall.width, wall.posizione.y, wall.height , wall.width);
                
            }
            
    }
    
}
