/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filingstatus;
import java.util.*;

public class FilingStatus {

    public static void main(String[] args) {
        
        //declairing varables
        int status;
        double income;
        
        //creating scanner
        Scanner input = new Scanner(System.in);
        
        //asking user for filing status
        System.out.println("Enter filing status");
        System.out.println("0 for single");
        System.out.println("1 for married of qualifying widow");
        System.out.println("2 for married file separately");
        System.out.println("3 for head of household");
        status = input.nextInt();
        
        //asking user for income
        if (status == 0) {
        System.out.println("Enter income for the tax year");
        income = input.nextDouble();
            // Compute tax for single filers
            //asking if income is bigger then 0
            if (income >= 0.0){
                //asking if income is greater then 372,951
                if (income >= 372951){
                    System.out.println("Your taxs are: $"+income * .35);  
                }
                //asking if income is between 171,551 - 372,950
                else if (income >=171551){
                    System.out.println("Your taxs are: $"+income * .33);
                }
                //asking if income is between 82,251 - 171,550
                else if (income >=82251){
                    System.out.println("Your taxs are: $"+income * .28);
                }
                //asking if income is between 33,951 - 82,250
                else if (income >=33951){
                    System.out.println("Your taxs are: $"+income * .25);
                }
                //asking if income is between 8,351 - 33,950
                else if (income >=8351){
                    System.out.println("Your taxs are: $"+income * .15);
                }
                //asking if income is greater then 0
                else if (income >= 0){
                    System.out.println("Your taxs are: $"+income*.10);
                }
                //if user enters a number <0 asks for a positive number
                else if (income < 0){
                    System.out.println("please enter a positive number");
                }
            }
        }
       else if (status == 1) {
           System.out.println("you are filing for for married jointly or qualifying widow");
         // Compute tax for married file jointly 
          // or qualifying widow(er)
        }
       else if (status == 2) {
           System.out.println("you are filing married separately");
         // Compute tax for married file separately
        }
       else if (status == 3) {
           System.out.println("you are filing head of household");
          // Compute tax for head of household
        }
       else {
           System.out.println("you entered an incorrect status");
          // Display wrong status
}
    }
    
}
