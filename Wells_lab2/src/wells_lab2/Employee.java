//Author: Chris wells
//Date: 2/1
//1311 P01
//Lab 2
//contains employee methods for lab 2
package wells_lab2;

public class Employee extends Person{
    
    String employer;
    String jobTitle;
    double salary;

    //accessor for employer
    public String getEmployer() {
        return employer;
    }

    //accessor for job title
    public String getJobTitle() {
        return jobTitle;
    }

    //accessor for salary
    public double getSalary() {
        return salary;
    }

    //mutator for employer
    public void setEmployer(String employer) {
        this.employer = employer;
    }

    //mutator for job title
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    //mutator for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    //override print method to print information on person
    @Override
    public String toString() {
        return String.format("%s%s%s%s%s%s%s%s%,.2f",fname , " " , lname , ", " , employer , " " , jobTitle , ", salary: $" , salary);
    }
    
    
    
}
