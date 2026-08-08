package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class U5g4_PartsRequestController {
    @FXML private TextField partNameTF;
    @FXML private TextField quantityTF;
    @FXML private TextField workOrderTF;

    @FXML
    public void submitRequestButtonOnAction(ActionEvent actionEvent) {
        if (partNameTF.getText().isEmpty() || quantityTF.getText().isEmpty() || workOrderTF.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Fill up the form properly.");
            alert.show();
            return;
        }
        int quantity;
        try {
            quantity = Integer.parseInt(quantityTF.getText());
            if (quantity <= 0) throw new NumberFormatException();
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Quantity must be a positive number.");
            alert.show();
            return;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Parts request submitted for " + partNameTF.getText() + " (Qty: " + quantity + ").");
        alert.show();
        partNameTF.clear();
        quantityTF.clear();
        workOrderTF.clear();
    }
}