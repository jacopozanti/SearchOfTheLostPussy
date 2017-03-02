/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menùfigo;

import java.io.IOException;
import javax.swing.JPanel;

/**
 *
 * @author e.khalifi
 */
class Nuvole extends Thread  {
        Storia appoggio;
        
   //passo come parametro al costruttore una variabile alla quale poi darò il valore del pannello
    public Nuvole(Storia s1) throws IOException{
        this.appoggio = new Storia();
        
            appoggio = s1;
            
    }
    //implemento la funzione run che serve per far partire il mio thread e al suo interno metto tutte le azioni che voglio si ripetano
    public void run() {
        
            //faccio un ciclo while sempre sempre vero nel quale richiamo la funzione muoviNuvole che simula la presenza di vento che muove le nuvole 
             while(true){
                 
             appoggio.muoviNuvole();
             
        }       
    }
}