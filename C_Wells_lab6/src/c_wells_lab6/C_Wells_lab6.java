//Author: Chris wells
//Date: 4/1
//1311 P01
//Lab 6
//this program opens a window that left clicking in the window creates a circle and right clicking the circle removes it
package c_wells_lab6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class C_Wells_lab6 extends Application {

    private Pane pane;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a pane to hold the circles
        pane = new Pane();
        pane.setOnMouseClicked(e -> {
            if (e.getButton() == MouseButton.PRIMARY) {
                addCircle(e.getX(), e.getY());
            } else if (e.getButton() == MouseButton.SECONDARY) {
                removeCircle(e.getX(), e.getY());
            }
        });

        // Create a scene and add the pane to it
        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void addCircle(double x, double y) {
        // Create a new circle at the specified coordinates
        Circle circle = new Circle(x, y, 5);
        circle.setFill(Color.RED);

        // Add the circle to the pane
        pane.getChildren().add(circle);
    }

    private void removeCircle(double x, double y) {
        // Check if any of the circles contain the specified coordinates
        for (int i = 0; i < pane.getChildren().size(); i++) {
            Circle circle = (Circle) pane.getChildren().get(i);
            if (circle.contains(x, y)) {
                // Remove the circle from the pane
                pane.getChildren().remove(i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
