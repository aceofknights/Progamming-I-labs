/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computeloan;
import java.util.Scanner;

public class ComputeLoan {

    public static void main(String[] args) {
        // TODO code application logic here
        double interestRate;
        double numYears;
        double loanAmount;
        double monthlyPayment;
        double totalPayment;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter interest rate: (as a percent, not a decimal)");
        interestRate = input.nextDouble();
        
        System.out.println("Enter number of years: ");
        numYears = input.nextDouble(); 
        
        System.out.println("Enter loan amount: ");
        loanAmount = input.nextDouble();
        
        double monthlyRate = interestRate/100/12;
        monthlyPayment =(monthlyRate *  loanAmount) / (1 - (1/ Math.pow((1 +monthlyRate),(numYears*12)) ));
        
        System.out.println("Monthly Payment: $"+ (int)(monthlyPayment*100)/100.0);
        
        System.out.println ("Total Total: $"+ (int)((monthlyPayment*numYears*12)*100)/100.0);
        
        
        System.out.println(interestRate);
        System.out.println(numYears);
        System.out.println(loanAmount);
        System.out.println(monthlyPayment);
    }
    
}
