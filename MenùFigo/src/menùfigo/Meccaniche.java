/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menùfigo;

//qui ho richiamato tutti gli import utili al programma 
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import static menùfigo.MenùFigo.jf3;

/**
 *
 * @author e.khalifi
 */

public class Meccaniche extends JPanel{
    
    int grandezzaGioca=115;
    int grandezzaPersonalizza=30;
    int grandezzaStoria=30;
    int grandezzaComandi=30;
    int grandezzaCredits=30;
    int grandezzaEsci=30; 
    private JLabel personaggio = new JLabel();
    private JLabel pannelloGioca = new JLabel();
    private JLabel pannelloPersonalizza = new JLabel();
    private JLabel pannelloStoria = new JLabel();
    private JLabel pannelloComandi = new JLabel();
    private JLabel pannelloCredits = new JLabel();
    private JLabel pannelloEsci = new JLabel();

    
    public Meccaniche() throws IOException{

    pannelloGioca.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaGioca)); 
    pannelloGioca.setText("GIOCA");
    pannelloGioca.setForeground(Color.black);
    this.add(pannelloGioca);
       
    pannelloPersonalizza.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaPersonalizza)); 
    pannelloPersonalizza.setText("PERSONALIZZA");
    pannelloPersonalizza.setForeground(Color.black);
    this.add(pannelloPersonalizza);
       
    pannelloStoria.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaStoria)); 
    pannelloStoria.setText("STORIA");
    pannelloStoria.setForeground(Color.black);
    this.add(pannelloStoria);
       
    pannelloComandi.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaComandi)); 
    pannelloComandi.setText("COMANDI");
    pannelloComandi.setForeground(Color.black);
    this.add(pannelloComandi);
       
    pannelloCredits.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaCredits)); 
    pannelloCredits.setText("CREDITS");
    pannelloCredits.setForeground(Color.black);
    this.add(pannelloCredits);
       
    pannelloEsci.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaEsci)); 
    pannelloEsci.setText("ESCI");
    pannelloEsci.setForeground(Color.black);
    this.add(pannelloEsci);
           
    personaggio.setFont(new Font("TimesRoman", Font.PLAIN, 15)); 
    personaggio.setText("PERSONAGGIO ATTUALE:"+Storia.sceltaPG);
    personaggio.setForeground(Color.red);
    this.add(personaggio);
    
    pannelloGioca.addMouseListener(new MouseListener(){

           @Override
           public void mouseClicked(MouseEvent me) {
             new Musica("effetto2.wav").start();JOptionPane.showMessageDialog(null,"giocatore: "+Storia.sceltaPG);  
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void mousePressed(MouseEvent me) {
        //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void mouseReleased(MouseEvent me) {
//               throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

           @Override
           public void mouseEntered(MouseEvent me) {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
             
             pannelloGioca.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaGioca+15));  
             new Musica("effetto.wav").start();
             pannelloGioca.setForeground(Color.red);
           
               
           }

           @Override
           public void mouseExited(MouseEvent me) {

           pannelloGioca.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaGioca)); 
           pannelloGioca.setForeground(Color.black);
            
             
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           }

       
     
            });
    
    pannelloPersonalizza.addMouseListener(new MouseListener() {

         @Override
         public void mouseClicked(MouseEvent me) {
           new Musica("effetto2.wav").start();
        JOptionPane.showMessageDialog(null,"giocatore: "+Storia.sceltaPG);
         // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mousePressed(MouseEvent me) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseReleased(MouseEvent me) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseEntered(MouseEvent me) {
                new Musica("effetto.wav").start();   
                pannelloPersonalizza.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaPersonalizza+10));
                pannelloPersonalizza.setForeground(Color.green);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseExited(MouseEvent me) {
                      pannelloPersonalizza.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaPersonalizza));
                      pannelloPersonalizza.setForeground(Color.black);
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     });
    
    pannelloStoria.addMouseListener(new MouseListener() {

         @Override
         public void mouseClicked(MouseEvent me) {
             new Musica("effetto2.wav").start();
           MenùFigo.jf.setVisible(false);
           MenùFigo.jf4.setVisible(true);
            
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mousePressed(MouseEvent me) {
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseReleased(MouseEvent me) {
             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseEntered(MouseEvent me) {
        new Musica("effetto.wav").start();   
        pannelloStoria.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaStoria+10));   
        pannelloStoria.setForeground(Color.yellow);        
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseExited(MouseEvent me) {
            pannelloStoria.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaStoria));           
            pannelloStoria.setForeground(Color.black);
           // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     });
    
    pannelloComandi.addMouseListener(new MouseListener() {

         @Override
         public void mouseClicked(MouseEvent me) {
           new Musica("effetto2.wav").start();
           MenùFigo.jf.setVisible(false);
           MenùFigo.jf2.setVisible(true);
         // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mousePressed(MouseEvent me) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseReleased(MouseEvent me) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseEntered(MouseEvent me) {
                new Musica("effetto.wav").start();  
                pannelloComandi.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaComandi+10));
                pannelloComandi.setForeground(Color.blue);
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseExited(MouseEvent me) {
                pannelloComandi.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaComandi));
                pannelloComandi.setForeground(Color.black);
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     });
      
    pannelloCredits.addMouseListener(new MouseListener() {

         @Override
         public void mouseClicked(MouseEvent me) {
           MenùFigo.jf.setVisible(false);
           MenùFigo.jf3.setVisible(true);
           MenùFigo.jf3.setEnabled(true);
             
           new Musica("effetto2.wav").start(); //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mousePressed(MouseEvent me) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseReleased(MouseEvent me) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseEntered(MouseEvent me) {
                 new Musica("effetto.wav").start(); 
                 pannelloCredits.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaCredits+10));  
                 pannelloCredits.setForeground(Color.orange);

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseExited(MouseEvent me) {
                                   pannelloCredits.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaCredits));   
                                    pannelloCredits.setForeground(Color.black);

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     });
    
    pannelloEsci.addMouseListener(new MouseListener() {

         @Override
         public void mouseClicked(MouseEvent me) {
            new Musica("esci.wav").start();  System.exit(1); //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mousePressed(MouseEvent me) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseReleased(MouseEvent me) {
             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseEntered(MouseEvent me) {
            new Musica("effetto.wav").start();   
            pannelloEsci.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaEsci+10)); 
                                  pannelloEsci.setForeground(Color.white);

// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }

         @Override
         public void mouseExited(MouseEvent me) {
                       pannelloEsci.setFont(new Font("TimesRoman", Font.PLAIN, grandezzaEsci));           
                      pannelloEsci.setForeground(Color.black);
//             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         }
     });
    
     JLabel background = new JLabel (new ImageIcon ( "sfondod.png")); 
    background.setSize(1000,700);
    background.setVisible(true);
    this.add(background);
    
    
    this.setLayout(null);
    settaValori();
    
    }

    public void  settaValori(){
               
            pannelloGioca.setBounds(520, 380, this.grandezzaGioca + 400, this.grandezzaGioca );
            pannelloPersonalizza.setBounds(530, 485, this.grandezzaPersonalizza + 300, this.grandezzaPersonalizza+10 );
            pannelloStoria.setBounds(530, 520, this.grandezzaStoria + 250, this.grandezzaStoria+10 );
            pannelloComandi.setBounds(530, 550, this.grandezzaComandi + 250, this.grandezzaComandi+10 );
            pannelloCredits.setBounds(530, 580, this.grandezzaCredits + 250, this.grandezzaCredits+10 );
            pannelloEsci.setBounds(530, 610, this.grandezzaEsci + 250, this.grandezzaEsci+10 );
            personaggio.setBounds(10, 400, this.grandezzaEsci+350 , this.grandezzaEsci+10 );
            personaggio.setText("PERSONAGGIO ATTUALE:"+Storia.sceltaPG);
              
}
}