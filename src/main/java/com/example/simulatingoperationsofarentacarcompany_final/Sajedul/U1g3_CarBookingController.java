package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class U1g3_CarBookingController {

    @FXML
    private ComboBox<String> pickupBranchCB;

    @FXML
    private ComboBox<String> dropBranchCB;

    @FXML
    private CheckBox gpsCB;

    @FXML
    private CheckBox insuranceCB;

    @FXML
    private CheckBox childSeatCB;

    @FXML
    private TextArea totalCostTA;

    @FXML
    public void initialize() {

        pickupBranchCB.getItems().addAll(
                "Dhaka",
                "Chittagong",
                "Sylhet",
                "Rajshahi"
        );

        dropBranchCB.getItems().addAll(
                "Dhaka",
                "Chittagong",
                "Sylhet",
                "Rajshahi"
        );
    }

    @FXML
    public void confirmBookingButtonOnAction(ActionEvent actionEvent) {

        if (pickupBranchCB.getValue() == null
                || dropBranchCB.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(
                    "Please select pickup and drop branches."
            );
            alert.show();
            return;
        }

        double total = 0;

        if (gpsCB.isSelected()) {
            total += 10;
        }

        if (insuranceCB.isSelected()) {
            total += 15;
        }

        if (childSeatCB.isSelected()) {
            total += 5;
        }

        totalCostTA.setText(String.valueOf(total));

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(
                "Booking confirmed successfully."
        );
        alert.show();
    }
}