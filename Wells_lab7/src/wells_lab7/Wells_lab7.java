//Author: Chris wells
//Date: 11/09
//1310 P01
//Lab 7
//This program is first half of a larger program that will be a grade calculator
//Currently this program will take grades inputed from the user and display the results back when promted
package wells_lab7;
import java.util.*;

public class Wells_lab7 {
    public static void main(String[] args) {
        //creating empty arrays
        double [] quiz = new double[0];
        double [] lab = new double[0];
        double [] exam = new double[0];
        int menu = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Welcome to Grade Calculator!");
        
        do {
            //Calling function to print menu
            Wells_functions.PrintMenu();
            
            //setting menu to user input
            menu = Wells_functions.GetOptions();
            
            //checking is user entered a valid option
            if (menu < 5 && menu > 0){
                //Switch statement for going through different menu options
                //adding grades to the correct section the user wants
                switch (menu){
                    case 1:
                        quiz = Wells_functions.AddGrade(quiz);
                        break;
                    case 2:
                        exam = Wells_functions.AddGrade(exam);
                        break;
                    case 3:
                        lab = Wells_functions.AddGrade(lab);
                        break;
                    case 4:
                        Wells_functions.PrintStats(quiz, exam, lab);
                        break;
                }
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
