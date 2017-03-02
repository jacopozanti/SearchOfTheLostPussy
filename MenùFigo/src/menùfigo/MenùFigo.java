/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menùfigo;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author e.khalifi
 */


public class MenùFigo {
//istanzio tutti i frame
static JFrame jf = new JFrame("MENU");
static JFrame jf2 = new JFrame("COMANDI");
static StarWars jf3 = new StarWars ();
static JFrame jf4 = new JFrame("STORIA");
static JFrame jf5 = new JFrame("MORTE");
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
    // TODO code application logic here
       
    //alla chiusura della finestra termina anche il programma
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jf5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    new Musica("base.wav").start();
    //definisco il mio pannelo e lo chiamo p 
    Meccaniche m = new Meccaniche(); 
    Comandi c= new Comandi();
    Storia s = new Storia();
    Morte mor = new Morte();
    //aggiungo al jf3 il mio pannello, delle misure fisse,la posizione sullo schermo
    jf.add(m);
    jf.pack();
    jf.setSize(1000, 700);
    jf.setLocation(220, 10);
    jf.setResizable(false);
   
    jf2.add(c);
    jf2.pack();
    jf2.setSize(1000, 700);
    jf2.setLocation(220, 10);
    jf2.setResizable(false);
    
    jf3.setLocation(380, 120);
    jf3.setSize(600, 500);
    jf3.setResizable(false);
   
    
    jf4.add(s);
    jf4.pack();
    jf4.setSize(1000, 700);
    jf4.setLocation(220, 10); 
    jf4.setResizable(false);
    
    jf5.add(mor);
    jf5.pack();
    jf5.setSize(1000, 700);
    jf5.setLocation(220, 10); 
    jf5.setResizable(false);
    
    //definisco delle classi e definisco anche  i miei thread da utilizzare al loro interno
    Nuvole n = new Nuvole(s);
    Thread t = new Thread(n);
    Fiori f = new Fiori(m,mor);
    Thread t2 = new Thread(f);   
  
      jf.setVisible(true);
      t.start();
      t2.start(); 

      

    jf3.movePic ();

    //rendo il jf3 invisibile in attesa che si avvi il gioco  
  
    jf2.setVisible(false);
    jf3.setVisible(false);
    jf3.setEnabled(false);
    jf4.setVisible(false);
    jf5.setVisible(false);
    //faccio partire i miei thread
    
    }
    
}
