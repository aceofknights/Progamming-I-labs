//Author: Chris wells
//Date: 2/1
//1311 P01
//Lab 2
//contains student methods for lab 2
package wells_lab2;

public class Student extends Person {
    
    String college;
    String major;
    double gpa;

    //accessor for college
    public String getCollege() {
        return college;
    }

    //accessor for major
    public String getMajor() {
        return major;
    }

    //accessor for gpa
    public double getGpa() {
        return gpa;
    }

    //mutator for college
    public void setCollege(String college) {
        this.college = college;
    }

    //mutator for major
    public void setMajor(String major) {
        this.major = major;
    }

    ////mutator for gpa
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    //override print method to print information on person
    @Override
    public String toString() {
        return fname + " " + lname + ", "+ college +" " + major + "GPA: " + gpa;
    }
    
    
    
}
