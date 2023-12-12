package linedraw;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineDraw extends Application {

    //setting the movement of the line
    private static final int Line_Movement_Amount = 10;

    private double lineStartX;
    private double lineStartY;
    private double lineEndX;
    private double lineEndY;

    //creating pane to hold line
    private Pane pane = new Pane();

    @Override
    public void start(Stage primaryStage) {

        //setting line to the center
        pane.setPrefSize(400, 400);
        lineStartX = lineEndX = pane.getPrefWidth() / 2;
        lineStartY = lineEndY = pane.getPrefHeight() / 2;

        Scene scene = new Scene(pane);

        scene.setOnKeyPressed(e -> {
            Line line = new Line(lineStartX, lineStartY, lineEndX, lineEndY);
            line.setStroke(Color.RED);
            pane.getChildren().add(line);
            
            switch(e.getCode()){
                case LEFT:
                    lineEndX -= Line_Movement_Amount;
                    break;
                case RIGHT:
                    lineEndX += Line_Movement_Amount;
                    break;
                case UP:
                    lineEndY -= Line_Movement_Amount;
                    break;
                case DOWN:
                    lineEndY += Line_Movement_Amount;
                    break;
                default:
                    return;
                       
            }
            
            line.setEndX(lineEndX);
            line.setEndY(lineEndY);
            
            lineStartX = lineEndX;
            lineStartY = lineEndY;
            
        });

        primaryStage.setScene(scene);
        primaryStage.show();
        pane.requestFocus();
    }

    /*    public void drawLine(int direction){
    Line line = new Line(lineStartX, lineStartY, lineEndX, lineEndY);
    line.setStroke(Color.RED);
    pane.getChildren().add(line);
    
    switch(direction){
    case LEFT:
    }
    
    
    }*/
    public static void main(String[] args) {
        launch(args);
    }

}
