//Author: Chris wells
//Date: 9/10
//1310 P01
//Lab 2
//Problem 2
//This program will calculate how many grams is remaing in a substance
//by asking for 3 different user inputs:
//starting grams, half life, and time elapsed
package wells_p2;
import java.util.*;
public class Wells_p2 {

    public static void main(String[] args) {
        //declairing variables
        double gramsStart;
        double gramsRemain;
        double halfLife;
        double timeElapse;
        
        //creating a scanner for user input
        Scanner input = new Scanner(System.in);
        
        //the next few lines asks for 3 different inputs and assigns them to variables
        System.out.println("Enter in amount of substance (in grams):");
        gramsStart = input.nextDouble();
        
        System.out.println("Enter half-life of substance (in years):");
        halfLife = input.nextDouble();
        
        System.out.println("Enter the time elapsed (in years):");
        timeElapse = input.nextDouble();
        
        //Calculates how man grams are remaining
        gramsRemain = gramsStart * Math.pow(1.0/2, timeElapse/(halfLife));
        
        //outputs the ramining grams
        System.out.println("The amount of the substance remaining is "+ gramsRemain+ " grams");
    }
    
}
