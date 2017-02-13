/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchofthelostpussy;

import Component.GameObject;
import Model.ElementInGame;
import View.MainCharacter;
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
            for (Object object : ElementInGame.ElementInGame) {
                g.drawRect(((GameObject)object).posizione.x, ((GameObject)object).posizione.y, ((GameObject)object).hitBox.height, ((GameObject)object).hitBox.width);
            }
            
    }
    
}
