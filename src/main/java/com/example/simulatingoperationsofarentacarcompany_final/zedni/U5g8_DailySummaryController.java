package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class U5g8_DailySummaryController {
    @FXML private TextField hoursTF;
    @FXML private TextArea notesTA;

    @FXML
    public void submitSummaryButtonOnAction(ActionEvent actionEvent) {
        if (hoursTF.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter total hours worked.");
            alert.show();
            return;
        }
        double hours;
        try {
            hours = Double.parseDouble(hoursTF.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Total Hours Worked must be a number.");
            alert.show();
            return;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Daily summary submitted. Hours worked: " + hours);
        alert.show();
        hoursTF.clear();
        notesTA.clear();
    }
}
