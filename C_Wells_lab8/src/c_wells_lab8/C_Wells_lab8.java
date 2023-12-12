//Author: Chris wells
//Date: 4/18
//1311 P01
//Lab 8
//This program creates a cubic curve and has a circle follow the curve
//the user will need to click on the circle to start and follow the circle
//buttons to make the circle faster/slower and bigger/smaller are available
package c_wells_lab8;

import java.util.Random;
import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;

public class C_Wells_lab8 extends Application {

    private Circle circle;
    private long startTime;
    private long elapsedTime;
    GridPane grid = new GridPane();
    private TextField score;
    private PathTransition pathTransition;
    private int duration = 10;

    @Override
    public void start(Stage primaryStage) {

        //making a root pane to hold more then one pane
        StackPane rootPane = new StackPane();

        //create a cubic curve
        CubicCurve curve = createRandomCubicCurve();
        curve.setFill(null);
        curve.setStroke(Color.TRANSPARENT);

        //Create a circle at the beginning of the curve
        circle = new Circle(curve.getStartX(), curve.getStartY(), 40, Color.RED);
        circle.setStroke(Color.BLACK);

        //add the curve and circle to the pane
        Pane pane = new Pane();
        pane.getChildren().addAll(curve, circle);

        //create a path transition for the circle to follow the curve
        pathTransition = new PathTransition(Duration.seconds(10), curve, circle);
        pathTransition.setCycleCount(1);

        //set event handlers for the circle
        circle.setOnMousePressed(e -> {
            //start the path transition when the circle is clicked
            startTime = System.currentTimeMillis();
            pathTransition.play();

        });
        circle.setOnMouseExited(e -> {
            //stop the path transition and show the elapsed time when the mouse leaves the circle
            pathTransition.stop();
            elapsedTime = (System.currentTimeMillis() - startTime) / 1000;
            score.setText(String.valueOf("Score: " + elapsedTime + " seconds"));
        });

        //adding ui buttons
        Button timeAdd = new Button("Ball slower");
        Button timeSub = new Button("Ball faster");
        Button circleSmall = new Button("Ball smaller");
        Button circleLarge = new Button("Ball larger");
        Button pathToggle = new Button("Toggle path");
        
        //making a hbox to hold the buttons
        HBox buttonBox = new HBox(10);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.getChildren().addAll(timeAdd, timeSub, circleSmall, circleLarge, pathToggle);
        grid.add(buttonBox, 1, 1);
        score = new TextField();
        score.setEditable(false);
        grid.add(score, 2, 1);
        //stacking the ui and the game in a vbox so they are not stacked on top of each other
        VBox vb = new VBox(grid, pane);

        //makes the circle slower
        timeAdd.setOnAction(e -> {
            duration = duration + 2;
            pathTransition.setDuration(pathTransition.getDuration().add(Duration.seconds(2)));
        });

        //makes the circle faster
        timeSub.setOnAction(e -> {
            //if statement checks so seconds can not be under 2 seconds
            if (duration <= 2) {
            } else {
                pathTransition.setDuration(pathTransition.getDuration().add(Duration.seconds(-2)));
                duration = duration - 2;
            }
        });

        //makes the circle smaller
        circleSmall.setOnAction(e -> {
            if (circle.getRadius() <= 2) {

            } else {
                circle.setRadius(circle.getRadius() - 2);
            }
        });

        //makes the circle bigger
        circleLarge.setOnAction(e -> {
            circle.setRadius(circle.getRadius() + 2);
        });

        //toggle to show the path
        pathToggle.setOnAction(e -> {
            if (curve.getStroke() != Color.TRANSPARENT) {
                curve.setStroke(Color.TRANSPARENT);
            } else {
                curve.setStroke(Color.BLACK);
            }
        });

        // Create the scene and show the stage
        rootPane.getChildren().addAll(vb);
        Scene scene = new Scene(rootPane, 600, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //making the curve and generating random points for the curve
    private CubicCurve createRandomCubicCurve() {
        Random random = new Random();
        double startX = 50;
        double startY = 50;
        double endX = 550;
        double endY = 550;
        double controlX1 = random.nextDouble() * 600;
        double controlY1 = random.nextDouble() * 600;
        double controlX2 = random.nextDouble() * 600;
        double controlY2 = random.nextDouble() * 600;
        return new CubicCurve(startX, startY, controlX1, controlY1, controlX2, controlY2, endX, endY);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
