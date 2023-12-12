/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recktangle;

public class Recktangle {

    public static void main(String[] args) {
        Recktang[] rArr = new Recktang[10];
        
        
        
        for(int i = 0;i<rArr.length;i++){
            rArr[i]= new Recktang();
            rArr[i].length = i+1;
            rArr[i].width = i+1;
            rArr[i].updatePerm();
        }
        int total = 0;
        for (int i = 0;i<rArr.length;i++){
            total += rArr[i].getPerm();
        }
        System.out.println(total);
    }
    
}
