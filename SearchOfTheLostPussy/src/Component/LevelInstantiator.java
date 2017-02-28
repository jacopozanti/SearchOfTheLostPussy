/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Component;

import Model.ElementInGame;
import View.*;
import java.io.*;
import searchofthelostpussy.*;
/**
 *
 * @author j.zanti
 */
public class LevelInstantiator {
    public static LevelInstantiator instance;
    int currentLvl = -1;
    String fileName = "Level" + currentLvl + ".txt";
    
    public LevelInstantiator(){
       instance = this;
       ChangeLvl('+');
    }
    
    public void ChangeLvl(char a){
        if(a == '+'){

            currentLvl++;
            fileName = "Level" + currentLvl + ".txt";
            System.out.println("Cambio Livello " + fileName);
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String sCurrentLine;

            int y = 0;
            int count = 0;
            MainCharacter.instance = null;
            ElementInGame.ElementInGame.clear();
            ElementInGame.ProjectileInGame.clear();
            ElementInGame.WallInGame.clear();
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
                        if(word.equals("Text2")){
                            new Wall(x*64,y*64,"Block1");
                            x++;
                            count++;
                        }
                        if(word.equals("Text18"))
                        {
                            new Enemy(x*64,y*64);
                            x++;
                            count++;
                        }
                        if(word.equals("Text19"))
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
        else if(a == '-'){
            
            currentLvl--;
            System.out.println("Cambio Livello -");
            
        }
    }

    
}
