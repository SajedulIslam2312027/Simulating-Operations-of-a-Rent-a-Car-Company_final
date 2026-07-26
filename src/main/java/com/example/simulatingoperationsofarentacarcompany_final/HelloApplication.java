package com.example.simulatingoperationsofarentacarcompany_final;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U1g1_CustomerRegister.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Rent A Car");
        stage.setScene(scene);
        stage.show();
    }
}