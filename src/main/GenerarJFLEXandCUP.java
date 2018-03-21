/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Informatico40
 */
public class GenerarJFLEXandCUP {
    static public void main(String argv[]) { 
         String directorio; 
         String separador;
         directorio =  System.getProperty("user.dir");
         separador = System.getProperty("file.separator");
         
         String opciones[] = new String[5];
        opciones[0] = "-destdir";
        opciones[1] = "src\\main";
        opciones[2] = "-parser";
        opciones[3] = "parser";
        opciones[4] = directorio + separador + "src\\main\\parser.cup";
        
        try {
            java_cup.Main.main(opciones);
        } catch (IOException ex) {
            Logger.getLogger(GenerarJFLEXandCUP.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(GenerarJFLEXandCUP.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        directorio = System.getProperty("user.dir");
        separador = System.getProperty("file.separator");
        jflex.Main.generate(new File(directorio + separador + "src\\main\\lexer.flex"));
        
        
    }
}
