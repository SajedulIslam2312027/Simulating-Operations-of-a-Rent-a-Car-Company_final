package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class U2g1_VehicleAddController {

    @javafx.fxml.FXML
    private TextField makeTF;
    @javafx.fxml.FXML
    private TextField modelTF;
    @javafx.fxml.FXML
    private TextField yearTF;
    @javafx.fxml.FXML
    private TextField colourTF;
    @javafx.fxml.FXML
    private TextField plateTF;

    @javafx.fxml.FXML
    public void addVehicleButtonOnAction(ActionEvent actionEvent) {

        if (makeTF.getText().isEmpty() || modelTF.getText().isEmpty() || yearTF.getText().isEmpty()
                || colourTF.getText().isEmpty() || plateTF.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Fill up the form properly.");
            alert.show();
            return;
        }

        try {
            Integer.parseInt(yearTF.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Year must be a number.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Vehicle " + makeTF.getText() + " " + modelTF.getText() + " added to the fleet.");
        alert.show();

        makeTF.clear();
        modelTF.clear();
        yearTF.clear();
        colourTF.clear();
        plateTF.clear();
    }
}