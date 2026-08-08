package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class U3g7_RecordLateFeeController {
    @javafx.fxml.FXML
    private TextField agreementIdTF;
    @javafx.fxml.FXML
    private TextField delayHoursTF;
    @javafx.fxml.FXML
    private TextField feeAmountTF;
    @javafx.fxml.FXML
    public void recordFeeOnAction(ActionEvent actionEvent) {

        System.out.println("Late fee recorded.");
    }
    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Naima/U3g6_GenerateRentalAgreement.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
