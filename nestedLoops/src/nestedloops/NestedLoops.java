/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedloops;

/**
 *
 * @author sizzl
 */
public class NestedLoops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.printf("%4d", (i *j));
            }
            System.out.printf("\n");
        }
    }
    
}
