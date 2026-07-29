package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class U3_RentalAgentDashboardController {
    @javafx.fxml.FXML
    public BorderPane dashboardBorderPane;
    @FXML
    private Label statusLable;

    @javafx.fxml.FXML
    public void processReturnOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g1_ProcessReturn.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }
    @javafx.fxml.FXML
    public void fileComplaintOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g2_FileComplaint.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }
    @javafx.fxml.FXML
    public void validatePromoOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g3_ValidatePromo.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }
    @javafx.fxml.FXML
    public void shiftScheduleOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g4_ShiftSchedule.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }
    @javafx.fxml.FXML
    public void inspectVehicleOnAction(ActionEvent actionEvent) throws IOException{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g5_InspectVehicleCondition.fxml"));
            dashboardBorderPane.setCenter(fxmlLoader.load());
    }
    @javafx.fxml.FXML
    public void rentalAgreementOnAction(ActionEvent actionEvent) throws IOException{
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g6_GenerateRentalAgreement.fxml"));
                dashboardBorderPane.setCenter(fxmlLoader.load());
    }
    @javafx.fxml.FXML
    public void recordLateFeeOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g7_RecordLateFee.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }
    @javafx.fxml.FXML
    public void verifyLicenseOnAction(ActionEvent actionEvent) throws IOException{
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g8_VerifyCustomerLicense.fxml"));
                        dashboardBorderPane.setCenter(fxmlLoader.load());
    }
    @javafx.fxml.FXML
    public  void logoutButtonOnAction(ActionEvent actionEvent) throws IOException{
                            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U3g9_LogoutButton.fxml"));
                            dashboardBorderPane.setCenter(fxmlLoader.load());
    }

    public Label getStatusLable() {
        return statusLable;
    }

    public Label setStatusLable() {
        return statusLable;
    }
}
