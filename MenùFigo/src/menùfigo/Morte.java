/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menùfigo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author elmahdi
 */
public class Morte extends JPanel{
    
    
    
    
    private JLabel morte = new JLabel();
    private JLabel tomba = new JLabel();
    private JLabel personaggio = new JLabel();

    
    public Morte() throws IOException{

       
    morte.setIcon(new ImageIcon(getClass().getResource("morte.gif")));
    morte.setVisible(true);
    this.add(morte);
       
    tomba.setIcon(new ImageIcon(getClass().getResource("morte2.png")));
    tomba.setVisible(true);
    this.add(tomba);
           
    personaggio.setFont(new Font("TimesRoman", Font.PLAIN, 15)); 
    personaggio.setText(Storia.sceltaPG);
    personaggio.setForeground(Color.DARK_GRAY);
    this.add(personaggio);
  
    this.setBackground(Color.black);
    this.setLayout(null);
    settaValori2();
    
    }

    public void  settaValori2(){
               
            
             morte.setBounds(400,400 , morte.getIcon().getIconWidth(), morte.getIcon().getIconHeight());
            tomba.setBounds(400,500 , tomba.getIcon().getIconWidth(), tomba.getIcon().getIconHeight());
            personaggio.setBounds(400, 300, 400 , 100 );
            personaggio.setText("PERSONAGGIO ATTUALE:"+Storia.sceltaPG);
              
}
}
