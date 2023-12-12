
package tictactoe;
import java.util.*;

public class TicTacToe {

    public static void main(String[] args) {
        //making board and filling it to be empty
        char [][] board = new char [3][3];
        for(int i = 0;i<board.length;i++){
            for(int j = 0 ; j<board[i].length;j++){
                board[i][j] = '-';
            }
        }
        
        boolean gameOn = false; 
        Scanner input = new Scanner(System.in);
        
        do{
           System.out.println("Would you like to play a game?");
           String answer = input.nextLine(); 
           if(answer.equalsIgnoreCase("yes")){
               gameOn = true;
               System.out.println("Heck yeah brother!!!!!");
               break;
           }
           else{
               System.out.println("What a shame");
           } 
        }
        while(gameOn == false);
        
        System.out.println("-123");
        for(int i = 0;i<board.length;i++){
            System.out.println();
            for(int j = 0 ; j<board[i].length;j++){
                System.out.print(board[i][j]);
            }
        }
        
        
        System.out.println();
    }
    
}
