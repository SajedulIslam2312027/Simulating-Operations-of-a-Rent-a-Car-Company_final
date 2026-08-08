package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class U3_RentalAgentDashboardController {
    @javafx.fxml.FXML
    private BorderPane dashboardBorderPane;
    @javafx.fxml.FXML
    private Label statusLable;
    @javafx.fxml.FXML
    private Label rentalAgentDashboardLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void processReturnButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g1_ProcessReturn.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void fileComplaintButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g2_FileComplaint.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void validatePromoButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g3_ValidatePromo.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void customerRecordsButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g4_CustomerRecords.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void vehicleConditionButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g5_InspectVehicleCondition.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void rentalAgreementButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g6_GenerateRentalAgreement.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void recordLateFeeButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g7_RecordLateFee.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void verifyLicenseButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g8_VerifyCustomerLicense.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("Login.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Rent A Car");
        stage.setScene(scene);
        stage.show();
    }
}

