/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapmaker;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author BiPolar_Bears
 */
public class MainPanel extends JPanel{
    
    JButton[][] mainButton = new JButton[20][11];
    
    public MainPanel(TexturePanel textPanel){
        
        this.setLayout(new GridLayout(11,20));
        
        for (int j = 0; j < 11; j++) {
            
            for (int i = 0; i < 20; i++) {
                
                mainButton[i][j]=new JButton();
                mainButton[i][j].setPreferredSize(new Dimension(64,64));
                mainButton[i][j].setMargin(new Insets(0, 0, 0, 0));
                mainButton[i][j].setFocusPainted(false);
                
                this.add(mainButton[i][j]);
                
                mainButton[i][j].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        JButton btn = (JButton)e.getSource();
                        btn.setText(textPanel.getSelected());
                    }
                });
            }
            
        }
        
    }
    
    public String getButtonText(int i, int j){
        return mainButton[i][j].getText();
    }
    
}
