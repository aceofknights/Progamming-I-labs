/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switchstatementgrade;
import java.util.*;
public class SwitchstatementGrade {

    public static void main(String[] args) {
        char grade = 'f';
        
        System.out.println("Enter Grade: ");
        
        switch(grade){
            case 'A' : System.out.println("Great job");
            break;
            case 'B' : System.out.println("Well done");
            break;
            case 'C' : System.out.println("Good");
            break;
            case 'D' : System.out.println("Oof");
            break;
            case 'F' : System.out.println("Bro what are you doin");
            break;
            default: System.out.println("enter a real grade bro");
                    
        }
    }
    
}
