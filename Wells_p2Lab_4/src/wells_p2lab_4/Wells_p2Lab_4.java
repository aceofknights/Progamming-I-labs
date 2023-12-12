//Author: Chris wells
//Date: 10/9
//1310 P01
//Lab 4
//Problem 2
package wells_p2lab_4;
import java.util.Scanner;

public class Wells_p2Lab_4 {

    public static void main(String[] args) {
        String courseNumber;
        String courseSubject;
        Scanner input = new Scanner(System.in);
        
        //trimming spaces off course subject and course number
        System.out.println("Please enter a 4 letter course subject: ");
        courseSubject = input.next();
        courseSubject = courseSubject.trim();
        courseNumber = input.next();
        courseNumber = courseNumber.trim();
        
        //This line declairs a variable to do a check on course number length
        int numCheck = courseNumber.length();
        
        //Checks if course subject is valid ignores cases
        if ((courseSubject.equalsIgnoreCase("math"))||(courseSubject.equalsIgnoreCase("citc"))||(courseSubject.equalsIgnoreCase("engl"))){
            
            //Checks if the course number is the correct length
            if ((numCheck >= 4)||(numCheck <=2)){
                System.out.println("The level number is not valid for this course");
            }
            //checks if the course number starts with a 1, 2, 3, or 4
            else if ((courseNumber.charAt(0)=='1')||(courseNumber.charAt(0)=='2')||(courseNumber.charAt(0)=='3')||(courseNumber.charAt(0)=='4')) {
                System.out.println("This is a valid course");
            }
            //displays error if course number starts with the wrong number
            else {
                System.out.println("The level number is not valid for this course");
            }
        }
        //displays error if course subject is wrong 
        else {
            System.out.println("This is not a valid course subject");
        }
    }
    
}
