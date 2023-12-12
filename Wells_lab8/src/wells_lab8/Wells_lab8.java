//Author: Chris wells
//Date: 11/19
//1310 P01
//Lab 8
//This program is a grade calculator for CITC 1310 and the second part 
//of a two week lab
package wells_lab8;
import java.util.*;

public class Wells_lab8 {
    public static void main(String[] args) {
        int menu = 0;
        Scanner input = new Scanner(System.in);
        
        //creating empty arrays
        Student stu = new Student();
        
        System.out.println("Welcome to Grade Calculator!");
        
        //looping until user enters -1
        do {
            //Calling function to print menu
            Wells_functions.PrintMenu();
            
            //setting menu to user input
            menu = Wells_functions.GetOptions();
            
            //checking is user entered a grade option
            if (menu < 4 && menu > 0){
                stu.gradeOption(menu);
            }
            //prints out grade when called
            else if (menu == 4){
                stu.PrintStats();
            }
            //setting the students name
            else if (menu == 5){
                System.out.println("Enter studnet name: ");
                String name = input.nextLine();
                stu.setName(name);
            }
            //checks for user entering wrong numbers
            else if (menu == -1){
            }
            else {
                System.out.println("Not a valid option");
            }
        //exits loop if user entered -1
        } while (menu != -1);
    }
}
