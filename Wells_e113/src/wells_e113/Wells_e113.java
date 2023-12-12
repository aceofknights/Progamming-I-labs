//Author: Chris wells
//Date: 08/24
//1310 P01
//Lab 1
//Exercise 1.13
//write a program that solves the following equation and displays the 
//value for x and y using cramers rule to solve the equation
// 3.4x+50.2y=44.5
// 2.1x+.55y=5.9
package wells_e113;

public class Wells_e113 {

    public static void main(String[] args) {
        // This statement prints out the equation listed above
        System.out.println("3.4x + 50.2y = 44.5");
        System.out.println("2.1x + .55y = 5.9");
        System.out.print("x = ");
        // This line solves for x
        System.out.println((44.5 * .55 - 50.2 * 5.9) / (3.4 * .55 - 50.2 * 2.1));
        System.out.print("y = ");
        //This line solves for y
        System.out.println((3.4 * 5.9 - 44.5 * 2.1) / (3.4 * .55 - 50.2 * 2.1));
    }
    
}
