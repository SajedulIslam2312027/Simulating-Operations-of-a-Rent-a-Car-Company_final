package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class U2g7_DamageReportReviewController {

    @javafx.fxml.FXML
    private TableView damageTableView;
    @javafx.fxml.FXML
    private TableColumn reportIdTC;
    @javafx.fxml.FXML
    private TableColumn vehicleIdTC;
    @javafx.fxml.FXML
    private TableColumn severityTC;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private ComboBox newStatusCB;

    @javafx.fxml.FXML
    public void initialize() {
        reportIdTC.setCellValueFactory(new PropertyValueFactory<DamageReport, String>("reportId"));
        vehicleIdTC.setCellValueFactory(new PropertyValueFactory<DamageReport, String>("vehicleId"));
        severityTC.setCellValueFactory(new PropertyValueFactory<DamageReport, String>("severity"));
        statusTC.setCellValueFactory(new PropertyValueFactory<DamageReport, String>("status"));

        newStatusCB.getItems().addAll("Under Review", "Approved for Repair", "Rejected", "Repaired");

        damageTableView.getItems().add(new DamageReport("D101", "V101", "Minor", "Under Review"));
        damageTableView.getItems().add(new DamageReport("D102", "V204", "Major", "Under Review"));
        damageTableView.getItems().add(new DamageReport("D103", "V310", "Moderate", "Under Review"));
    }

    @javafx.fxml.FXML
    public void updateReportStatusButtonOnAction(ActionEvent actionEvent) {
        DamageReport selected = (DamageReport) damageTableView.getSelectionModel().getSelectedItem();

        if (selected == null || newStatusCB.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a report and choose a new status.");
            alert.show();
            return;
        }

        selected.setStatus((String) newStatusCB.getValue());
        damageTableView.refresh();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Report " + selected.getReportId() + " updated to " + newStatusCB.getValue() + ".");
        alert.show();
    }
}