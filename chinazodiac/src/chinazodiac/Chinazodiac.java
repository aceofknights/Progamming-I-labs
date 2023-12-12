/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinazodiac;
import java.util.*;
public class Chinazodiac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter year");
        int year = 0;
        year = input.nextInt();
        int rem= year % 12;
        
        switch(rem) {
            case 0: System.out.println("money");
            break;
            case 1: System.out.println("rooster");
            break;
        }
    }
    
}
