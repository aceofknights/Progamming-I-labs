
package rectanglepratice;
import java.util.*;

public class RectanglePratice {

    public static void main(String[] args) {
        System.out.println("Enter Length of rectangle and width of rectangle: ");
        Scanner input = new Scanner(System.in);
        
        //making new object
        Rectangle rec = new Rectangle();
        
        rec.setLength(input.nextFloat());
        rec.setWidth(input.nextFloat());
        System.out.println(rec.getArea());
        Rectangle r = new Rectangle();
        
    }
    
}
