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
public class Storia extends JPanel{


    private JLabel cat = new JLabel();
    private JLabel nuvola = new JLabel();
    private JLabel dialoghi = new JLabel();
    private JButton personaggi = new JButton("PERSONAGGI");
    private JButton elma = new JButton("elma");
    private JButton mora = new JButton("mora");
    private JButton zanti = new JButton("zanti");
    private JButton gozzi = new JButton("gozzi");
    private JButton nadia = new JButton("nadia");
    private JButton ronco = new JButton("ronco");
    static String sceltaPG = new String();


    public int nuvX=1000;
    public int n=0;
    
    
    public Storia() throws IOException{
        
        
    cat.setVisible(true);
    this.add(cat);
    sceltaPG="selenziona un personaggio";          
   
    cat.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
          
        new Musica("dietro.wav").start();
        MenùFigo.jf.setVisible(true);
        MenùFigo.jf4.setVisible(false); 
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
    personaggi.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
          
        new Musica("effetto2.wav").start();
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
//           new Musica("personaggi.wav").start();
        new Musica("effetto.wav").start();
           personaggi.setLocation(0,300);
           personaggi.setSize(120, 40);
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
                    if( sceltaPG=="selenziona un personaggio"){   personaggi.setLocation(0,300);
           personaggi.setSize(120, 40);elma.setLocation(-85,335);
             elma.setSize(100, 20);
              mora.setLocation(-85,370);
             mora.setSize(100, 20);
              gozzi.setLocation(-85,440);
             gozzi.setSize(100, 20);
               nadia.setLocation(-85,475);
             nadia.setSize(100, 20);
             ronco.setLocation(-85, 510); 
             ronco.setSize(100, 20);
                     zanti.setLocation(-85, 405); 
    zanti.setSize(100, 20);}    
            else{
            personaggi.setLocation(-85,300);
             personaggi.setSize(100, 20);
            }

            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
    elma.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
  new Musica("effetto2.wav").start();
  sceltaPG="elma";
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
//           new Musica("personaggi.wav").start();
           elma.setLocation(0,335);
           elma.setSize(120, 40);
           new Musica("effetto.wav").start();
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
             if( sceltaPG=="elma"){  elma.setLocation(0,335);
           elma.setSize(120, 40);
               mora.setLocation(-85,370);
             mora.setSize(100, 20);
              zanti.setLocation(-85,405);
             zanti.setSize(100, 20);
                nadia.setLocation(-85,475);
             nadia.setSize(100, 20);
               gozzi.setLocation(-85,440);
             gozzi.setSize(100, 20);
              ronco.setLocation(-85, 510); 
             ronco.setSize(100, 20);
                  personaggi.setLocation(-85,300);
             personaggi.setSize(100, 20);}
            else{
             elma.setLocation(-85,335);
             elma.setSize(100, 20);
            }
           

            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
    mora.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
     new Musica("effetto2.wav").start();
     sceltaPG="mora";
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
//           new Musica("personaggi.wav").start();
      
           new Musica("effetto.wav").start();
            mora.setLocation(0,370);
           mora.setSize(120, 40);// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
                if( sceltaPG=="mora"){  mora.setLocation(0,370);
           mora.setSize(120, 40);
                elma.setLocation(-85,335);
             elma.setSize(100, 20);
                 zanti.setLocation(-85,405);
             zanti.setSize(100, 20);
                  gozzi.setLocation(-85,440);
             gozzi.setSize(100, 20);
                   nadia.setLocation(-85,475);
             nadia.setSize(100, 20);
                 ronco.setLocation(-85, 510); 
             ronco.setSize(100, 20);
                     personaggi.setLocation(-85,300);
             personaggi.setSize(100, 20);}    
            else{
       mora.setLocation(-85,370);
             mora.setSize(100, 20);
            }

            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
    zanti.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
      
          
           new Musica("effetto2.wav").start(); 
           sceltaPG="zanti"; 
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
//           new Musica("personaggi.wav").start();
           zanti.setLocation(0,405);
           zanti.setSize(120, 40);
           new Musica("effetto.wav").start();
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if( sceltaPG=="zanti"){zanti.setLocation(0,405);
           zanti.setSize(120, 40);
             elma.setLocation(-85,335);
             elma.setSize(100, 20);
              mora.setLocation(-85,370);
             mora.setSize(100, 20);
              gozzi.setLocation(-85,440);
             gozzi.setSize(100, 20);
               nadia.setLocation(-85,475);
             nadia.setSize(100, 20);
             ronco.setLocation(-85, 510); 
             ronco.setSize(100, 20);
                 personaggi.setLocation(-85,300);
             personaggi.setSize(100, 20);}
            else{
            zanti.setLocation(-85,405);
             zanti.setSize(100, 20);
            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
    gozzi.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
          sceltaPG="gozzi";
  new Musica("effetto2.wav").start();  
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
//           new Musica("personaggi.wav").start();
           gozzi.setLocation(0,440);
           gozzi.setSize(120, 40);
           new Musica("effetto.wav").start();
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
               if( sceltaPG=="gozzi"){   gozzi.setLocation(0,440);
           gozzi.setSize(120, 40);
                  nadia.setLocation(-85,475);
             nadia.setSize(100, 20);
                ronco.setLocation(-85, 510); 
             ronco.setSize(100, 20);
             elma.setLocation(-85,335);
             elma.setSize(100, 20);
              mora.setLocation(-85,370);
             mora.setSize(100, 20);
                  zanti.setLocation(-85,405);
             zanti.setSize(100, 20);
                    personaggi.setLocation(-85,300);
             personaggi.setSize(100, 20);}
            else{
         gozzi.setLocation(-85,440);
             gozzi.setSize(100, 20);

            }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });                     
    nadia.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
           new Musica("effetto2.wav").start();
           sceltaPG="nadia";
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
    // new Musica("personaggi.wav").start();
            nadia.setLocation(0,475);
            nadia.setSize(120, 40);
            new Musica("effetto.wav").start();
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        @Override
        public void mouseExited(MouseEvent e) {
            if( sceltaPG=="nadia"){ nadia.setLocation(0,475);
           nadia.setSize(120, 40);
              gozzi.setLocation(-85,440);
             gozzi.setSize(100, 20);
             ronco.setLocation(-85, 510); 
             ronco.setSize(100, 20);
           elma.setLocation(-85,335);
             elma.setSize(100, 20);
              mora.setLocation(-85,370);
             mora.setSize(100, 20);
               zanti.setLocation(-85,405);
             zanti.setSize(100, 20);
                 personaggi.setLocation(-85,300);
             personaggi.setSize(100, 20);}
            else{
           nadia.setLocation(-85,475);
             nadia.setSize(100, 20);
            }

            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
    ronco.addMouseListener(new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
          sceltaPG="ronco";
        new Musica("effetto2.wav").start();
        
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
//           new Musica("personaggi.wav").start();
           ronco.setLocation(0,510);
           ronco.setSize(120, 40);
             new Musica("effetto.wav").start();
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
               if( sceltaPG=="ronco"){ ronco.setLocation(0,510);
           ronco.setSize(120, 40);
           nadia.setLocation(-85,475);
             nadia.setSize(100, 20);
              gozzi.setLocation(-85,440);
             gozzi.setSize(100, 20);         
       elma.setLocation(-85,335);
             elma.setSize(100, 20);
              mora.setLocation(-85,370);
             mora.setSize(100, 20);
                zanti.setLocation(-85,405);
             zanti.setSize(100, 20);
                    personaggi.setLocation(-85,300);
             personaggi.setSize(100, 20);}
            else{
           ronco.setLocation(-85, 510); 
    ronco.setSize(100, 20);
            }

            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
    dialoghi.addMouseListener(new MouseListener() {
        @Override
public void mouseClicked(MouseEvent e) {
    new Musica("esci.wav").start();
            n++; 
            switch(n) {
            case 0:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo.jpg")));
                break;
            case 1:
                dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo0.jpg")));
                break;
            case 2:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo1.jpg")));
                break;
            case 3:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo2.jpg")));
                break;
            case 4:
                dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo3.jpg")));
                break;
            case 5:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo4.jpg")));
                break;
            case 6:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo5.jpg")));
                break;
            case 7:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo6.jpg")));
                break;  
            case 8:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo7.jpg")));
                break;
            case 9:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo8.jpg")));
                break;
            case 10:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo9.jpg")));
                break;  
            case 11:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo10.jpg")));
                break; 
            case 12:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo11.jpg")));
                break; 
            case 13:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo12.jpg")));
                break;    
            case 14:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo13.jpg")));
                break;     
            case 15:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo14.jpg")));
                break; 
            case 16:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo15.jpg")));
                break; 
            case 17:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo16.jpg")));
                break; 
            case 18:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo17.jpg")));
                break; 
            case 19:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo18.jpg")));
                break; 
            case 20:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo19.jpg")));
                break; 
            case 21:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo20.jpg")));
                break; 
            case 22:
               dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo21.jpg")));
                break; 
                
            }
        
                 
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
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void mouseExited(MouseEvent e) {
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    });
    
    //setto le caratteristiche delle label 
    nuvola.setIcon(new ImageIcon(getClass().getResource("nuvola1.png")));
    nuvola.setLocation(nuvX, -10); 
    nuvola.setVisible(true);   
    this.add(nuvola);
    

    
    personaggi.setLocation(0, 300); 
    personaggi.setSize(120, 40);
    personaggi.setForeground(Color.white);
    personaggi.setBackground(Color.black);
    personaggi.setVisible(true);   
    this.add(personaggi);
    
    elma.setLocation(-85, 335); 
    elma.setSize(100, 20);
    elma.setForeground(Color.red);
    elma.setBackground(Color.black);
    elma.setVisible(true);   
    this.add(elma);
    
    mora.setLocation(-85, 370); 
    mora.setSize(100, 20);
    mora.setForeground(Color.orange);
    mora.setBackground(Color.black);
    mora.setVisible(true);   
    this.add(mora);
    
    zanti.setLocation(-85, 405); 
    zanti.setSize(100, 20);
    zanti.setForeground(Color.green);
    zanti.setBackground(Color.black);
    zanti.setVisible(true);   
    this.add(zanti);
    
    gozzi.setLocation(-85, 440); 
    gozzi.setSize(100, 20);
    gozzi.setForeground(Color.blue);
    gozzi.setBackground(Color.black);
    gozzi.setVisible(true);   
    this.add(gozzi);
    
    nadia.setLocation(-85, 475); 
    nadia.setSize(100, 20);
    nadia.setForeground(Color.pink);
    nadia.setBackground(Color.black);
    nadia.setVisible(true);   
    this.add(nadia);
    
    ronco.setLocation(-85, 510); 
    ronco.setSize(100, 20);
    ronco.setForeground(Color.yellow);
    ronco.setBackground(Color.black);
    ronco.setVisible(true);   
    this.add(ronco);
    
    dialoghi.setIcon(new ImageIcon(getClass().getResource("dialogo.jpg")));
    dialoghi.setLocation(250, 350); 
    dialoghi.setVisible(true);   
    this.add(dialoghi);
    
    
    cat.setIcon(new ImageIcon(getClass().getResource("cat.gif")));
    
    
    JLabel background = new JLabel (new ImageIcon ( "storia.png")); 
    background.setSize(1000,700);
    background.setLocation(0,0);
    background.setVisible(true);
    this.add(background);

    this.setLayout(null);

    }
    

    public void rallenta(int g) {
        try {
            Thread.sleep(g);
        } catch (InterruptedException ex) {
            Logger.getLogger(Meccaniche.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    public void muoviNuvole(){
        while(true){  

    cat.setLocation(750, -143);
    cat.setBounds(750, -143, cat.getIcon().getIconWidth(), cat.getIcon().getIconHeight());
    dialoghi.setBounds(250,350 , dialoghi.getIcon().getIconWidth(), dialoghi.getIcon().getIconHeight());
    nuvola.setIcon(new ImageIcon(getClass().getResource("nuvola1.png")));

             
               if(nuvola.getLocation().x>=-400)
               {
        
                   rallenta(50);
                   nuvola.setLocation(nuvola.getLocation().x - 1, -10);
                   nuvola.setBounds(nuvola.getLocation().x-1, -10, nuvola.getIcon().getIconWidth(), nuvola.getIcon().getIconHeight());

               }
               else 
               {
                   nuvola.setLocation(1000,-10);   
                   nuvola.setBounds(1000, -10, nuvola.getIcon().getIconWidth(), nuvola.getIcon().getIconHeight());
               }     
           }      
                             }
}
