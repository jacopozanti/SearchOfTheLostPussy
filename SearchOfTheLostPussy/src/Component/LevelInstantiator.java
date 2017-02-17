/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Component;

import java.io.*;

/**
 *
 * @author j.zanti
 */
public class LevelInstantiator {
    
    public LevelInstantiator(){
        
        try (BufferedReader br = new BufferedReader(new FileReader("Prova.txt"))) {
        String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                    System.out.println(sCurrentLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    
        }

    
}
