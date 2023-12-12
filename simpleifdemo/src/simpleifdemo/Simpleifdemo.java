/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpleifdemo;
import java.util.Scanner;

public class Simpleifdemo {

    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        a = input.nextInt();
        
        boolean multFive = false;
        multFive = (a%5==0);
        
        boolean even = false;
        even = (a%2==0);
        
        if(multFive){
            System.out.println("High five!");
        }
        if(even){
            System.out.println("Is Even");
        }
    }
    
}
