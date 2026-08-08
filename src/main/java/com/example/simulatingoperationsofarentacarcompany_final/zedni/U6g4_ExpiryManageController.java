package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class U6g4_ExpiryManageController {
    @FXML private TableView<?> expiryTableView;
    @FXML private TextField disposalQtyTF;

    @FXML
    public void confirmDisposalButtonOnAction(ActionEvent actionEvent) {
        if (expiryTableView.getSelectionModel().getSelectedItem() == null || disposalQtyTF.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a part and enter a disposal quantity.");
            alert.show();
            return;
        }

        int qty;
        try {
            qty = Integer.parseInt(disposalQtyTF.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Disposal Quantity must be a number.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Disposed " + qty + " unit(s).");
        alert.show();

        disposalQtyTF.clear();
    }
}
