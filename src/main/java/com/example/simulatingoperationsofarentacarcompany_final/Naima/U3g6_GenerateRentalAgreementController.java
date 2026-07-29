package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class U3g6_GenerateRentalAgreementController {
    @javafx.fxml.FXML
    private TextField customerIdTF;
    @javafx.fxml.FXML
    private TextField vehicleRegNoTF;
    @javafx.fxml.FXML
    private DatePicker startDatePicker;
    @javafx.fxml.FXML
    private DatePicker EndDatePicker;
    @javafx.fxml.FXML
    public void generateOnAction(ActionEvent actionEvent) {
        System.out.println("Agreement generated, ");
    }
    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Naima/U3g5_InspectVehicleCondition.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
