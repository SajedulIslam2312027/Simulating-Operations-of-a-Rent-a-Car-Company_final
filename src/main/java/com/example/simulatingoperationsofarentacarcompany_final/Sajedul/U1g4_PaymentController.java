package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class U1g4_PaymentController {

    @javafx.fxml.FXML
    private ComboBox methodCB;

    @javafx.fxml.FXML
    private TextField cardNumberTF;

    @javafx.fxml.FXML
    private TextField expiryTF;

    @javafx.fxml.FXML
    private TextField cvvTF;

    @javafx.fxml.FXML
    public void initialize() {
        methodCB.getItems().addAll(
                "Cash",
                "Credit Card",
                "Debit Card",
                "Online Payment"
        );
    }

    @javafx.fxml.FXML
    public void payButtonOnAction(ActionEvent actionEvent) {

        if (methodCB.getValue() == null
                || cardNumberTF.getText().isEmpty()
                || expiryTF.getText().isEmpty()
                || cvvTF.getText().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(
                    "Please fill in the payment method and card details."
            );
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(
                "Payment successful via " + methodCB.getValue() + "."
        );
        alert.show();

        cardNumberTF.clear();
        expiryTF.clear();
        cvvTF.clear();
    }
}