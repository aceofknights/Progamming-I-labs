/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recktangle;

public class Recktang {
    int length;
    int width;
    
    private int prem;
    
    Recktang(){
        
    }
    Recktang(int l, int w){
        length = l;
        width = w;

        updatePerm();
    }
    
    void updatePerm(){
        prem = (length*2)+(width*2);
    }
    
    void PrintPerm(){
        System.out.println(prem);
    }
    
    int getPerm(){
        return prem;
    }
}
