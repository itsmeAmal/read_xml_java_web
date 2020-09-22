/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author personal
 */
public class NewClass {
    
    public static void main(String[] args) {
        try {
            XMLDecoder input = new XMLDecoder(new FileInputStream(".\\web\\XMLFile.xml"));
            Config Cfg = (Config)input.readObject();
            input.close();
            System.out.println(Cfg);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
