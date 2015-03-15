package com.eduonix;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * Created by ubu on 13.03.15.
 */
public class EntryPoint extends Application {

    @Override
    public void start(Stage stage) {

        Rectangle2D bounds = Screen.getPrimary().getVisualBounds();

        String label_style = "-fx-border-color: red;-fx-padding:20;"
                + "-fx-border-width: 1;"
                + "-fx-border-style: dotted;"
                +"-fx-font: 44 sans-serif; -fx-stroke: blue; -fx-fill: blue; -fx-scale-y: 1.2;";

        Label showPrompt =  new Label("Hello From Eduonix\nJavaFX on Android\nVia Gradle");
        showPrompt.setStyle(label_style);




        Scene scene = new Scene(new StackPane(showPrompt),
                bounds.getWidth(), bounds.getHeight());

        stage.setScene(scene);

        stage.show();
    }
}


