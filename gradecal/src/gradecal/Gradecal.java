/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecal;
import java.util.*;
public class Gradecal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade;
        
        System.out.println("Enter grade");
        grade = input.nextDouble();
        if(grade >=0.0){
            if(grade <=100){
                if(grade >= 90.0){
                  System.out.println("A");
                }
                else if(grade >=80.0){
                  System.out.println("B");
                }
                else if(grade >=70.0){
                  System.out.println("C");
                }
                else if(grade >=60.0){
                  System.out.println("D");
                }
                else{
                  System.out.println("F");
                }
            }
            else{
                System.out.println("overachiever");
            }
        }
        else{
            System.out.println("negitive");
        }
    }
}
