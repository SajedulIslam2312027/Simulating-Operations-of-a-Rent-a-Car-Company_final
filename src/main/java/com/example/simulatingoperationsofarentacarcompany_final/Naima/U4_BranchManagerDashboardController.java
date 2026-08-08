package com.example.simulatingoperationsofarentacarcompany_final.Naima;


import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class U4_BranchManagerDashboardController {

    @javafx.fxml.FXML
    public BorderPane dashboardBorderPane;

    @javafx.fxml.FXML
    public void performanceReportButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g1_performanceReport.fxml")
        );
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void shiftScheduleButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g2_shiftSchedule.fxml")
        );
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }


    @javafx.fxml.FXML
    public void discountApprovalButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g3_discountApproval.fxml")
        );
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }


    @javafx.fxml.FXML
    public void customerFeedbackButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g1_customerFeedback.fxml")
        );
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }


    @javafx.fxml.FXML
    public void (ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g1_PerfornanceReport.fxml")
        );
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }


    @javafx.fxml.FXML
    public void PerformanceReportButtonOnAction(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g1_PerfornanceReport.fxml")
        );
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }


    @javafx.fxml.FXML
    public void PerformanceReportButtonOnAction(ActionEvent event) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g1_PerfornanceReport.fxml")
        );
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }







    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("login.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();


        stage.setTitle("Rent A Car");
        stage.setScene(scene);
        stage.show();

    }

    @javafx.fxml.FXML
    public void revenueReportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void discountApprovalButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void PerformanceReportButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void customerFeedbackButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void leaveApprovalButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void announcementButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void shiftScheduleButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void insuranceClaimButtonOnAction(ActionEvent actionEvent) {
    }
}
