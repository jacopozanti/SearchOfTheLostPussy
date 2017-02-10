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
public class TexturePanel extends JPanel{
    
    String Selected = "";
    JButton[] textButton = new JButton[20];
    
    public TexturePanel(){
        
        this.setSize(new Dimension(800,70));
        this.setLayout(new GridLayout(10,2));
        
        for (int i = 0; i < 20; i++) {
            
            textButton[i] = new JButton("Text" + (i + 1));
            textButton[i].setPreferredSize(new Dimension(80,64));
            
            this.add(textButton[i]);                    
        }
        
        textButton[0].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[0].getText();
                }
            });
        
        textButton[1].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[1].getText();
                }
            });
        
        textButton[2].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[2].getText();
                }
            });
        
        textButton[3].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[3].getText();
                }
            });
        
        textButton[4].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[4].getText();
                }
            });
        
        textButton[5].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[5].getText();
                }
            });
        
        textButton[6].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[6].getText();
                }
            });
        
        textButton[7].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[7].getText();
                }
            });
        
        textButton[8].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[8].getText();
                }
            });
        
        textButton[9].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[9].getText();
                }
            });
        
        textButton[10].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[10].getText();
                }
            });
        
        textButton[11].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[11].getText();
                }
            });
        
        textButton[12].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[12].getText();
                }
            });
        
        textButton[13].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[13].getText();
                }
            });
        
        textButton[14].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[14].getText();
                }
            });
        
        textButton[15].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[15].getText();
                }
            });
        
        textButton[16].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[16].getText();
                }
            });
        
        textButton[17].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[17].getText();
                }
            });
        
        textButton[18].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[18].getText();
                }
            });
        
        textButton[19].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[19].getText();
                }
            });
        
    }
    
    public String getSelected(){
        return Selected;
    }
    
}
