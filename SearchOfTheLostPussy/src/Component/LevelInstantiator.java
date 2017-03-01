/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Component;

import Model.ElementInGame;
import View.*;
import java.awt.Image;
import java.awt.Point;
import java.io.*;
import javax.swing.ImageIcon;
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
        
        GameWindow.instance.stopThreads();
        SearchOfTheLostPussy.canRefresh = false;
        if(a == '+'){

            currentLvl++;
            if(currentLvl > 3)
            {
                GameWindow.instance.backGround = new ImageIcon(new ImageIcon("Img/BackGround2.png").getImage().getScaledInstance(1280, 720, Image.SCALE_DEFAULT));
            }
            fileName = "Level" + currentLvl + ".txt";
            System.out.println("Cambio Livello " + fileName);
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String sCurrentLine;

            int y = 0;
            int count = 0;
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
                        if(word.equals("Text16"))
                        {
                            new EnemyBomber(x*64,y*64);
                            x++;
                            count++;
                        }
                        if(word.equals("Text17"))
                        {
                            new EnemyShooter(x*64,y*64);
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
                            try
                            {
                                MainCharacter.instance.life++;
                                MainCharacter.instance.SetPosition(x*64 , y*64); 
                                ElementInGame.ElementInGame.add(MainCharacter.instance);
                            }
                            catch(Exception exception)
                            {
                                new MainCharacter(x*64,y*64);
                                System.out.println("err");
                            }
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
        SearchOfTheLostPussy.canRefresh = true;
        GameWindow.instance.startThreads();
        
    }

    
}
