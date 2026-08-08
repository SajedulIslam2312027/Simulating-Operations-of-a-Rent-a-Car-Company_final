package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class U2g3_VehicleStatusUpdateController {

    @javafx.fxml.FXML
    private TextField vehicleIdTF;
    @javafx.fxml.FXML
    private ComboBox statusCB;
    @javafx.fxml.FXML
    private TextArea reasonTA;

    @javafx.fxml.FXML
    public void initialize() {
        statusCB.getItems().addAll("Available", "Rented", "Under Maintenance", "Retired");
    }

    @javafx.fxml.FXML
    public void updateStatusButtonOnAction(ActionEvent actionEvent) {

        if (vehicleIdTF.getText().isEmpty() || statusCB.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter the Vehicle ID and select a status.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Vehicle " + vehicleIdTF.getText() + " status updated to " + statusCB.getValue() + ".");
        alert.show();

        vehicleIdTF.clear();
        statusCB.setValue(null);
        reasonTA.clear();
    }
}