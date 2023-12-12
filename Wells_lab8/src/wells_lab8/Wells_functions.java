//Author: Chris wells
//Date: 11/19
//1310 P01
//Lab 8
//List of functions to go with lab 8
package wells_lab8;
import java.util.*;

public class Wells_functions {
    //function to print the menu
    public static void PrintMenu(){
        System.out.println(" 1 -- Add Quiz Grade");
        System.out.println(" 2 -- Add Exam Grade");
        System.out.println(" 3 -- Add Lab Grade");
        System.out.println(" 4 -- Print Stats");
        System.out.println(" 5 -- Set Students name");
        System.out.println("-1 -- Quit");
    }
    
    //function asks user for input and returns it to main function
    public static int GetOptions(){
        Scanner input = new Scanner(System.in);
        double menu = input.nextDouble();
        return (int)menu;
    }
}
