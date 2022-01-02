package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Main extends Application {

    //Stage is a top level window
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

        //Creates fxml configurations in code variation
//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//
//        Label greeting = new Label("Welcome to JavaFX!");
//        greeting.setTextFill(Color.GREEN);// sets labels color as green
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70)); //Sets font and font weight
//        root.getChildren().add(greeting);//Adds label to root grid pane
        //Window Title
        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(new Scene(root, 700, 275));//New Scene and Stage(sets width and height od window)
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
