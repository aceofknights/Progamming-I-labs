/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getcelcius;
import java.util.*;

public class GetCelcius {

    public static void main(String[] args) {
        
        double answer = 32;
        double answer1 = 30;
        double answer2 = 0;
        double answer3 = 100;
        cel(answer);
        cel(answer1);
        cel(answer2);
        cel(answer3);

    }
    
    static double faren;
    static public void cel(double faren){
        GetCelcius.faren=faren;
        double celcius;
        //Scanner input = new Scanner(System.in);
        //System.out.println("Enther degrees in Farenheit");
        //faren = input.nextDouble();
        

        celcius = (5.0/9)*(faren - 32);
        System.out.println(celcius);
        
    }
    
    
}

