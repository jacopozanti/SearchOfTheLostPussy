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
        
        for (int i = 0; i < 11; i++) {
            
            for (int j = 0; j < 20; j++) {
                
                mainButton[j][i]=new JButton(""+j +"/"+ i);
                mainButton[j][i].setPreferredSize(new Dimension(64,64));
                mainButton[j][i].setMargin(new Insets(0, 0, 0, 0));
                mainButton[j][i].setFocusPainted(false);
                
                this.add(mainButton[j][i]);
                
                mainButton[j][i].addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        
                        
                        JButton btn = (JButton)e.getSource();
                        btn.setText(textPanel.getSelected());
                    }
                });
            }
            
        }
        
    }
    
    public String getButtonText(int j, int i){
        return mainButton[j][i].getText();
    }
    
}
