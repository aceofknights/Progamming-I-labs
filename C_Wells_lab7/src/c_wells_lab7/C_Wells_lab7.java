//Author: Chris wells
//Date: 4/13
//1311 P01
//Lab 7
//This program creates a calculator that takes 2 numbers and does math
package c_wells_lab7;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class C_Wells_lab7 extends Application {
    
    //making textfields for the inputs and output
    private TextField input1, input2, output;

    @Override
    public void start(Stage primaryStage) {
        //setting the text fields
        input1 = new TextField();
        input2 = new TextField();
        output = new TextField();
        output.setEditable(false);
        
        //making the buttons
        Button addButton = new Button("+");
        Button subtractButton = new Button("-");
        Button multiplyButton = new Button("*");
        Button divideButton = new Button("/");
        
        //add the event handlers to the buttons
        addButton.setOnAction(e -> calculate('+'));
        subtractButton.setOnAction(e -> calculate('-'));
        multiplyButton.setOnAction(e -> calculate('*'));
        divideButton.setOnAction(e -> calculate('/'));
        
        //create the layout with the text fields on top
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(new Label("Input 1:"), 0, 0);
        grid.add(input1, 1, 0);
        grid.add(new Label("Input 2:"), 0, 1);
        grid.add(input2, 1, 1);
        grid.add(new Label("Result:"), 0, 2);
        grid.add(output, 1, 2);
        
        //adding the buttons to the grid
        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(addButton, subtractButton, multiplyButton, divideButton);
        grid.add(buttonBox, 1, 3);
        
        //create the scene and show the stage
        Scene scene = new Scene(grid);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    private void calculate(char operator) {
        //getting the input values
        String input1Text = input1.getText().trim();
        String input2Text = input2.getText().trim();
        
        //checking for blank inputs
        if (input1Text.isEmpty() || input2Text.isEmpty()) {
            return;
        }
        
        //try catch block for non-numeric inputs
        try {
            double num1 = Double.parseDouble(input1Text);
            double num2 = Double.parseDouble(input2Text);
            
            //perform the appropriate operation
            switch (operator) {
                case '+':
                    output.setText(String.valueOf(num1 + num2));
                    break;
                case '-':
                    output.setText(String.valueOf(num1 - num2));
                    break;
                case '*':
                    output.setText(String.valueOf(num1 * num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        output.setText("Error: Division by zero");
                    } else {
                        output.setText(String.valueOf(num1 / num2));
                    }   break;
                default:
                    break;
            }
        } catch (NumberFormatException ex) {
            output.setText("");
            output.setText("Numeric input is expected");
        }
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}