/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calwithfunction;

/**
 *
 * @author sizzl
 */
public class maff {
    
    public static int doMaff(int num1, int num2, int op){
        if (op ==0){
            return num1+num2;
            
        }
        if (op==1){
            return num1*num2;
        }
        if (op==2){
            return num1-num2;
        }
        if (op==3){
            return num1/num2;
        }
        return -1;
    }
    
    
    public static int subtract(int num1, int num2){
        
        
        return num1 - num2;
    }
}
