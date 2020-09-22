/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

/**
 *
 * @author personal
 */
public class Config {
    
    private static String Name;
    private static String Value;

    /**
     * @return the Name
     */
    public static String getName() {
        return Name;
    }

    /**
     * @param aName the Name to set
     */
    public static void setName(String aName) {
        Name = aName;
    }

    /**
     * @return the Value
     */
    public static String getValue() {
        return Value;
    }

    /**
     * @param aValue the Value to set
     */
    public static void setValue(String aValue) {
        Value = aValue;
    }
    
    @Override
    public String toString() {
        return "Config [Name=" + Name + ", Value=" + Value + "]";
    }
    
    
}
