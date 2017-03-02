/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menùfigo;

/**
 *
 * @author elmahdi
 */
//qui ho richiamato tutti gli import utili al programma 
import java.awt.Color;
import static java.awt.Color.black;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.awt.PageAttributes.MediaType.B;
import java.awt.Rectangle;
import static java.awt.Transparency.OPAQUE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author e.khalifi
 */


//ho creato la classe MyPanel nella quale ho messo tutto , so che stilisticamente e
//come concezione non è giustissimo ma ho seguito le ie intuizioni e la logica che 
//mi sono orefissato
public class Comandi extends JPanel{
    

    
    int grandezzaGioca=100;
    int grandezzaStoria=20;
    int grandezzaComandi=20;
    int grandezzaCredits=20;
    int grandezzaEsci=20; 
    
    private JLabel wasd = new JLabel();
    private JLabel gioca = new JLabel();
    private JLabel cat = new JLabel();
    private JLabel comandi = new JLabel();
    private JLabel freccette = new JLabel();

    public int i=0;
       
    
    public Comandi() throws IOException{
        
 
    wasd.setVisible(true);
    this.add(wasd);
    
    cat.setVisible(true);
    this.add(cat);
    
    freccette.setVisible(true);
    this.add(freccette);

    gioca.setVisible(true);
    this.add(gioca);
    
    comandi.setVisible(true);
    this.add(comandi);
    
    this.setBackground(Color.red);
    
    cat.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
          
            new Musica("dietro.wav").start();
           MenùFigo.jf.setVisible(true);
          MenùFigo.jf2.setVisible(false); 
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
           new Musica("cat.wav").start();
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
new Musica("cat.wav").stop();
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
    gioca.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
          new Musica("effetto2.wav").start();JOptionPane.showMessageDialog(null,"qui ci va il gioco che state implementando");  //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mousePressed(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            new Musica("effetto.wav").start();// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
          new Musica("esci.wav").start();  //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });

    
    wasd.setIcon(new ImageIcon(getClass().getResource("wasd.png")));
    freccette.setIcon(new ImageIcon(getClass().getResource("freccette.png")));
    cat.setIcon(new ImageIcon(getClass().getResource("cat.gif")));
    comandi.setIcon(new ImageIcon(getClass().getResource("comandi.png")));
    gioca.setIcon(new ImageIcon(getClass().getResource("gioca.png")));


    
    }
    

    public void paintComponent(Graphics g){
    super.paintComponent(g);

    wasd.setLocation(9, 40);
    cat.setLocation(750, -110);
    comandi.setLocation(465,20);
    freccette.setLocation(500, 235);
    gioca.setLocation(90, 450);
    }
      
    //creo un rallentamento del tempo per la pallina
    public void rallenta(int g) {
        try {
            Thread.sleep(g);
        } catch (InterruptedException ex) {
            Logger.getLogger(Meccaniche.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
