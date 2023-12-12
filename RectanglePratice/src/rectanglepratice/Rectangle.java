
package rectanglepratice;
import java.util.*;
public class Rectangle {
    float length = 1;
    float width = 1;
    Scanner input = new Scanner(System.in);
    Rectangle(){
        
    }
    Rectangle(float l,float w){
        length = 1;
        width = w;
    }
    void setLength(float l){
        length = l;
    }
    void setWidth(float w){
        width = w;
    }
    double getArea(){
        double area = length*width;
        return area;
    }
}
