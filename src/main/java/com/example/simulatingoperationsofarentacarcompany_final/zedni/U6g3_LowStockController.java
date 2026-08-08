package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;

public class U6g3_LowStockController {
    @FXML private TableView<?> lowStockTableView;

    @FXML
    public void raiseOrderButtonOnAction(ActionEvent actionEvent) {
        if (lowStockTableView.getSelectionModel().getSelectedItem() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a part to reorder.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Reorder raised successfully.");
        alert.show();
    }
}