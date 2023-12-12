//Author: Chris wells
//Date: 1/17
//1311 P01
//Lab 1
//This is a list of methods to go with lab 1
package wells_lab1;

public class Student {
    String firstName;
    String lastName;
    String major;
    double gpa;
    int numberOfClasses;
    boolean attending;
    
    //student constructor
    Student(){
        String firstName;
        String lastName;
        String major;
        double gpa;
        int numberOfClasses;
        boolean attending;
    }
    //mutator for first name
    void setFirstName(String firstName){
        this.firstName = firstName;
    }
    //accessor for first name
    String getFirstName(){
        return firstName;
    }
    //mutator for last name
    void setLastName(String lastName){
        this.lastName = lastName;
    }
    //accessor for last name
    String getLastName(){
        return lastName;
    }
    //mutator for major
    void setMajor(String major){
        this.major = major;
    }
    //accessor for major
    String getMajor(){
        return major;
    }
    //mutator for gpa
    void setGpa(double gpa){
        this.gpa = gpa;
    }
    //accessor for gpa
    double getGpa(){
        return gpa;
    }
    //mutator for number of classes
    void setNumberOfClasses(int numClass){
        numberOfClasses = numClass;
    }
    //accessor for number of classes
    int getNumberOfClasses(){
        return numberOfClasses;
    }
    //mutator for attending
    void setAttending(boolean attend){
        attending = attend;
    }
    //accessor for attending
    boolean getAttending(){
        return attending;
    }
}
