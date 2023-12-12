
package pkg2darray;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] [] nums = new int[3][4];
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (int)(Math.random()*(10-0+1))+0;
            }
        }
        int total = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j]+" ");
                total += nums[i][j];
            }
            System.out.println();
            System.out.println(total);
        }
    }
    
}
