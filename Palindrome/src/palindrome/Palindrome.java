/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;
import java.util.Scanner;
/**
 *
 * @author sizzl
 */
public class Palindrome {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word;
        
        
        
        
        /*for (leftLetter = word.charAt(0) ;leftLetter == rightLetter; leftLetter = word.charAt(+1)){
            if (word.equalsIgnoreCase("exit")){
                break;
            }
            rightLetter += (char)(word.charAt(rightCheck)-1);
            System.out.println(leftLetter + " " + rightLetter); 
        }/*/
        
        do {
            System.out.println("enter word: ");
            word = input.next();
            int leftCheck =0;
            int rightCheck = word.length()-1;
            char leftLetter = word.charAt(leftCheck) ;
            leftLetter = Character.toLowerCase(leftLetter);
            
            char rightLetter = word.charAt(word.length()-1);
            rightLetter = Character.toLowerCase(rightLetter);
            
            //int rightCheck =word.charAt(word.length()-1);
            //System.out.println(leftLetter + " " + rightLetter); 
            //int leftCheck;
            
            //for (leftCheck =(0) ;leftLetter == rightLetter; leftCheck++){
                //System.out.println(leftLetter);
               // leftLetter += word.charAt(leftCheck);
            //}
            
            //int check = leftLetter.compareToIgnoreCase(rightLetter);
            System.out.println(leftCheck + " " + rightCheck);
            while(leftCheck < rightCheck){
                if(word.charAt(leftCheck) != (word.charAt(rightCheck))){
                    
                }
                }
            
        }while (!word.equalsIgnoreCase("exit"));
    }
    
}
