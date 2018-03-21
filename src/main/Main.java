/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Scanner;



/**
 *
 * @author Informatico40
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    static TablaSimbolos tabla = new TablaSimbolos();
    public static void main(String[] args) throws FileNotFoundException, Exception {
      
        String testFile = "src\\main\\test.txt";
        Lexer lexedInput = new Lexer(new FileReader(testFile),tabla);
        parser p = new parser(lexedInput);
        p.parse();
        //tabla.imprimir();
    }
    
    
    /*
    
    
    
    public class Main {
  static public void main(String argv[]) {    
    try {
        
    	String testFile = "src\\ex2\\test.txt";
      Lexer lexedInput = new Lexer(new FileReader(testFile));
      parser p = new parser(lexedInput);
  
      E result = (E) p.parse().value;
      System.out.println();
      System.out.println();
      result.print(" PEREDA ",true);
   
@SuppressWarnings("unused")
int i = 0;   
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

    
    
    
    */
    
    
}
