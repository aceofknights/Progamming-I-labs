//Author: Chris wells
//Date: 2/1
//1311 P01
//Lab 2
//this contain the methods for the person class in lab 2
package wells_lab2;

public class Person {
    
    //fields for person class
    String fname;
    String lname;
    int age;

    //accessor for first name
    public String getFname() {
        return fname;
    }

    //accessor for last name
    public String getLname() {
        return lname;
    }

    //accessor for age name
    public int getAge() {
        return age;
    }

    //mutator for first name
    public void setFname(String fname) {
        this.fname = fname;
    }

    //mutator for last name
    public void setLname(String lname) {
        this.lname = lname;
    }

    //mutator for age
    public void setAge(int age) {
        this.age = age;
    }
    
    //override print method to print information on person
    @Override
    public String toString(){
        return fname + " " + lname + ", "+ age;
    }
    
    
}
