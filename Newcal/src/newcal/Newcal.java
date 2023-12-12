/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newcal;
import java.util.*;
public class Newcal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //generates a random number between 0 - 10
        int a = (int)(Math.random()*(10 - 0 + 1))+0;
        int b = (int)(Math.random()*(10 - 0 + 1))+0;
        
        System.out.println ("Whats " + a + " + " + b + " =");
        int c = input.nextInt();
        
        System.out.println((a + b == c)? "Correct" : "incorrect");
    }
    
}
