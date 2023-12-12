/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functioncal;

import java.util.Scanner;

/**
 *
 * @author sizzl
 */
public class FunctionCal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaring variables
        int firstNum;
        int secondNum;
        int operation;
        
        //making scanner
        Scanner input = new Scanner(System.in);
        
        //asking for user input for 2 numbers
        System.out.print("Enter first number: ");
        firstNum = input.nextInt();
        System.out.print("Enter second number: ");
        secondNum = input.nextInt();
        
        //asking user what operator they want to use
        System.out.print("0 for addition" +"\n" +"1 for subtraction"+"\n" + 
                "2 for multiplication"+ "\n"+ "3 for division" +"\n"+ 
                "Enter the operation you would like to use: ");
        operation = input.nextInt();
        
        //This switch statement takes the previous input from the user 
        //Then it decideds on what operation to preform and displays the results
        switch (operation){
            case 0 : System.out.println(mathfunction.addition(firstNum, secondNum));
            break ;
            case 1 : System.out.println(mathfunction.subtract(firstNum, secondNum));
            break ;
            case 2 : System.out.println(mathfunction.multiply(firstNum, secondNum));
            break ;
            case 3 : System.out.println(mathfunction.divide(firstNum, secondNum));
            break ;
            default : System.out.println("Enter a valid operation");
        }
    }
}
