package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class U3g8_VerifyCustomerLicenseController {
    @javafx.fxml.FXML
    private TextField customerIdTF;
    @javafx.fxml.FXML
    private TextField licenseNumberTF;
    @javafx.fxml.FXML
    private DatePicker expiryDatePicker;
    @javafx.fxml.FXML
    public void verifyLicenseOnAction(ActionEvent actionEvent) {
        System.out.println(" License Verified.");
    }
    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Naima/U3g7_RecordLateFee.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
