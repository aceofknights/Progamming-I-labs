
package beespratice;
import java.util.*;
public class BeesPratice {

    public static void main(String[] args) {
        
        Bees [] bees = new Bees[100];
        Random rd = new Random();
        
        for(int i = 0;i<bees.length;i++){
            
            bees[i]= new Bees(rd.nextBoolean());
            
            if (bees[i].getStatus()==true){
                bees[i].incrementHoneyCount();
            }
        }
        System.out.println("the amount of honey is: " + bees[0].getHoneyCount());
    }
}
