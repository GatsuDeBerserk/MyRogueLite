package org;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.layout.Pane;
import org.game.locations.Kingdom;import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.lang.System;

public class Controler extends Application {
    public static void main(String[] args) {
        launch(args);



        Kingdom allo = new Kingdom();
        allo.getKingdom();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("titre");

//        Scene scene=new Scene(new Group());
//        scene.getStylesheets().add("org/ui/style.css");
//        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ui/jeux.fxml"));
        Pane pane =new Pane();
        primaryStage.show();

    }
}
