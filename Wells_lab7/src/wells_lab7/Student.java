//Author: Chris wells
//Date: 11/19
//1310 P01
//Lab 8
//List of functions to go with lab 8
package wells_lab7;

import java.util.Scanner;


public class Student {
        //function adds the entered grade to the array the user wants
    public static double[] AddGrade(double[] arr){
        Scanner input = new Scanner(System.in);
        //calling a function to make the array bigger
        arr = IncreaseArray(arr);
        
        //This sections adds the entered grade to the end of the array
        System.out.println("Enter Grade: ");
        arr[arr.length-1]= input.nextDouble();
        
        return arr;
    }
    //functions to make an array bigger
    public static double[] IncreaseArray(double[] arr){
        //createing a new array that 1 size bigger than source array
        double[] newArr = new double[arr.length+1];
        //calling the copy array function to make the new array equal the old array
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }
    //function to print out all of the grades entered
    public static void PrintStats(double[] q , double[] e, double[] l){
        System.out.printf("%-10s","Quizzes:");
        //for loop formats each grade separately until it reaches the end
        for(int i = 0;i<q.length;i++){
            System.out.printf("%7.2f", q[i]);
        }
        System.out.printf("%n%-10s","Exams:");
        for(int i = 0;i<e.length;i++){
            System.out.printf("%7.2f", e[i]);
        }
        System.out.printf("%n%-10s","Labs:");
        for(int i = 0;i<l.length;i++){
            System.out.printf("%7.2f", l[i]);
        }
        System.out.println();
    }
}
