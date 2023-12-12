//Author: Chris wells
//Date: 2/1
//1311 P01
//Lab 2
//This program is a test file for creating and displaying objects relating to lab 2
package wells_lab2;

public class Wells_lab2 {

    public static void main(String[] args) {
        //creating person object
        Person person = new Person();
        
        //setting person fields
        person.setAge(29);
        person.setFname("Chris");
        person.setLname("wells");
        
        //printing out person information
        System.out.println(person.toString());
        
        //creating student object
        Student stu = new Student();
        
        //setting student fields
        stu.setFname("John");
        stu.setLname("Doe");
        stu.setCollege("PSCC");
        stu.setMajor("CIT-Programming major, ");
        stu.setGpa(3.75);
        
        //printing student information
        System.out.println(stu.toString());
        
        //creating employee onject
        Employee e = new Employee();
        
        //setting employee fields
        e.setFname("Jane");
        e.setLname("Done");
        e.setEmployer("IBM");
        e.setJobTitle("Senior Programmer");
        e.setSalary(150123.45);
        
        //printing employee information
        System.out.println(e.toString());
    }
    
}
