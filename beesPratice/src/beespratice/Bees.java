
package beespratice;

public class Bees {
    private String sounds;
    static int honeyCount;
    boolean isWorkerBee;
    
    Bees(){
        sounds = "buzz";
        isWorkerBee = true;
    }
    
    Bees(boolean isWorkerBee){
        sounds = "buzz";
        this.isWorkerBee = isWorkerBee;
    }
    
    int getHoneyCount(){
        return honeyCount;
    }
    
    void incrementHoneyCount(){
        honeyCount++;
    }
    
    boolean getStatus(){
        return isWorkerBee;
    }
    
}
