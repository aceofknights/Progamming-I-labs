/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gettime;
import java.util.*;

public class GetTime {

    public static void main(String[] args) {
        int seconds;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter seconds: ");
        seconds = input.nextInt();
        
        int minutes;
        
        minutes = seconds / 60;
        seconds = seconds % 60;
        
        System.out.println("Minutes: "+ minutes +" Seconds; " + seconds);
    }
    
}
