package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;

public class U6g8_PhysicalAuditController {
    @FXML private TableView<?> auditTableView;

    @FXML
    public void submitAuditButtonOnAction(ActionEvent actionEvent) {
        if (auditTableView.getSelectionModel().getSelectedItem() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a part to confirm.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Audit confirmed.");
        alert.show();
    }
}