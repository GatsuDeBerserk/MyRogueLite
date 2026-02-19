package org;

import javafx.scene.*;
import org.game.locations.Kingdom;import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.lang.System;

public class Controler {
    static void main() {
        Scene scene=new Scene(new Group());
        scene.getStylesheets().add("org/ui/style.css");


        Kingdom allo = new Kingdom();
        allo.getKingdom();
    }
}
