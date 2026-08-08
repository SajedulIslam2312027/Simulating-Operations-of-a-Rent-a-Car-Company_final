package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class U2g4_FleetTrackingController {

    @javafx.fxml.FXML
    private ComboBox vehicleCB;
    @javafx.fxml.FXML
    private TableView locationTableView;
    @javafx.fxml.FXML
    private TableColumn vehicleIdTC;
    @javafx.fxml.FXML
    private TableColumn latitudeTC;
    @javafx.fxml.FXML
    private TableColumn longitudeTC;

    @javafx.fxml.FXML
    public void trackButtonOnAction(ActionEvent actionEvent) {

        if (vehicleCB.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a vehicle to track.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Showing live location for vehicle " + vehicleCB.getValue() + ".");
        alert.show();
    }
}