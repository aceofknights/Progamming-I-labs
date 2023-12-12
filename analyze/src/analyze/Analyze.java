/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analyze;
import java.util.*;
/**
 *
 * @author sizzl
 */
public class Analyze {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[]number = new int [100];
        
        Scanner input = new Scanner(System.in);
        
        for (int i =0;i<100;i++){
                System.out.println("Enter numbers: "+i);
                number[i]= input.nextInt();
        }
        int sum = 0;
        for (int i =0;i<100;i++){
            sum += number[i];
        }
        int avg = sum /100;
        
        int count = 0;
        for (int i =0;i<100;i++){
            if (number[i]>avg){
                count++;
            }
        }
    }
    
}
