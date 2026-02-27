package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        // ТУТ ТИ ПИШЕШ КОД
         Pane pane = new Pane();
         Scene scene = new Scene(pane,500, 200);
        stage.setScene(scene);
        stage.setTitle("ddifjdji");
        stage.show();
    }
}