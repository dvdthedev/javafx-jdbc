package com.example.javafxjdbc;

import com.example.javafxjdbc.gui.util.Alerts;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    private static Scene mainScene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("MainView.fxml"));

        //setando uma instância de scrollpane para ser a tela principal da app
        ScrollPane scrollPane = fxmlLoader.load();

        //definições para preenchimento da barra utilizando scrollpane
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToWidth(true);

        mainScene = new Scene(scrollPane);
        stage.setTitle("Sample JAVAFX App");
        stage.setScene(mainScene);
        stage.show();
    }

    public static Scene getMainScene(){
        return mainScene;
    };


}
