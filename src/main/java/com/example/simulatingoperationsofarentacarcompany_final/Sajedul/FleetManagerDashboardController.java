package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class FleetManagerDashboardController {

    @FXML
    private BorderPane fleetBorderpane;

    @FXML
    public void addVehicleButtonOnAction(ActionEvent actionEvent)
            throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "Sajedul/U2g1_VehicleAdd.fxml"
                )
        );

        fleetBorderpane.setCenter(loader.load());
    }

    @FXML
    public void maintenanceButtonOnAction(ActionEvent actionEvent)
            throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "Sajedul/U2g2_MaintenanceScheduler.fxml"
                )
        );

        fleetBorderpane.setCenter(loader.load());
    }

    @FXML
    public void statusButtonOnAction(ActionEvent actionEvent)
            throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "Sajedul/U2g3_VehicleStatusUpdate.fxml"
                )
        );

        fleetBorderpane.setCenter(loader.load());
    }

    @FXML
    public void trackingButtonOnAction(ActionEvent actionEvent)
            throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "Sajedul/U2g4_FleetTracking.fxml"
                )
        );

        fleetBorderpane.setCenter(loader.load());
    }

    @FXML
    public void reportButtonOnAction(ActionEvent actionEvent)
            throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "Sajedul/U2g5_FleetUtilisationReport.fxml"
                )
        );

        fleetBorderpane.setCenter(loader.load());
    }

    @FXML
    public void fuelLogButtonOnAction(ActionEvent actionEvent)
            throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "Sajedul/U2g6_FuelLog.fxml"
                )
        );

        fleetBorderpane.setCenter(loader.load());
    }

    @FXML
    public void damageButtonOnAction(ActionEvent actionEvent)
            throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "Sajedul/U2g7_DamageReportReview.fxml"
                )
        );

        fleetBorderpane.setCenter(loader.load());
    }

    @FXML
    public void retireButtonOnAction(ActionEvent actionEvent)
            throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "Sajedul/U2g8_VehicleRetire.fxml"
                )
        );

        fleetBorderpane.setCenter(loader.load());
    }

    @FXML
    public void logoutButtonOnAction(ActionEvent actionEvent)
            throws IOException {

        FXMLLoader loader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "Login.fxml"
                )
        );

        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource())
                .getScene()
                .getWindow();

        stage.setTitle("Rent A Car");
        stage.setScene(scene);
        stage.show();
    }
}