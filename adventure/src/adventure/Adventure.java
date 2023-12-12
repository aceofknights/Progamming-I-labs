
package adventure;
import java.util.*;

public class Adventure {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Want to play a game yes/no");
        String answer = input.nextLine();
        
        if (answer.toLowerCase().trim().equals("yes")){
            
        }
        else{
            System.out.println("Too bad");
        }
    }
    
}
