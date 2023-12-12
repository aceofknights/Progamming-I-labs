/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasyname;

import java.util.Scanner;
public class FantasyName {


    public static void main(String[] args) {
        char firstInitial;
        char middleInitial;
        char lastInitial;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the initial of you first name");
        firstInitial = input.next().charAt(0);
        firstInitial = Character.toUpperCase(firstInitial);
        
        System.out.println("Enter the initial of you first name");
        middleInitial = input.next().charAt(0);
        middleInitial = Character.toUpperCase(middleInitial);
        
        System.out.println("Enter the initial of you first name");
        lastInitial = input.next().charAt(0);
        lastInitial = Character.toUpperCase(lastInitial);
        
        //Checking if user entered number and giving an error if they did
        if (Character.isDigit(firstInitial) || (Character.isDigit(middleInitial)) ||(Character.isDigit(lastInitial))){
            System.out.println("I'm sorry, this game will not work.");
        }
        else{
            System.out.print("Your fantasy name is "+(char)(firstInitial + 5)+" ");
            System.out.print((char)(middleInitial - 4)+" ");
            System.out.println(lastInitial);
            double age = ((int)firstInitial + (int)lastInitial);
            System.out.println("Your age is "+ age);
            if ((age >=0)&&(age<=75)){
                System.out.println("you are a human");
            }
            else if ((age >=76)&&(age <=150)){
                System.out.println("you are a dwarf");
            }
            else if (age>=151){
                System.out.println("you are an elf");
            }
        }
    }
    
}
