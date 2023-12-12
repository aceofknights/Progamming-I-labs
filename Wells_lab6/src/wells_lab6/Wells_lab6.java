//Author: Chris wells
//Date: 10/24
//1310 P01
//Lab 6
//This program will ask the user to enter a name and date of birth
//the user can add as many names and birthdays as they wish until they exit the program
//the program will format all the information into a table thats easy to read
package wells_lab6;

public class Wells_lab6 {

    public static void main(String[] args) {
        String nameList = "";
        String name = "";
        //Use of do-while loop so user can keep adding information
        do {
            //Calls the ReadInput functions that asks user for name and stores it
            name = Wells_namefunctions.ReadInput();
            //exits program loop if -1 is entered
            if (name.startsWith("-1")){
                break;
            }
            //calls the readMonth functions that asks user for month of birth and stores it
            int month = Wells_namefunctions.ReadMonth();
            //calls the readday functions that asks user for day of birth and stores it
            int day = Wells_namefunctions.ReadDay();
            //checks that the birthdate given is an actually day
            if (Wells_namefunctions.CheckDates(month, day) == false) {
                System.out.println("There is an error with your dates and this name will not be added.");
                continue;
            }
            //calls the addname function which adds all the information entered together 
            else{
                nameList += Wells_namefunctions.AddName(name, month, day);
            }
        } while (!name.startsWith("-1"));
        Wells_namefunctions.PrintName(nameList);
    }
}
