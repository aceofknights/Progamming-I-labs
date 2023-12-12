//Author: Chris wells
//Date: 10/16
//1310 P01
//Lab 5
//This program will encrypt a message entered by the user
//if the encrypted message is entered into the decryption the original message will disply
package wells_lab5;
import java.util.Scanner;
public class Wells_lab5 {

    public static void main(String[] args) {
        int check;
        String enMessage = "";
        String message = "";
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("\"encrypt\" to encrypt, \"decrypt\" to decrypt, or \"-1\" to exit program.");
        String menu = input.nextLine();
        //cuts spaces off option user entered
        menu = menu.trim();
        
        //if user entered -1 the program will stop otherwise we continue on.
        while (!menu.equals("-1")){
            //This if statement started the encryption if user input encrypt
            if (menu.equalsIgnoreCase("encrypt")){
                //These two lines reset the strings for continued use of the encryption
                message = "";
                enMessage = "";
                
                System.out.println("Enter Message you want to encrypt");
                message = input.nextLine();
                //This for loop sets "check" to index 0 for the String message, it uses the following if statements 
                //to change the character at index0 then moves to the next index until finished with all characters
                for (check = 0; check < message.length(); check++){
                    //check for x, change it to a
                    if (message.charAt(check) == 120){
                        enMessage += (char)(message.charAt(check)-23);
                    }
                    //check for y, change it to b
                    if (message.charAt(check) == 121){
                        enMessage += (char)(message.charAt(check)-23);
                    }
                    //check for z, change it to c
                    if (message.charAt(check) == 122){
                        enMessage += (char)(message.charAt(check)-23);
                    }
                    //changes lower case letters 3 to the right on the ASCII table
                    if (97 <= message.charAt(check) && message.charAt(check)<=119){
                        enMessage += (char)(message.charAt(check)+3);    
                    }
                    //changes A to Z
                    if (message.charAt(check) == 65){
                        enMessage += (char)(message.charAt(check)+25);
                    }
                    //Changes B to Y
                    if (message.charAt(check) == 66) {
                        enMessage += (char)(message.charAt(check)+23);
                    }
                    //changes upper case letters 2 to the left on the ASCII table
                    if (67 <= message.charAt(check) && message.charAt(check)<=90){
                        enMessage += (char)(message.charAt(check)-2);
                    }
                    //changes any spaces to a number between 0-3
                    if (message.charAt(check)== 32){
                        enMessage += (char)(Math.random()*(3-0+1))+0;
                    }
                    //Changes . to '
                    if (message.charAt(check)== 46){
                        enMessage += (char)39;
                    }
                    //changes ? to _
                    if (message.charAt(check)== 63){
                        enMessage += (char)95;
                    }
                    //changes ! to +
                    if (message.charAt(check)== 33){
                        enMessage += (char)43;
                    }
                    //prints out the String message encrypted using the above if statements to change each character
                    //it does this by checking that the encrypted message is the same length as the normal message
                    if (message.length()==enMessage.length()){
                        System.out.println("your message is " + enMessage );
                        //This line resets the menu so the user can start over again
                        menu = "00";
                    }
                }
            }
            else if (menu.equalsIgnoreCase("decrypt")){
                //These two lines reset the strings for continued use of the encryption
                message = "";
                enMessage = "";
                System.out.println("Enter Message you want to decrypt");
                message = input.nextLine();
                
                for (check = 0; check < message.length(); check++){
                    //check for a, change it to x
                    if (message.charAt(check) == 97){
                        enMessage += (char)(message.charAt(check)+23);
                    }
                    //check for b, change it to y
                    if (message.charAt(check) == 98){
                        enMessage += (char)(message.charAt(check)+23);
                    }
                    //check for c, change it to z
                    if (message.charAt(check) == 99){
                        enMessage += (char)(message.charAt(check)+23);
                    }
                    //changes lower case letters 3 to the left on the ASCII table
                    if (100 <= message.charAt(check) && message.charAt(check)<=122){
                        enMessage += (char)(message.charAt(check)-3);    
                    }
                    //changes Z to A
                    if (message.charAt(check) == 90){
                        enMessage += (char)(message.charAt(check)-25);
                    }
                    //Changes Y to B
                    if (message.charAt(check) == 89) {
                        enMessage += (char)(message.charAt(check)-23);
                    }
                    //changes upper case letters 2 to the right on the ASCII table
                    if (65 <= message.charAt(check) && message.charAt(check)<=88){
                        enMessage += (char)(message.charAt(check)+2);
                    }
                    //changes 0,1,2,3 to a space
                    if (message.charAt(check)>= 48 && message.charAt(check)<= 51){
                        enMessage += (char)32;
                    }
                    //Changes ' to .
                    if (message.charAt(check)== 39){
                        enMessage += (char)46;
                    }
                    //changes _ to ?
                    if (message.charAt(check)== 95){
                        enMessage += (char)63;
                    }
                    //changes + to !
                    if (message.charAt(check)== 43){
                        enMessage += (char)33;
                    }
                    if (message.length()==enMessage.length()){
                        System.out.println("your message is " + enMessage );
                        //This line resets the menu so the user can start over again
                        menu = "00";
                    }    
                }
            }
            //This else if statement is needed becasue if a user enters a single 
            //character for the menu it will ask for the menu again
            //other wise the following else if statement would cause an error by 
            //asking for a substring that is longer than the sting
            else if (menu.length()==1){
                System.out.println("\"encrypt\" to encrypt, \"decrypt\" to decrypt, or \"-1\" to exit program.");
                menu = input.nextLine();
            }
            //this else if statement closes the program is the user enters -1
            else if (menu.substring(0,2).equals("-1")){
                break;
            }
            //this else statement defaults the menu back to the user if they entered a wrong value
            else {
                System.out.println("\"encrypt\" to encrypt, \"decrypt\" to decrypt, or \"-1\" to exit program.");
                menu = input.nextLine();
            } 

        }
        
    }
    
}
