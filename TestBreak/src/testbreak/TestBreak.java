/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testbreak;

/**
 *
 * @author sizzl
 */
public class TestBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=0;
        int sum=0;
        
        while(num < 20){
            num++;
            sum += num;
            System.out.printf("%4d%4d\n", num, sum);
            if(sum >=100){
                System.out.println("break time");
                break;
                
            }
        }
    }
    
}
