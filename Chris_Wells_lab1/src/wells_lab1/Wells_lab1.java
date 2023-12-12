//Author: Chris wells
//Date: 1/17
//1311 P01
//Lab 1
//This program creates a student object named stu and displays the values given
package wells_lab1;

public class Wells_lab1 {

    public static void main(String[] args) {
        //Creating object
        Student stu = new Student();
        
        //setting the objects fields to the chosen values
        stu.setFirstName("Chris");
        stu.setLastName("Wells");
        stu.setMajor("Programming");
        stu.setGpa(3.8);
        stu.setNumberOfClasses(4);
        stu.setAttending(true);
        
        //displays the values initialized eariler
        System.out.println("First name: "+ stu.getFirstName());
        System.out.println("Last name : "+ stu.getLastName());
        System.out.println("Major: "+stu.getMajor());
        System.out.println("GPA: "+ stu.getGpa());
        System.out.println("Number of classes: " +stu.getNumberOfClasses());
        System.out.println("Currently attending: " +stu.getAttending());
    }
    
}
