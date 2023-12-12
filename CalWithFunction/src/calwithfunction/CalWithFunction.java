/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calwithfunction;
import java.util.Scanner;
/**
 *
 * @author sizzl
 */
public class CalWithFunction {

    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,op, result;
        Scanner input = new Scanner(System.in);
        
        System.out.println("enter number 1: ");
        a = input.nextInt();
        System.out.println("Enter number 2: ");
        b = input.nextInt();
        
        System.out.println("enter operation 0 for +, 1 for *, 2 for -, 3 for /");
        op = input.nextInt();
        
        switch(op){
            case 0: 
            case 1:
            case 2:
            case 3:
                result = maff.doMaff(a, b, op);
                System.out.println(result);
            default:
                break;
                
                        
        }
    }
    
}
