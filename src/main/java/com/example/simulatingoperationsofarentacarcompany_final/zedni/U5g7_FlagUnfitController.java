package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class U5g7_FlagUnfitController {
    @FXML private ComboBox<String> reasonCB;
    @FXML private TextArea descriptionTA;

    @FXML
    public void initialize() {
        reasonCB.getItems().addAll("Engine Failure", "Brake Failure", "Body Damage", "Electrical Fault", "Other");
    }

    @FXML
    public void flagVehicleButtonOnAction(ActionEvent actionEvent) {
        if (reasonCB.getValue() == null || descriptionTA.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a reason and describe the fault.");
            alert.show();
            return;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Vehicle flagged as unfit. Reason: " + reasonCB.getValue());
        alert.show();
        reasonCB.setValue(null);
        descriptionTA.clear();
    }
}
