/*
*Chris wells
*8/29
*
 */
package scanning;
//must have in order to use the scanner function that asks for user input 
import java.util.Scanner;

public class Scanning {
    public static void main(String[] args) {
        //declaring radius and area vaiables
        double radius;
        double area;
        
        // how to request input from a user, the word input can be anything
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter an radius:");
        
        //the word input must match the above word input
        //puts the user input into the varable 'radius'
        radius = input.nextDouble();
        
        //calculating and printing area
        area = radius * radius * 3.14159;
        System.out.println("You entered: "+ area);
        
        
        System.out.println("Enter an radius:");
        radius = input.nextDouble();
        
        area = radius * radius * 3.14159;
        System.out.println("You entered: "+ area);
    }
    
}
