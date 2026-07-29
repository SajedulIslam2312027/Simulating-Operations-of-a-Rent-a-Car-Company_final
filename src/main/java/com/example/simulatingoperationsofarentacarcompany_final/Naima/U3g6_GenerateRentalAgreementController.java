package com.example.simulatingoperationsofarentacarcompany_final.Naima;

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
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        Parent dashboardRoot = FXMLLoader.load(getClass().getResource("U3_RentalAgentDashboard.fxml"));
        Scene scene = new Scene(dashboardRoot);
        EventObject event = null;
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
