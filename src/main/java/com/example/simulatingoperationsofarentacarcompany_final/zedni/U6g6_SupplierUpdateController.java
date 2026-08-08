package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class U6g6_SupplierUpdateController {
    @FXML private TextField contactPersonTF;
    @FXML private TextField phoneTF;
    @FXML private TextField leadTimeTF;

    @FXML
    public void saveSupplierButtonOnAction(ActionEvent actionEvent) {
        if (contactPersonTF.getText().isEmpty() || phoneTF.getText().isEmpty() || leadTimeTF.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Fill up the form properly.");
            alert.show();
            return;
        }

        int leadTime;
        try {
            leadTime = Integer.parseInt(leadTimeTF.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Lead Time must be a number.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Supplier info saved. Contact: " + contactPersonTF.getText() + " (Lead time: " + leadTime + " days).");
        alert.show();

        contactPersonTF.clear();
        phoneTF.clear();
        leadTimeTF.clear();
    }
}