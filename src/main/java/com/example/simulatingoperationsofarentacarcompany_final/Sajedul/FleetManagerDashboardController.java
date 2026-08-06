package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import java.io.IOException;

public class FleetManagerDashboardController {

    @javafx.fxml.FXML
    private BorderPane fleetBorderpane;

    @javafx.fxml.FXML
    public void addVehicleButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U2g1_VehicleAdd.fxml"));
        fleetBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void maintenanceButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U2g2_MaintenanceScheduler.fxml"));
        fleetBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void statusButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U2g3_VehicleStatusUpdate.fxml"));
        fleetBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void trackingButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U2g4_FleetTracking.fxml"));
        fleetBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void reportButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U2g5_FleetUtilisationReport.fxml"));
        fleetBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void fuelLogButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U2g6_FuelLog.fxml"));
        fleetBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void damageButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U2g7_DamageReportReview.fxml"));
        fleetBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void retireButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U2g8_VehicleRetire.fxml"));
        fleetBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("SajedulDashboard.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Rent A Car");
        nextStage.setScene(scene);
        nextStage.show();
    }
}