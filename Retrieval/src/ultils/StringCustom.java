/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ultils;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class StringCustom {
    
    /**
     * Remove the special characters and lower case the string
     * @param str
     * @return String
     */
    public String formatString (String str) {
        StringBuilder result = new StringBuilder();
        String[] array = str.toLowerCase().split(" ");
        
        for ( int i=0; i<array.length; ++i ) {
            result.append(removeString(array[i], Constants.FORMAT_SPECIAL_CHAR));
            result.append(" ");
        }
        
        return result.toString();
    }
    
    /**
     * Remove the stop word in the string
     * @param str
     * @param stopword
     * @return String
     */
    public String removeStopword ( String str, ArrayList<String> stopword ) {
        for (String key : stopword) {
            str = removeString(str, key);
        }
        
        return str;
    }
    
    private String removeString ( String str, String key ) {
        return str.replaceAll(key, "");
    }
}
