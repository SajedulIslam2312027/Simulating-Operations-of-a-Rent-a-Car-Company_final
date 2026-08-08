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

public class U4_BranchManagerDashboardController {

    @javafx.fxml.FXML
    private BorderPane dashboardBorderPane;
    @javafx.fxml.FXML
    private Label branchManagerLabel;

    @javafx.fxml.FXML
    public void initialize(){
    }

    @javafx.fxml.FXML
    public void performanceReportButtonOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g1_PerformanceReport.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void shiftScheduleButtonOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g2_ShiftSchedule.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void discountApprovalButtonOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g3_DiscountApproval.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }


    @javafx.fxml.FXML
    public void customerFeedbackButtonOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g4_CustomerFeedback.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void leaveApprovalButtonOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g5_LeaveApproval.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }


    @javafx.fxml.FXML
    public void insuranceClaimButtonOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g6_InsuranceClaim.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }


    @javafx.fxml.FXML
    public void revenueReportButtonOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g7_RevenueReport.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }


    @javafx.fxml.FXML
    public void announcementButtonOnAction(ActionEvent actionEvent) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("U4g8_Announcement.fxml"));
        dashboardBorderPane.setCenter(fxmlLoader.load());
    }



    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource("login.fxml")
        );

        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Rent A Car");
        stage.setScene(scene);
        stage.show();

    }

}
