//Author: Chris wells
//Date: 3/22
//1311 P01
//Lab 5
//This program creates 3 java fx stages each doing something a little different
package c_wells_lab5;

import java.awt.Image;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class C_Wells_lab5 extends Application {

    //creating first stage
    public void start(Stage primaryStage) {

        //creating a grid pane to hold button objects
        GridPane gridPane = new GridPane();
        //setting some space between the grid
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        //Center the grid in the stage
        gridPane.setAlignment(Pos.CENTER);

        //for loops to cycle through each grid space and add a button
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                Button button = new Button();
                gridPane.add(button, i, j);
            }
        }

        //making a scene
        Scene scene = new Scene(gridPane);

        //setting stage to have a title and scene then displaying it
        primaryStage.setTitle("Stage1");
        primaryStage.setScene(scene);
        primaryStage.show();

        //making the second stage
        Stage secondStage = new Stage();

        //creating a grid pane to hold some objects
        GridPane gridPane2 = new GridPane();
        //making space between grid
        gridPane2.setHgap(10);
        gridPane2.setVgap(10);
        //centering the grid
        gridPane2.setAlignment(Pos.CENTER);

        //loop to generate a random 1 and 0 
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //creating text field object
                TextField textField = new TextField();
                //making the text field so it cant be changed
                textField.setEditable(false);
                //making the boxes for the text a good size
                textField.setPrefWidth(40);
                //centers text in textfield
                textField.setAlignment(Pos.CENTER);
                //getting random number
                int x = (int) (Math.random() * (1 + 1));
                //setting the text field to that the number from before
                textField.setText(Integer.toString(x));
                //adding the textfield to the grid pane
                gridPane2.add(textField, i, j);

            }
        }

        //making the second scene
        Scene scene2 = new Scene(gridPane2);

        //same as before giving the stage a title setting the scene and displaying it
        secondStage.setTitle("Second Stage");
        secondStage.setScene(scene2);
        secondStage.show();

        //making a new stage
        Stage thirdStage = new Stage();
        //making a string set to the url of an image 
        //String url = "https://i.pinimg.com/originals/51/0d/a9/510da98abbe03f7ff9a7ce6eb0f362e7.jpg";
        //making a imageview object and passing it our url
        ImageView ImageView = new ImageView("chad.jpg");
        //making a pane to hold the imageview
        Pane Pane = new Pane(ImageView);
        //making a scene to hold the pane
        Scene scene3 = new Scene(Pane);
        //title for stage
        thirdStage.setTitle("image");
        //setting scene for stage
        thirdStage.setScene(scene3);
        //displaying stage
        thirdStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
