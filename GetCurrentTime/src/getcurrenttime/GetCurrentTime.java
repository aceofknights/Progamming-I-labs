/*
 * author chris wells
 */
package getcurrenttime;

public class GetCurrentTime {

    public static void main(String[] args) {
        long tot_sec = 0;
        long tot_min = 0;
        long tot_hours = 0;
        
        System.out.println("The current time is: ");
        
        long milli = System.currentTimeMillis();
        
        System.out.println(milli);
        
        tot_sec = milli / 1000;
        
        long curr_sec = tot_sec % 60;
        tot_min = (tot_sec) / 60;
        long curr_min = tot_min % 60;
        tot_hours = tot_min / 60;
        long curr_hours = tot_hours % 24;
        
        System.out.println((curr_hours -4)+": "+curr_min+": "+curr_sec);
        
        
        
        
        /*
        min = sec / 60;
        hours = min / 60;
        
        min = min - (hours * 60);
        
        sec = sec - (hours * 60 * 60) - (min * 60);
        
        System.out.println("Time: "+(hours%24)+": "+min+": "+sec);
*/
    }
    
}
