/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menùfigo;

import java.io.IOException;

/**
 *
 * @author e.khalifi
 */
class Fiori extends Thread{
        Meccaniche appoggio;
        Morte  appoggio2;
   //passo come parametro al costruttore una variabile alla quale poi darò il valore del pannello
    public Fiori(Meccaniche m2, Morte m3) throws IOException{
        this.appoggio = new Meccaniche();
        
            appoggio = m2;
            appoggio2 = m3;
    }
    //implemento la funzione run che serve per far partire il mio thread e al suo interno metto tutte le azioni che voglio si ripetano
        @Override
    public void run() {
        
            //faccio un ciclo while sempre sempre vero nel quale richiamo la funzione muoviFiori che fa muovere i fiori simulando il vento
             while(true){
                 
             appoggio.settaValori();
             appoggio2.settaValori2();
        }       
    }
}
