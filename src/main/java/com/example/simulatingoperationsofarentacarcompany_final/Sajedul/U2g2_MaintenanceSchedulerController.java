package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class U2g2_MaintenanceSchedulerController {

    @javafx.fxml.FXML
    private TextField vehicleIdTF;
    @javafx.fxml.FXML
    private ComboBox typeCB;
    @javafx.fxml.FXML
    private DatePicker serviceDateDP;

    @javafx.fxml.FXML
    public void initialize() {
        typeCB.getItems().addAll("Oil Change", "Brake Service", "Tyre Replacement", "General Inspection", "Engine Repair");
    }

    @javafx.fxml.FXML
    public void scheduleButtonOnAction(ActionEvent actionEvent) {

        if (vehicleIdTF.getText().isEmpty() || typeCB.getValue() == null || serviceDateDP.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill in the Vehicle ID, Maintenance Type, and Service Date.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Maintenance scheduled for vehicle " + vehicleIdTF.getText() + " on " + serviceDateDP.getValue() + ".");
        alert.show();

        vehicleIdTF.clear();
        typeCB.setValue(null);
        serviceDateDP.setValue(null);
    }
}