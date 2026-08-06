package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class MaintenanceTechnicianDashboardController {

    @FXML
    private BorderPane dashboardBorderPane;

    @FXML
    public void assignedTasksOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U5g1_AssignedTasks.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void jobStatusUpdateOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U5g2_JobStatusUpdate.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void cleaningReportOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U5g3_CleaningReport.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void partsRequestOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U5g4_PartsRequest.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void inspectionOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U5g5_Inspection.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void maintenanceHistoryOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U5g6_MaintenanceHistory.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void flagUnfitOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U5g7_FlagUnfit.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void dailySummaryOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U5g8_DailySummary.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));

        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Rent A Car");

        stage.setScene(scene);

        stage.show();
    }

}