package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class U1g3_CarBookingController {

    @javafx.fxml.FXML
    private ComboBox pickupBranchCB;
    @javafx.fxml.FXML
    private ComboBox dropBranchCB;
    @javafx.fxml.FXML
    private CheckBox insuranceCB;
    @javafx.fxml.FXML
    private CheckBox childSeatCB;
    @javafx.fxml.FXML
    private CheckBox gpsCB;
    @javafx.fxml.FXML
    private TextArea totalCostTA;

    @javafx.fxml.FXML
    public void confirmBookingButtonOnAction(ActionEvent actionEvent) {

        if (pickupBranchCB.getValue() == null || dropBranchCB.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select both a pickup branch and a drop-off branch.");
            alert.show();
            return;
        }

        double totalCost = 3000.0;
        if (insuranceCB.isSelected()) {
            totalCost += 500.0;
        }
        if (childSeatCB.isSelected()) {
            totalCost += 300.0;
        }
        if (gpsCB.isSelected()) {
            totalCost += 200.0;
        }

        totalCostTA.setText("Estimated Total Cost: " + totalCost);

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Booking confirmed. Continue to Payment from the sidebar.");
        alert.show();
    }
}