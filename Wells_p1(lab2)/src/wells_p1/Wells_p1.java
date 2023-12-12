//Author: Chris wells
//Date: 9/9
//1310 P01
//Lab 2
//Problem 1
//This program will output the money Daniel will 
//save depending on the amountof months he inputs.
//The program will calculate an intrest and display the results

package wells_p1;
//imports all java tools
import java.util.*;

public class Wells_p1 {

    public static void main(String[] args) {
        //Declairing variables
        int months;
        int gigMoney = 750;
        double monthlyRate = 2.5/100/12;
        double interestEarned;
        double totalSaved;
        double moneySaved;
        
        //Asks for user input in console
        System.out.println("How many months have you saved?: ");
        
        //creating a scanner for user input
        Scanner input = new Scanner(System.in);
        
        //puts the next input into months
        months = input.nextInt();
        
        //Calculates how much interest has been earn monthly
        interestEarned = (months * gigMoney) * monthlyRate;
        
        //Calculates how much money is earned from gigs each month
        moneySaved = (months * gigMoney);
        
        //Adds the interest earned to the money earned from gigs
        totalSaved =moneySaved + interestEarned;
        
        //Displays how much total money is in the saving account while rounding to the nearest hundredths place
        System.out.println("You have saved: "+ (int)(totalSaved *100+.5)/100.0);
    }
}