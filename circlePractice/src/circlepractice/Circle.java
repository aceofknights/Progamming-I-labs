
package circlepractice;

public class Circle {
    double radius;
    double perimeter;
    static int numOfCircle;
    Circle(){
        radius = 1;
        perimeter = 2*Math.PI*radius;
    }
    static void intCount(){
    numOfCircle =1;
}
    
    Circle(double r){
        radius = r;
        perimeter = 2*Math.PI*radius;
    }
    
    double getArea(){
        radius = 1;
        return Math.PI*Math.pow(radius,2);
    }
    
}

