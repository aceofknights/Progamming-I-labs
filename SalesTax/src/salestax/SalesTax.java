/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package salestax;
import java.util.Scanner;

public class SalesTax {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter price: ");
        
        double price = input.nextDouble();
        
        double salestax = (price * 0.0925);
        
        
        
        System.out.println(salestax);
        
        
        System.out.println("sales tax: $"+((int)(salestax * 100)/100.0));
        
    }
    
}
