/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mapmaker;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author BiPolar_Bears
 */
public class MapMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        JFrame mainFrame = new JFrame("MapMaker");
        JFrame textureFrame = new JFrame();
        
        TexturePanel texturePanel = new TexturePanel();
        MainPanel mainPanel = new MainPanel(texturePanel);
        
        JTextField fileName = new JTextField();
        JButton printLvl = new JButton("Crea Livello!");
        
        fileName.setPreferredSize(new Dimension(200,30));
        printLvl.setPreferredSize(new Dimension(110,30));
        
        mainFrame.setLayout(new FlowLayout());
        textureFrame.setLayout(new FlowLayout());
        
        mainFrame.add(mainPanel);
        textureFrame.add(texturePanel);
        textureFrame.add(fileName);
        textureFrame.add(printLvl);
        
        mainFrame.setSize(new Dimension(1480,805));
        
        mainFrame.setVisible(true);
        textureFrame.setVisible(true);
        
        mainFrame.setResizable(true);
        textureFrame.setResizable(true);
        
        mainFrame.setDefaultCloseOperation(3);
        textureFrame.setDefaultCloseOperation(3);
        
        mainFrame.pack();
        textureFrame.pack();
        
        printLvl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fileWriter;
                    fileWriter = new FileWriter(fileName.getText() + ".txt");
                    
                    BufferedWriter bufferedWriter;
                    bufferedWriter = new BufferedWriter(fileWriter);
                    
                    for (int i = 0; i < 11; i++) {
            
                        for (int j = 0; j < 20; j++) {
                            
                            if(mainPanel.getButtonText(j, i) == ""){
                                bufferedWriter.write("empty");
                            }
                            else{

                                
                                
                                bufferedWriter.write(mainPanel.getButtonText(j, i));
                            }
                            bufferedWriter.write(" ");
                        }
                        bufferedWriter.newLine();
                    }
                    
                    bufferedWriter.flush();
                } catch (IOException ex) {
                    Logger.getLogger(MapMaker.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
    }
    
}
