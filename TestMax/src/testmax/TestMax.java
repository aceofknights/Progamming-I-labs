/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testmax;

/**
 *
 * @author sizzl
 */
public class TestMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 3;
        int y = 2;
        System.out.println(max(x,y));
    }
    
    public static int max(int num1, int num2){
        if (num1 > num2){
            return num1;
        }
        else{
            return num2;
        }
        
    }
    public static double max(double num1, double num2){
        if (num1 > num2){
            return num1;
        }
        else{
            return num2;
        }
        
    }
    
}
