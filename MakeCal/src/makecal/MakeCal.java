/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package makecal;
import java.util.Scanner;
public class MakeCal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a;
        int b;
        boolean answer;
        
        System.out.println("Enter first number;");
        a = input.nextInt();
        System.out.println("Enter second number");
        b = input.nextInt();
         
        int c;
        
        System.out.println("Enter answer:");
        c = input.nextInt();
        
        answer = (c == (a+b));
        
        if(answer){
            System.out.println("Good job!.");
        }
        else{
            System.out.println("check math");
        }

    }

}
