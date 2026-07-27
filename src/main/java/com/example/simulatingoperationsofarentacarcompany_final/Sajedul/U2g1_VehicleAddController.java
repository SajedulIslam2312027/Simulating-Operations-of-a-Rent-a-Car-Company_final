package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class U2g1_VehicleAddController {

    @javafx.fxml.FXML
    private TextField yearTF;
    @javafx.fxml.FXML
    private TextField colourTF;
    @javafx.fxml.FXML
    private TextField makeTF;
    @javafx.fxml.FXML
    private TextField modelTF;
    @javafx.fxml.FXML
    private TextField plateTF;

    @javafx.fxml.FXML
    public void addVehicleButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U2g2_MaintenanceScheduler.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Rent A Car");
        nextStage.setScene(scene);
        nextStage.show();
    }
}