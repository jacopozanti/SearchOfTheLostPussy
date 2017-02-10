/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapmaker;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author d.gozzi
 */
public class MainPanel extends JPanel{
    
    JButton[][] mainButton = new JButton[16][13];
    
    public MainPanel(){
        
        for (int i = 0; i < 16; i++) {
            
            for (int j = 0; j < 13; j++) {
                mainButton[i][j]=new JButton();
                mainButton[i][j].setPreferredSize(new Dimension(64,64));
                mainButton[i][j].setMargin(new Insets(0, 0, 0, 0));
                mainButton[i][j].setFocusPainted(false);
                mainButton[i][j].setBorder(new EmptyBorder(0, 0, 0, 0));
                
                this.add(mainButton[i][j]);
                
            }
            
        }
        
    }
    
}
