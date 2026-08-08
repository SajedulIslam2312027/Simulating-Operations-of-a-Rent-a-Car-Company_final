package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ArrayList;

public class U5g3_CleaningReportController {
    @FXML private TextField vehicleIdTF;
    @FXML private TextArea cleaningNotesTA;

    private ArrayList<String> cleaningLog;

    @FXML
    public void initialize() {
        cleaningLog = new ArrayList<>();
    }

    @FXML
    public void saveCleaningButtonOnAction(ActionEvent actionEvent) {
        if (vehicleIdTF.getText().isEmpty() || cleaningNotesTA.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill in Vehicle ID and Cleaning Notes.");
            alert.show();
            return;
        }
        cleaningLog.add(vehicleIdTF.getText() + " - " + cleaningNotesTA.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Cleaning record saved for vehicle " + vehicleIdTF.getText() + ".");
        alert.show();
        vehicleIdTF.clear();
        cleaningNotesTA.clear();
    }
}