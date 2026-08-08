package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class U2g5_FleetUtilisationReportController {

    @javafx.fxml.FXML
    private ComboBox periodCB;
    @javafx.fxml.FXML
    private TextArea reportResultTA;

    @javafx.fxml.FXML
    public void initialize() {
        periodCB.getItems().addAll("This Week", "This Month", "This Quarter", "This Year");
    }

    @javafx.fxml.FXML
    public void generateReportButtonOnAction(ActionEvent actionEvent) {

        if (periodCB.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a reporting period.");
            alert.show();
            return;
        }

        reportResultTA.setText(
                "Fleet Utilisation Report (" + periodCB.getValue() + ")\n\n"
                        + "Total Vehicles: 42\n"
                        + "Active Rentals: 27\n"
                        + "Utilisation Rate: 64%"
        );
    }
}