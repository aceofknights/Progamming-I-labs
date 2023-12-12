/* Author Chris
Date 8/22/22
citc1310 P01
First program
 */
package welcome;

//contains my main method
import java.util.Random;

public class Welcome {

    //*Main: prints out some statements
    public static void main(String[] args) {
        Random random = new Random();
        
        System.out.println(random.nextDouble() * 300 + 100);
    }
}
