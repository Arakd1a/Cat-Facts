/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catfacts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Matt
 */
public class CatFacts {

   
    public static void main(String[] args ) {
    boolean factLoop = true;
    int factsSent = 0;
    int factSleep = 2 * 1000;
    CatFacts cat = new CatFacts();      
    while(factLoop){
    String fact = cat.getFact();
    printFact(fact);    
    factsSent++;
    System.out.println("Facts sent: " + factsSent);     
        try {
            Thread.sleep(factSleep);
        } catch (InterruptedException ex) {
             System.err.println("TIMER ERROR");
        }
    }
    
    }
    
  public String getFact() { 
    String factToken = "";
    int arraySize = 0;
    int randomFactNumber = 0;
    String fact = "";
    Scanner inFile1 = null;
    try {
        inFile1 = new Scanner(new File("FactSheet.txt")).useDelimiter(",\\s*");
    } catch (FileNotFoundException ex) {
           System.err.println("CAT FACTSHEET NOT FOUND");
    }
    ArrayList<String> catFactsArray = new ArrayList<String>();
    while (inFile1.hasNextLine()) {
      factToken = inFile1.nextLine();
      catFactsArray.add(factToken);
      arraySize++;
    }
    inFile1.close();
   System.out.println("Facts compiled successfully");
   System.out.println("Number of facts compiled:" + arraySize);

   randomFactNumber = (int )(Math.random() * arraySize);
   fact = catFactsArray.get(randomFactNumber); 
    return fact;
}
    
  public static void printFact(String fact){  
  System.out.println(fact);
  }
  
  public static void sendEmail(String fact){

      
  }
  
  
  
}
    


    
