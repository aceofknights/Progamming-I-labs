/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tuition;

/**
 *
 * @author sizzl
 */
public class Tuition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double start = 10000;
        int tally =0;
        while(start < 20000){
            start += start * 0.07;
            tally++;
            System.out.println(tally);
        }
        
    }
    
}
