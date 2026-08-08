package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

public class U1g8_ReviewSubmitController {

    @javafx.fxml.FXML
    private ComboBox ratingCB;
    @javafx.fxml.FXML
    private TextArea commentTA;

    @javafx.fxml.FXML
    public void initialize() {
        ratingCB.getItems().addAll(1, 2, 3, 4, 5);
    }

    @javafx.fxml.FXML
    public void submitReviewButtonOnAction(ActionEvent actionEvent) {

        if (ratingCB.getValue() == null || commentTA.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a rating and add a comment.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Thank you! Your review has been submitted.");
        alert.show();

        ratingCB.setValue(null);
        commentTA.clear();
    }
}