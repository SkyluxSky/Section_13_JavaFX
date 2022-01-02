package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    //Stage is a top level window
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        //Window Title
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));//New Scene and Stage
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
