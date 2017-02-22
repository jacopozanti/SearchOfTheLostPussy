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
    ImageIcon imgSelected = null;
    JButton[] textButton = new JButton[20];
    
    ImageIcon imgCancel = new ImageIcon(new ImageIcon("Img/imgCross.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)); 
//new ImageIcon("Img/imgCross.png");
    /*ImageIcon imageForOne = new ImageIcon(getClass().getResource("resources//one.png"));
    ImageIcon imageForOned = new ImageIcon(getClass().getResource("resources//one.png"));
    ImageIcon imageForOnef = new ImageIcon(getClass().getResource("resources//one.png"));*/
    
    public TexturePanel(){
        
        this.setSize(new Dimension(800,70));
        this.setLayout(new GridLayout(10,2));
        
        for (int i = 0; i < 19; i++) {
            
            textButton[i] = new JButton("Text" + (i + 1), new ImageIcon(new ImageIcon("Img/imgBlock"+i+".png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
            textButton[i].setPreferredSize(new Dimension(80,64));
            
            this.add(textButton[i]);                    
        }
        
        this.add(textButton[19] = new JButton("Cancel", imgCancel));
        
        textButton[0].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[0].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock0.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[1].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[1].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock1.png").getImage().getScaledInstance(64, 64, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[2].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[2].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock2.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[3].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[3].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock3.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[4].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[4].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock4.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[5].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[5].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock5.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[6].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[6].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock6.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[7].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[7].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock7.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[8].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[8].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock8.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[9].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[9].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock9.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[10].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[10].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBloc10.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[11].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[11].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock11.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[12].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[12].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock12.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[13].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[13].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock13.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[14].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[14].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock14.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[15].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[15].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock15.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[16].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[16].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock16.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[17].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[17].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock17.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[18].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = textButton[18].getText();
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgBlock18.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
        textButton[19].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Selected = "";
                    imgSelected = new ImageIcon(new ImageIcon("Img/imgCross.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
                }
            });
        
    }
    
    public String getSelected(){
        return Selected;
    }
    
}
