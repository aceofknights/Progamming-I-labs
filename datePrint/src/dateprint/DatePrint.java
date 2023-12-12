/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateprint;
import java.util.*;
/**
 *
 * @author sizzl
 */
public class DatePrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.Date d = new java.util.Date();
        System.out.println(d.toString());
        
        Random rand = new Random();
        
        System.out.println(rand.nextInt(5));
    }
    
}
