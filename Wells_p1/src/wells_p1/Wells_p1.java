//Author: Chris wells
//Date: 9/14
//1310 P01
//Lab 3
//Problem 1
//This program will ask for 3 sides of a triangle
//if the user enters a valid triangle it will print the perimeter
package wells_p1;
import java.util.*;

public class Wells_p1 {

    public static void main(String[] args) {
        //Declairing varables
        double triSideA;
        double triSideB;
        double triSideC;
        double perimeter;
        
        //creating scanner
        Scanner input = new Scanner(System.in);
        
        //asking user for input on 3 sides of a triangle
        System.out.print("Enter side A for triangle: ");
        triSideA = input.nextDouble();
        System.out.print("Enter side B for triangle: ");
        triSideB = input.nextDouble();
        System.out.print("Enter side C for triangle: ");
        triSideC = input.nextDouble();
        
        //calculating if the triangle is valaid
        if ((triSideA + triSideB > triSideC)&&(triSideC + triSideB > triSideA)
        &&(triSideA + triSideC > triSideB)){
            //calculating perimeter
            perimeter = (triSideA + triSideB + triSideC);
            System.out.println("The perimeter of the triangle is: "+perimeter);
            
            //calculating if perimeter is even or divisible by 5
            if (((perimeter %2)==0)||((perimeter %5)==0)){
                System.out.println("What a nifty triangle!");
            }    
            
            //calculating if perimeter is bigger then 100 and any side is bigger then 70
            if ((perimeter > 100) && (triSideA > 70)||(triSideB > 70)||(triSideC > 70)){
                System.out.println("That's a large triangle!");
                
            }    
        }
        //Displays error message for invalid values
        else {
            System.out.println("Please enter vaild values");
        }
    } 
}