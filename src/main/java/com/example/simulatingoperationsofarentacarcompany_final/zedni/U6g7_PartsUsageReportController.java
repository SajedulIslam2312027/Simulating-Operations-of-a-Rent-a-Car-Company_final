package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class U6g7_PartsUsageReportController {
    @FXML private ComboBox<String> rangeCB;
    @FXML private TextArea reportResultTA;

    @FXML
    public void initialize() {
        rangeCB.getItems().addAll("This Week", "This Month", "This Quarter", "This Year");
    }

    @FXML
    public void generateReportButtonOnAction(ActionEvent actionEvent) {
        if (rangeCB.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a time range.");
            alert.show();
            return;
        }

        reportResultTA.setText(
                "Parts Usage Report (" + rangeCB.getValue() + ")\n\n"
                        + "Total Parts Used: 128\n"
                        + "Top Category: Brake\n"
                        + "Total Cost: 45320.50"
        );
    }
}