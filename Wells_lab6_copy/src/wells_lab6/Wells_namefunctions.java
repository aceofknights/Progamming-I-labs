
package wells_lab6;
import java.util.Scanner;
public class Wells_namefunctions {
    public static String ReadInput(){
        //This function asks user to input a name and returns the name to the main function
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a name: ");
        String name = input.nextLine();
        //returns a String to main function
        return name;
    }
    public static int ReadMonth(){
        //This function asks user to enter a birth month and returns the month to the main function
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter month of birth: ");
        int month = input.nextInt();
        //returns an int to main function
        return month;
    }
    public static int ReadDay(){
        //This function asks the user for a birth day and returns the day to the main function
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter day of birth: ");
        int day = input.nextInt();
        //returns an int to main function
        return day;
    }
    public static boolean CheckDates(int month, int day){
        //This function checks that the month and day entered by the user from the ReadMonth and ReadDay functions are valid dates
        
        //Setting check to false here allows us to return false unless we reach a true if statement
        boolean check = false;
        
        //checking that days fall between 1 to 31 for months that have 31 days and setting check to true
        if ((month == 1)||(month == 3)||(month == 5)|| (month == 7)||(month == 8)||(month == 10)||(month == 12)){
            if ((day>0)&&(day <=31)){
                check = true;
            }
        }
        //checking that days fall between 1 to 30 for months that have 30 days and setting check to true
        else if((month == 4)||(month == 6)||(month == 9)||(month == 11)){
            if ((day>0)&&(day <= 30)){
                check = true;
            }
        }
        //checking that days fall between 1 to 29 for months that have 29 days and setting check to true
        else if(month ==2){
            if ((day>0)&&(day <= 29)){
                check = true;
            }
        }
        //returns a true or false value to main function
        return check;
    }
    public static String AddName(String name, int month, int day){
        //This function adds the entered name, month, and day together in a way the printname function can read and seperate each part
        return name.concat("_"+month+"_"+day+"/");
    }
    public static void PrintName(String nameList){
        //This function will print out a nice table when the use enters -1 for name
        
        
        int start = 0;
        int end = 0;
        //This prints out our table header nicely formatted
        System.out.printf("%-15s %7s %n" ,"Name", "Birthday");
        do {
            //This sets end to the index of "/" from where ever start is
            //The addName function adds a "/" to the end of each persons information which lets use know when to start over for the next person
             end = nameList.indexOf("/",start);
             //this if statement will break the loop if there are no more "/" to be found
             if (end == -1){
                 break;
             }
             //this statement lets us seperate 1 person from everyone listed and store a sperate substring
             String info = nameList.substring(start,end);
             //This sets start to move to the index of the next person in our list
             start = end+1;
             
             //at this point we are working within the substring we created a few lines ago
             //the addname function seperated names, month, and days with "_". This statement looks for the first one and sets end to that index
             end = info.indexOf("_");
             //This statement stores the name in the substring
             String name = info.substring(0,end);
             //This move end to the next occurence of "_"
             end = info.indexOf("_",(end+1));
             //this line stores the month of the substring
             String month = info.substring(info.indexOf("_")+1,end);
             //This line stores the day of the substring
             String day = info.substring(end + 1);
             //this line handles the formatting for the table
             System.out.printf("%-15s %3s %4s %n",name,month,day);
        }
        while(end >= 0);
    }
}
