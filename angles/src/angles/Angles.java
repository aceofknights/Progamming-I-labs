/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package angles;
import java.util.Scanner;
public class Angles {

    public static void main(String[] args) {
        // TODO code application logic here
        double ax, ay;
        double bx ,by;
        double cx, cy;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter ax cordinate");
        ax = input.nextDouble();
        System.out.println("Enter ay cordinate");
        ay = input.nextDouble();
        System.out.println("Enter bx cordinate");
        bx = input.nextDouble();
        System.out.println("Enter by cordinate");
        by = input.nextDouble();
        System.out.println("Enter cx cordinate");
        cx = input.nextDouble();
        System.out.println("Enter cy cordinate");
        cy = input.nextDouble();
        
        double a, b, c;
        
        a = Math.sqrt(Math.pow((by - ay), 2)+Math.pow((bx - ax),2));
        b = Math.sqrt(Math.pow((cy - by), 2)+Math.pow((cx - bx),2));
        c = Math.sqrt(Math.pow((cy - ay), 2)+Math.pow((cx - ax),2));
        
        System.out.println("Distance: " +a + " "+b + " " + c);
        
        double angleA ,angleB, angleC;
        angleA = Math.acos((a*a - b*b - c*c) / (-2*b*c));
        angleB = Math.acos((b*b - a*a - c*c) / (-2*a*c));
        angleC = Math.acos((c*c - b*b - a*a) / (-2*a*b));
        System.out.println("Angles: "+angleA+" "+angleB+" "+angleC);
    }
    
}
