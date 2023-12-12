//Author: Chris wells
//Date: 11/19
//1310 P01
//Lab 8
//List of functions and constructors go with lab 8
package wells_lab8;

import java.util.Scanner;

public class Student {
    
    
    public String name;
    private double [] quiz = new double[0];
    private double [] lab = new double[0];
    private double [] exam = new double[0];
    
    //creating a student object constructor
    Student(){
    quiz = new double[0];
    lab = new double[0];
    exam = new double[0];
    }
    //creating a student object constructor if a string for student name is given
    Student(String name){
        quiz = new double[0];
        lab = new double[0];
        exam = new double[0];
        this.name = name;
    }
    //set the name of a student object
    void setName(String name){
        this.name = name;
    }
    //function adds the entered grade to the array the user wants
    private double[] AddGrade(double[] arr){
        Scanner input = new Scanner(System.in);
        double grade;
        System.out.println("Enter Grade: ");
        
        grade = input.nextDouble();
        //checking if the entered grade is in the valid range    
        if (grade < 0.0 || grade > 100.0){
            System.out.println("Grade out of range please try again");
        }
        else{
            arr = IncreaseArray(arr);
            arr[arr.length-1] = grade;
        }
        
        return arr;
    }
    //functions to make an array bigger
    private double[] IncreaseArray(double[] arr){
        //createing a new array that 1 size bigger than source array
        double[] newArr = new double[arr.length+1];
        //calling the copy array function to make the new array equal the old array
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
        
    }
    //function to calculate the final grade for the student
    private void computeGrade(){
        //checks if atleast 1 grade has been entered for each category
        if(quiz.length == 0 || exam.length == 0 || lab.length == 0){
            System.out.println("Cannot calculate grade atleast one grade is needed in quiz, lab, exam");
        }
        else{
            System.out.printf("%-10s","Quizzes:");
            //for loop formats each grade separately until it reaches the end
            for(int i = 0;i<quiz.length;i++){
                System.out.printf("%7.2f", quiz[i]);
            }
            System.out.printf("%n%-10s","Exams:");
            for(int i = 0;i<exam.length;i++){
                System.out.printf("%7.2f", exam[i]);
            }
            System.out.printf("%n%-10s","Labs:");
            for(int i = 0;i<lab.length;i++){
                System.out.printf("%7.2f", lab[i]);
            }
            System.out.println();
            
            //next few lines add up all the grades into a final sum
            double quizAverage = 0;
            for(int i = 0; i<quiz.length ; i++){
                quizAverage += quiz[i];
            }
            double examAverage = 0;
            for(int i = 0; i<exam.length ; i++){
                examAverage += exam[i];
            }
            double labAverage = 0;
            for(int i = 0; i<lab.length ; i++){
                labAverage += lab[i];
            }
            //these lines divide the sum by how many grades were entered to get the average
            quizAverage = quizAverage/quiz.length;
            examAverage = examAverage/exam.length;
            labAverage = labAverage/lab.length;
            
            //last calculation to get the weighted grades
            double finalGrade = (labAverage * .4)+(examAverage * .4)+(quizAverage * .2);
            System.out.printf("%1.2f%3s", finalGrade,"");
            
            //going through some if statements to display the correct letter grade
            if(finalGrade >= 93.0){
                  System.out.println("A");
                }
                else if(finalGrade >=88.0){
                  System.out.println("B+");
                }
                else if(finalGrade >=83.0){
                  System.out.println("B");
                }
                else if(finalGrade >=78.0){
                  System.out.println("C+");
                }
                else if(finalGrade >=73.0){
                  System.out.println("C");
                }
                else if(finalGrade >=65.0){
                  System.out.println("D");
                }
                else{
                  System.out.println("F");
                }
        }
    }
    //this function takes the number the user entered and gives the addGrade function the matching array
    void gradeOption(int option){
        switch (option){
            case 1:
                quiz = AddGrade(quiz);
                break;
            case 2:
                exam = AddGrade(exam);        
                break;
            case 3:
                lab = AddGrade(lab);        
                break;
        }
    }
    //function to print out all of the grades entered and the final calculations
    void PrintStats(){
        computeGrade();
    }
}
