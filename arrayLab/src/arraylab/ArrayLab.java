
package arraylab;
import java.util.*;

public class ArrayLab {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr;
        int[] dup;
        
        System.out.print("Enter size of array:");
        int num = input.nextInt();
        arr = new int[num];
        dup = new int[num];
        int count = 0;
        System.out.println("enter "+ arr.length + " numbers");
        for(int i = 0; i < num; i++){
            arr[i] = input.nextInt();
        }
        
        for(int i =0;i < arr.length;i++){
            count = arr [i];
            dup [count] +=1;
        }
        
        for(int i =0;i < arr.length;i++){
            if(dup[i]>1){
                System.out.print("");
            }
        }
        
        
        
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(dup[i] + " ");
            if(dup[i]>1){
                System.out.print(dup[i]+" ");
            }
        }
        
        
        
        /*
        
        for(int i = 0; i < arr.length; i++ ){
            for(int j = 1; i+j < arr.length; j++){
                if (arr[i]==arr[i+j]){
                    dup[i] += 1;
                }
            }
        }
        System.out.print("The duplicates are: ");
        for (int i = 0; i < arr.length; i++) {
            //System.out.print(dup[i] + " ");
            if (dup[i]>0){
                System.out.print(arr[i]+" ");
            }
        }
        */
    }
    
}
