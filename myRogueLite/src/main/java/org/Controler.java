package org;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.*;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;
import org.game.DelegateReadLine;
import org.game.caracters.Fighter;
import org.game.caracters.GameCharacter;
import org.game.caracters.fighters.Other.Charles;
import org.game.items.weapon.mele.Axe;
import org.game.locations.Kingdom;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import org.ui.ControllerTerminal;

import java.lang.System;

public class Controler extends Application {
    public static void main(String[] args) {
//        launch(args);
        System.out.println("allo");

        Fighter charles = new Charles();
        System.out.println("Bang ! "+charles.attaque()+" Dégats dans ta face !");

        ControllerTerminal.start();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("titre");

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("org/ui/jeux.fxml"));

        TabPane pane = new TabPane();
//        TitledPane tab =new TitledPane();
        Tab tab = new Tab();
        tab.setText("allo");
        fxmlLoader.setController(this);
        tab.setContent(fxmlLoader.load());
        pane.getTabs().add(tab);

        Scene scene = new Scene(pane);
        scene.getStylesheets().add("org/ui/style.css");


        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
