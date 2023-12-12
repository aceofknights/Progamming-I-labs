/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbooleanoperators;
import java.util.*;
public class Testbooleanoperators {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        
        System.out.println("give a whole number");
        num = input.nextInt();
        
        if((num%2 == 0) && (num%3 ==0)){
            System.out.println("divisible by 2 and 3");
        }
        else if((num%2 ==0)||(num%3 ==0)){
            System.out.println("divisable by 2 or 3");
        }
        if ((num%2==0)^(num%3==0)){
            System.out.println("divisable by 2 or 3 but not both");
        }
    }
    
}
