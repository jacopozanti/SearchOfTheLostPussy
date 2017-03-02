/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menùfigo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 *
 * @author e.khalifi
 */
public class ReadFile
{

  private BufferedReader inFile;
  private StringTokenizer tokenizer;
  private String line;
  private int numLine = 0;
  private String story [] = new String [40];

  ReadFile (String file) throws IOException
  {

    inFile = new BufferedReader (new FileReader (file));

    //***************************************************************

    //---------------------------------------------------------------
    //
    //  Code for reading the text file into the array.
    //
    //---------------------------------------------------------------

      line = inFile.readLine();

      while (line != null)
        {

        story [numLine] = line;
        ++numLine;
        line = inFile.readLine();
        }

     inFile.close();
  }//end of ReadFile Constructor

  public int getSize ()
  {
    return numLine;
  }

  public String [] getStory ()
  {
    return story;
  }
}
