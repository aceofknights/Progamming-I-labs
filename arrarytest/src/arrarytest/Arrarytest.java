/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrarytest;
import java.util.*;
/**
 *
 * @author sizzl
 */
public class Arrarytest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        //creating an array called arr but not setting the size yet
        int[] arr;
        
        //asking the user for array size and setting desired size
        System.out.print("Enter number of things to read in:");
        int num = input.nextInt();
        arr = new int[num];
        
        //asking the user for numbers to fill array spaots
        System.out.println("enter "+ arr.length + " numbers");
        for(int i = 0; i < num; i++){
            arr[i] = input.nextInt();
        }
        
        //going through and summing all members of the array and storing in total
        int total = 0;
        for(int i = 0; i < num; i++)
        {
            total = total + arr[i];
        }
        
        //printing the total and average
        System.out.println(total);
        System.out.println(total/ arr.length);
        
        //creating a min and max variable and setting both to be the first element in the array
        int max = arr[0];
        int min = arr[0];
        
        
        for (int valu : arr){
            if(valu > max)
                max = valu;
            
            if(valu < min)
                min = valu;
        }
        
        //going through the array again
        for(int i = 1; i < arr.length; i++ ){
            
            //if the current number we are looking at is bigger than our previous max, set max to be this
            //number
            if(arr[i] > max)
                max = arr[i];
            
            //if the current number we are looking at is smaller than our previous min, set max to be this
            //number
            if(arr[i] < min)
                min = arr[i];
        }
        
        //printing out the max and min with formatting
        System.out.printf("%4s%-4d%4s%-4d\n", "Max:", max, "Min:", min);  
    }
    
}
