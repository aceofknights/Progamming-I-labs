/*author Chris and Jared
*8/29
*citc1310 P01
*Paired Programming Assignment
 */
package concertprogram;

import java.util.Scanner;

public class ConcertProgram {
    public static void main(String[] args) {
        int ID;
        double age;
        double price;
        double days;
        double hours = 0;
        double minutes = 0;
        double seconds = 0;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, what is your unique ID?");
        ID = input.nextInt();
        System.out.println("Hello " + ID + " I'm excited for you to attend the concert. How old are you?");
        age = input.nextInt();
        price = age * .25;
        System.out.println("All right, your ticket is " + price + " How many days until the concert?");
        days = input.nextDouble();
        System.out.println("How fun, "+ ID+ "! Your concert is in: ");
        hours = (days * 24)-((days * 24)%1);
        System.out.println(hours + " hours");
        minutes = (((days * 24)%1) * 60) - ((days * 24 %1) *60)%1;
        System.out.println(minutes + " minutes");
        seconds = ((((days *24)%1)*60)%1)*60;
        System.out.println("and " +seconds+" seconds! We can't wait to see you there!");
    }
    
}
