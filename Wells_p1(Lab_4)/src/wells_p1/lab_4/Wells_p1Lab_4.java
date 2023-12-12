//Author: Chris wells
//Date: 10/9
//1310 P01
//Lab 4
//Problem 1
//This program will randomly generate a number between 2 and 10
//the user will have 2 attempts to guess the number with the programing
//providing feedback on if the first guess was to low or to high
package wells_p1.lab_4;
import java.util.Scanner;
public class Wells_p1Lab_4 {

    public static void main(String[] args) {
        //generate a number between 2 and 10
        int answer = (int)(Math.random()*(10-2+1))+2;
        double guess;
        double guess2;
        String hint1;
        String hint2;
        String win = "You Win!";
        
        System.out.println("Welcome to Higher or Lower!");
        System.out.print("Enter First Guess: ");
        
        //making scanner
        Scanner input = new Scanner(System.in);
        guess = input.nextDouble();
        //setting negative numbers to positive numbers
        guess = Math.abs(guess);
        //rounding to the nearest whole number
        guess = Math.round(guess);

        //checking if user input is between -10 and 10 exiting if its not
        if (guess > 10 || guess < -10){
            System.out.println("This number is invalid. Exiting game");
        }
        //continues with the game if input is valid
        else{
            //if the input from the user is lower than the random number 
            //feedback is given and user is asked to give a second guess
            //if user enters a negative number, it's changed to a positive
            if (answer > guess){
                hint1 = "Higher";
                System.out.println(hint1);
                System.out.print("Enter Second Guess: ");
                guess2 = input.nextDouble();
                guess2 = Math.abs(guess2);
                //rounding to the nearest whole number
                guess2 = Math.round(guess);
                //Checks if user input is within the number range
                if (guess2 > 10 || guess2 < -10){
                System.out.println("This number is invalid. Exiting game");
                }
                else{
                    //gives feed back if guess was lower than the anwser
                    if (answer > guess2){
                        hint2 = "Higher";
                        //next 3 lines handle the formatting of the table
                        //if both guesses were lower than the answer
                        System.out.printf("%8s%8s%10s\n", "Answer", "Guess", "Message");
                        System.out.printf("%8s%8s%10s\n", answer, (int)guess, hint1);
                        System.out.printf("%8s%8s%10s\n", answer, (int)guess2, hint2);
                    }
                    //gives feedback is guess was higher than the answer
                    else if(answer < guess2) {
                        hint2 = "Lower";
                        //formatting of the tables with first guess being low
                        //and the second guess being too high
                        System.out.printf("%8s%8s%10s\n", "Answer", "Guess", "Message");
                        System.out.printf("%8s%8s%10s\n", answer, (int)guess, hint1);
                        System.out.printf("%8s%8s%10s\n", answer, (int)guess2, hint2);
                    }
                    else if (answer == guess2){
                        //table format, first guess is low, second guess is correct
                        System.out.printf("%8s%8s%10s\n", "Answer", "Guess", "Message");
                        System.out.printf("%8s%8s%10s\n", answer, (int)guess, hint1);
                        System.out.printf("%8s%8s%10s\n", answer, (int)guess2, win);
                    }
                }
            }
            //feedback if guess was too high, asks for second guess
            else if (answer < guess) {
                hint1 = "Lower";
                System.out.println(hint1);
                System.out.print("Enter Second Guess: ");
                guess2 = input.nextDouble();
                //changing negatives to positives
                guess2 = Math.abs(guess2);
                //rounding to the nearest whole number
                guess2 = Math.round(guess);
                //checking if guess is within range of the game
                if (guess2 > 10 || guess2 < -10){
                System.out.println("This number is invalid. Exiting game");
                }
                else{
                    //gives feedback if guess was lower than the answer
                    if (answer > guess2){
                        hint2 = "Higher";
                        //table format is first guess was high and second guess was low
                        System.out.printf("%8s%8s%10s\n", "Answer", "Guess", "Message");
                        System.out.printf("%8s%8s%10s\n", answer, (int)guess, hint1);
                        System.out.printf("%8s%8s%10s\n", answer, (int)guess2, hint2);
                    }
                    //feedback if guess was to high
                    else if(answer < guess2) {
                        hint2 = "Lower";
                        //table format if both guesses were to high
                        System.out.printf("%8s%8s%10s\n", "Answer", "Guess", "Message");
                        System.out.printf("%8s%8s%10s\n", answer, (int)guess, hint1);
                        System.out.printf("%8s%8s%10s\n", answer, (int)guess2, hint2);
                    }
                    else if (answer == guess2){
                        //table format if first guess is too high and second guess is correct
                        System.out.printf("%8s%8s%10s\n", "Answer", "Guess", "Message");
                        System.out.printf("%8s%8s%10s\n", answer, (int)guess, hint1);
                        System.out.printf("%8s%8s%10s\n", answer, (int)guess2, win);
                    }
                }
            }  
            else if (answer == guess){
                //if first guess was correct displays a formatted table to show results
                System.out.printf("%8s%8s%10s\n", "Answer", "Guess", "Message");
                System.out.printf("%8s%8s%10s\n", answer, (int)guess, win);
            }   
        }
    }
    
}