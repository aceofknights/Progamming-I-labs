
package welcome2;
import java.util.Scanner;
public class Wells_namefunctions {
    
    public static String ReadInput(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String name = input.nextLine();
        return name;
    }
    public static int ReadMonth(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month");
        int month = input.nextInt();
        return month;
    }
    public static int ReadDay(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter day");
        int day = input.nextInt();
        return day;
    }
    public static boolean CheckDates(int month, int day){
        boolean check = false;
        if (month <= 12){
            if ((month == 1)||(month == 3)||(month == 5)|| (month == 7)||(month == 8)||(month == 10)||(month == 12)){
                if (day <=31){
                    check = true;
                }
            }
            else if((month == 4)||(month == 6)||(month == 9)||(month == 11)){
                if (day <= 30){
                    check = true;
                }
            }
            else if(month ==2){
                if (day <= 29){
                    check = true;
                }
            }
        }
        return check;
    }
    public static String AddName(String name, int month, int day){
        return name.concat("_"+month+"_"+day+"/");
    }
    public static void PrintName(String nameList){
        int start = 0;
        int end = 0;
        System.out.printf("%-15s %7s %n" ,"Name", "Birthday");
        do {
             end = nameList.indexOf("/",start);
             if (end == -1){
                 break;
             }
             String info = nameList.substring(start,end);
             start = end+1;
             end = info.indexOf("_");
             String name = info.substring(0,end);
             end = info.indexOf("_",(end+1));
             String month = info.substring(info.indexOf("_")+1,end);
             String day = info.substring(end + 1);
             System.out.printf("%-15s %3s %4s %n",name,month,day);
        }
        while(end >= 0);
        System.exit(0);
    }
}
