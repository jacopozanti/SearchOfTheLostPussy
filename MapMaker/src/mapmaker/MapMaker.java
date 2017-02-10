/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapmaker;

import java.awt.Dimension;
import javax.swing.*;

/**
 *
 * @author d.gozzi
 */
public class MapMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JFrame mainFrame = new JFrame("MapMaker");
        MainPanel mainPanel = new MainPanel();
        mainFrame.add(mainPanel);
        mainFrame.setSize(new Dimension(1280,720));
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(3);

        
    }
    
}
