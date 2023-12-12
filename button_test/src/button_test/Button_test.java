
package button_test;
import java.util.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

class myJavaFx extends Application {
    @Override
    public void start(Stage primaryStage){
        Button btOK = new Button("OK");
        Scene scene = new Scene(btOK, 200, 250);
        primaryStage.setTitle("Myjavafx");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
}



public class Button_test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Application.launch();
    }
    
}
