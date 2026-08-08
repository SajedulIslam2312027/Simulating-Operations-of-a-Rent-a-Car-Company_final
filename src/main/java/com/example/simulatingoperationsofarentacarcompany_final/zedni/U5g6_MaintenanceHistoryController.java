package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.ArrayList;

public class U5g6_MaintenanceHistoryController {
    @FXML private TextField vehicleIdTF;
    @FXML private TableView<MaintenanceRecord> historyTableView;
    @FXML private TableColumn<MaintenanceRecord, String> dateTC;
    @FXML private TableColumn<MaintenanceRecord, String> serviceTypeTC;
    @FXML private TableColumn<MaintenanceRecord, Double> costTC;

    private ArrayList<MaintenanceRecord> allRecords;

    @FXML
    public void initialize() {
        dateTC.setCellValueFactory(new PropertyValueFactory<>("date"));
        serviceTypeTC.setCellValueFactory(new PropertyValueFactory<>("serviceType"));
        costTC.setCellValueFactory(new PropertyValueFactory<>("cost"));

        allRecords = new ArrayList<>();
        allRecords.add(new MaintenanceRecord("V101", "2026-05-02", "Oil Change", 1500.0));
        allRecords.add(new MaintenanceRecord("V101", "2026-06-20", "Brake Service", 3200.0));
        allRecords.add(new MaintenanceRecord("V204", "2026-07-01", "Tyre Replacement", 5400.0));
    }

    @FXML
    public void searchHistoryButtonOnAction(ActionEvent actionEvent) {
        if (vehicleIdTF.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter a Vehicle ID to search.");
            alert.show();
            return;
        }
        historyTableView.getItems().clear();
        for (MaintenanceRecord r : allRecords) {
            if (r.getVehicleId().equalsIgnoreCase(vehicleIdTF.getText())) {
                historyTableView.getItems().add(r);
            }
        }
        if (historyTableView.getItems().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("No maintenance history found for that vehicle.");
            alert.show();
        }
    }
}