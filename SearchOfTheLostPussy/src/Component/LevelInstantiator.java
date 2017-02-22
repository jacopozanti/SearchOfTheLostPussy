/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Component;

import View.*;
import java.io.*;

/**
 *
 * @author j.zanti
 */
public class LevelInstantiator {
    
    int currentLvl = 0;
    String fileName = "Level" + currentLvl + ".txt";
    
    public LevelInstantiator(){
        
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        String sCurrentLine;
        
        int y = 0;
        int count = 0;

            while ((sCurrentLine = br.readLine()) != null) {
                int x = 0;
                for (String word : sCurrentLine.split(" ") ) {
                    

                        
                        if(word.equals("empty")){
                            x++;
                            count++;
                        }
                        
                        if(word.equals("Text1")){
                            new Wall(x*64,y*64);
                            x++;
                            count++;
                        }
                        if(word.equals("Text2"))
                        {
                            new Enemy(x*64,y*64);
                            x++;
                            count++;
                        }
                        if(word.equals("Text3"))
                        {
                            new MainCharacter(x*64,y*64);
                            x++;
                            count++;
                        }
                }
                y++;
            }
            
            

        } catch (IOException e) {
            e.printStackTrace();
        }
    
    }
    
    public void ChangeLvl(){
        if(MainCharacter.instance.posizione.x > 720){
            
            currentLvl++;
            System.out.println("Cambio Livello +");
            
        }
        else if(MainCharacter.instance.posizione.x < 0){
            
            currentLvl--;
            System.out.println("Cambio Livello -");
            
        }
    }

    
}
