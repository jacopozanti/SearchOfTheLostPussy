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
        textureFrame.add(texturePanel);
        MainPanel mainPanel = new MainPanel(texturePanel);
        JTextField fileName = new JTextField();
        JButton printLvl = new JButton("Crea Livello!");
        
        fileName.setPreferredSize(new Dimension(200,30));
        printLvl.setPreferredSize(new Dimension(110,30));
        
        mainFrame.setLayout(new FlowLayout());
        textureFrame.setLayout(new FlowLayout());
        mainFrame.add(mainPanel);
        textureFrame.add(fileName);
        textureFrame.add(printLvl);
        
        mainFrame.setSize(new Dimension(1480,805));
        
        mainFrame.setVisible(true);
        mainFrame.setResizable(true);
        mainFrame.setDefaultCloseOperation(3);
        textureFrame.setVisible(true);
        textureFrame.setResizable(true);
        textureFrame.setDefaultCloseOperation(3);
        textureFrame.pack();
        mainFrame.pack();
        printLvl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fileWriter;
                    fileWriter = new FileWriter(fileName.getText() + ".txt");
                    
                    BufferedWriter bufferedWriter;
                    bufferedWriter = new BufferedWriter(fileWriter);
                    
                    for (int i = 0; i < 20; i++) {
            
                        for (int j = 0; j < 11; j++) {
                            System.out.println(i+" "+j+" "+ mainPanel.getButtonText(j, i));
                            if(mainPanel.getButtonText(i, j) == ""){
                                bufferedWriter.write("empty");
                            }
                            else{
                                bufferedWriter.write(mainPanel.getButtonText(i, j));
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
