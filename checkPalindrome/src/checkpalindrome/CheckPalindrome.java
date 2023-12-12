
package checkpalindrome;
import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter word: ");
        String word = input.nextLine();
        
        String dup = "";
        int count = 0;
        for(int i =0; i < word.length();i++){
            count = 0;
            for(int j =0; j < word.length();j++){
                if (word.charAt(i) == word.charAt(j)){
                    count++;
                }
                if (count > 1){
                    char letter = word.charAt(i);
                    //Character.toString(letter);
                    if (dup.endsWith(Character.toString(letter))){
                        
                        
                    }
                    else{
                    dup = dup+word.charAt(i);
                    }
                }    
            }
            
            
        }
        
        for(int i =0;i < word.length();i++){
                System.out.print(dup);
            
        }
    }
}
