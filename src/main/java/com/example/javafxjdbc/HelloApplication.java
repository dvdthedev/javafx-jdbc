package com.example.javafxjdbc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MainView.fxml"));

        //setando uma instância de scrollpane para ser a tela principal da app
        ScrollPane scrollPane = fxmlLoader.load();

        //definições para preenchimento da barra utilizando scrollpane
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);

        Scene scene = new Scene(scrollPane);
        stage.setTitle("Sample JAVAFX App");
        stage.setScene(scene);
        stage.show();
    }
}
