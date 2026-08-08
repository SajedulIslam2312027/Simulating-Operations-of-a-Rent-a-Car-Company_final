package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class U5g2_JobStatusUpdateController {
    @FXML private ComboBox<String> statusCB;
    @FXML private TextArea notesTA;

    @FXML
    public void initialize() {
        statusCB.getItems().addAll("Not Started", "In Progress", "Completed", "On Hold");
    }

    @FXML
    public void updateJobStatusButtonOnAction(ActionEvent actionEvent) {
        if (statusCB.getValue() == null || notesTA.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a status and add progress notes.");
            alert.show();
            return;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Job status updated to: " + statusCB.getValue());
        alert.show();
        statusCB.setValue(null);
        notesTA.clear();
    }
}
