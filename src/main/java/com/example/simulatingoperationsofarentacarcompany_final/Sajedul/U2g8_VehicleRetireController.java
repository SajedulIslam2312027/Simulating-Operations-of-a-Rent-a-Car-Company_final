package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class U2g8_VehicleRetireController {

    @javafx.fxml.FXML
    private TextField vehicleIdTF;
    @javafx.fxml.FXML
    private TextField odometerTF;
    @javafx.fxml.FXML
    private TextArea reasonTA;

    @javafx.fxml.FXML
    public void retireVehicleButtonOnAction(ActionEvent actionEvent) {

        if (vehicleIdTF.getText().isEmpty() || odometerTF.getText().isEmpty() || reasonTA.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Fill up the form properly.");
            alert.show();
            return;
        }

        try {
            Integer.parseInt(odometerTF.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Odometer Reading must be a number.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Vehicle " + vehicleIdTF.getText() + " retired from the fleet.");
        alert.show();

        vehicleIdTF.clear();
        odometerTF.clear();
        reasonTA.clear();
    }
}