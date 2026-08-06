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

public class InventoryManagerDashboardController {

    @FXML
    private BorderPane dashboardBorderPane;

    @FXML
    public void addPartOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U6g1_AddPart.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void processPartsRequestOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U6g2_ProcessPartsRequest.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void lowStockOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U6g3_LowStock.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void expiryManageOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U6g4_ExpiryManage.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void partsCatalogueSearchOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U6g5_PartsCatalogueSearch.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void supplierUpdateOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U6g6_SupplierUpdate.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void partsUsageReportOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U6g7_PartsUsageReport.fxml"));
        dashboardBorderPane.setCenter(loader.load());
    }

    @FXML
    public void physicalAuditOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("zedni/U6g8_PhysicalAudit.fxml"));
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