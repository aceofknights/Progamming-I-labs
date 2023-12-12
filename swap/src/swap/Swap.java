/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

/**
 *
 * @author sizzl
 */
public class Swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int []arr = {0,1,2};
        
        swap(arr);
        
        System.out.println(arr[0]+" "+arr[1]+" "+arr[2]);
    }
    
    public static void swap(int[] x){
        
        int temp = x[0];
        x[0] = x[2];
        x[2] = temp;
    }
    
}
