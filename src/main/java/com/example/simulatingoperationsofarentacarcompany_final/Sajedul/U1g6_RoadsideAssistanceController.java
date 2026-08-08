package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class U1g6_RoadsideAssistanceController {

    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private ComboBox issueTypeCB;
    @javafx.fxml.FXML
    private TextArea descriptionTA;

    @javafx.fxml.FXML
    public void initialize() {
        issueTypeCB.getItems().addAll("Flat Tyre", "Battery Dead", "Engine Trouble", "Accident", "Lockout", "Other");
    }

    @javafx.fxml.FXML
    public void requestAssistanceButtonOnAction(ActionEvent actionEvent) {

        if (locationTF.getText().isEmpty() || issueTypeCB.getValue() == null || descriptionTA.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill in your location, issue type, and description.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Roadside assistance requested for: " + issueTypeCB.getValue() + ". Help is on the way.");
        alert.show();

        locationTF.clear();
        issueTypeCB.setValue(null);
        descriptionTA.clear();
    }
}