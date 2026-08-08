package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class U5g5_InspectionController {
    @FXML private ComboBox<Integer> conditionCB;
    @FXML private TextArea issuesTA;

    @FXML
    public void initialize() {
        conditionCB.getItems().addAll(1, 2, 3, 4, 5);
    }

    @FXML
    public void submitInspectionButtonOnAction(ActionEvent actionEvent) {
        if (conditionCB.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select the overall condition (1-5).");
            alert.show();
            return;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Inspection submitted. Condition rating: " + conditionCB.getValue());
        alert.show();
        conditionCB.setValue(null);
        issuesTA.clear();
    }
}