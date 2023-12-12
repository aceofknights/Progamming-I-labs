/*
 * Dialog example from: https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
 * Modified by Andrey Puretskiy
 */

package dialogue;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author apuretskiy
 */
public class Dialogue {
    private static JFrame frame;
    public static void main(String[] args)
    {
       Object[] possibilities = {"ham", "spam", "yam"};
       String s = (String)JOptionPane.showInputDialog(frame,
                    "Complete the sentence:\n"
                    + "\"Green eggs and...\"",
                    "Customized Dialog",
                    JOptionPane.PLAIN_MESSAGE,
                    null,// no custom icon
                    possibilities, //replace possibilities with null if want to let user enter text
                    "ham");

//If a string was returned, say so.
if ((s != null) && (s.length() > 0)) {
    JOptionPane.showMessageDialog(frame, "Green eggs and... " + s + "!");
    return;
}
else{
//If you're here, the return value was null/empty.
JOptionPane.showMessageDialog(frame, "No answer selected");
 
 }
  
 }
}