package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


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

        if (customerIdTF.getText().isEmpty()
              || vehicleRegNoTF.getText().isEmpty()
              || startDatePicker.getValue() == null
              || EndDatePicker.getValue() == null) {

            System.out.println("Fill up the form properly");
        }

        else {
        System.out.println("Agreement generated. ");

        customerIdTF.clear();
        vehicleRegNoTF.clear();
        startDatePicker.setValue(null);
        EndDatePicker.setValue(null);
        }
    }
        @javafx.fxml.FXML
        public void backButtonOnAction(ActionEvent event) throws IOException {

            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Naima/U3g5_InspectVehicleCondition.fxml")
            );
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
        }
    }