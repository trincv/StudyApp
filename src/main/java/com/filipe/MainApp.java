package com.filipe;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        Color c = Color.BLUEVIOLET;
        Group g = new Group();
        Scene scene = new Scene(g, c);

        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.setTitle("Primeiro teste de meu APP");
        stage.show();
    }
    public static void main( String[] args ) {
        launch(args);
    }
}
