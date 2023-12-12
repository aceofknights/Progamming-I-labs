//Author: Chris wells
//Date: 9/14
//1310 P01
//Lab 3
//Problem 2
//This program will take 2 numbers input for a user
//it will then preform the operation the user wants and display the results
package wells_p2;
import java.util.*;
public class Wells_p2 {

        public static void main(String[] args) {
        //declaring variables
        double firstNum;
        double secondNum;
        int operation;
        
        //making scanner
        Scanner input = new Scanner(System.in);
        
        //asking for user input for 2 numbers
        System.out.print("Enter first number: ");
        firstNum = input.nextDouble();
        System.out.print("Enter second number: ");
        secondNum = input.nextDouble();
        
        //asking user what operator they want to use
        System.out.print("0 for addition" +"\n" +"1 for subtraction"+"\n" + 
                "2 for multiplication"+ "\n"+ "3 for division" +"\n"+ 
                "Enter the operation you would like to use: ");
        operation = input.nextInt();
        
        //This switch statement takes the previous input from the user 
        //Then it decideds on what operation to preform and displays the results
        switch (operation){
            case 0 : System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
            break ;
            case 1 : System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
            break ;
            case 2 : System.out.println(firstNum + " * " + secondNum + " = " + (firstNum * secondNum));
            break ;
            case 3 : System.out.println(firstNum + " / " + secondNum + " = " + (firstNum / secondNum));
            break ;
            default : System.out.println("Enter a valid operation");
        }
    }
}
