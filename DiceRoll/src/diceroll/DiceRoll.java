/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diceroll;
import java.util.Scanner;

public class DiceRoll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("How many dice rolls?: ");
        int times = input.nextInt();
        int [] dice = new int[times];
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        for(int i=0;i<times;i++){
            dice[i] = (int)(Math.random()*(6))+1;
            //System.out.println(dice[i]);
            if (dice[i] == 1){
                one++;
            }
            if (dice[i] == 2){
                two++;
            }
            if (dice[i] == 3){
                three++;
            }
            if (dice[i] == 4){
                four++;
            }
            if (dice[i] == 5){
                five++;
            }
            if (dice[i] == 6){
                six++;
            }
            
        }
        System.out.printf("%8s%8s%n%8s%8d%n%8s%8d%n%8s%8d%n%8s%8d%n%8s%8d%n%8s%8d%n",
                          "Roll","Count","1",one,"2",two,"3",three,"4",four,"5",five,"6",six);
    }
    
}
