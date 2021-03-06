/*********************************************************************************************************************
 *********************************************************************************************************************
 *****                                          Chapter 14: Problem 1                                            *****
 *****___________________________________________________________________________________________________________*****
 *****                                        1. Create a program that                                           *****
 *****-----------------------------------------------------------------------------------------------------------*****
 *****         a. draws 5 different colored circles. Specify their color, location and size in the code.         *****
 *********************************************************************************************************************
 *********************************************************************************************************************/

// IMPORTS of needed tools and plug-ins.
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.layout.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class Chapter14_1_A extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();

        Color myColor1 = Color.rgb(200, 120, 255, 1.0);
        Color myColor2 = Color.rgb(75, 230, 175, 1.0);
        Color myColor3 = Color.rgb(255, 0, 255, 1.0);
        Color myColor4 = Color.rgb(255, 255, 75, 1.0);
        Color myColor5 = Color.rgb(100, 255, 100, 1.0);
        Color myColor6 = Color.rgb(255, 180, 0, 1.0);

        Circle c1 = new Circle(50, 50, 30);
        Circle c2 = new Circle(150, 150, 80);
        Circle c3 = new Circle(300, 200, 150);
        Circle c4 = new Circle(400, 350, 60);
        Circle c5 = new Circle(250, 400, 50);

        c1.setStroke(Color.GREEN);
        c1.setFill(Color.CYAN);

        c2.setStroke(Color.ORANGE);
        c2.setFill(Color.HOTPINK);

        c3.setStroke(myColor1);
        c3.setFill(myColor2);

        c4.setStroke(myColor3);
        c4.setFill(myColor4);

        c5.setStroke(myColor5);
        c5.setFill(myColor6);


        pane.getChildren().addAll(c1, c2, c3, c4, c5);
        Scene scene = new Scene(pane, 500, 500);
        primaryStage.setTitle("Chapter 14, Problem 1, Part A");

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
