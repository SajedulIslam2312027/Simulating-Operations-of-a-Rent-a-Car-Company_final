package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class U2g6_FuelLogController {

    @javafx.fxml.FXML
    private TextField vehicleIdTF;
    @javafx.fxml.FXML
    private TextField stationTF;
    @javafx.fxml.FXML
    private TextField litresTF;
    @javafx.fxml.FXML
    private TextField costTF;

    @javafx.fxml.FXML
    public void logFuelButtonOnAction(ActionEvent actionEvent) {

        if (vehicleIdTF.getText().isEmpty() || stationTF.getText().isEmpty()
                || litresTF.getText().isEmpty() || costTF.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Fill up the form properly.");
            alert.show();
            return;
        }

        try {
            Double.parseDouble(litresTF.getText());
            Double.parseDouble(costTF.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Litres and Cost must be numbers.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Fuel log saved for vehicle " + vehicleIdTF.getText() + ".");
        alert.show();

        vehicleIdTF.clear();
        stationTF.clear();
        litresTF.clear();
        costTF.clear();
    }
}