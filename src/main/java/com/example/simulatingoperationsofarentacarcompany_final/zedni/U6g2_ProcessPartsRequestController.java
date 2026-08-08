package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class U6g2_ProcessPartsRequestController {
    @FXML private TableView<PartsRequestRecord> requestTableView;
    @FXML private TableColumn<PartsRequestRecord, String> requestIdTC;
    @FXML private TableColumn<PartsRequestRecord, String> partNameTC;
    @FXML private TableColumn<PartsRequestRecord, Integer> quantityTC;
    @FXML private TableColumn<PartsRequestRecord, String> statusTC;

    @FXML
    public void initialize() {
        requestIdTC.setCellValueFactory(new PropertyValueFactory<>("requestId"));
        partNameTC.setCellValueFactory(new PropertyValueFactory<>("partName"));
        quantityTC.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        statusTC.setCellValueFactory(new PropertyValueFactory<>("status"));

        // নমুনা ডাটা লোড
        requestTableView.getItems().add(new PartsRequestRecord("R101", "Brake Pad", 4, "Pending"));
        requestTableView.getItems().add(new PartsRequestRecord("R102", "Air Filter", 2, "Pending"));
        requestTableView.getItems().add(new PartsRequestRecord("R103", "Headlight Bulb", 6, "Pending"));
    }

    @FXML
    public void approveDispatchButtonOnAction(ActionEvent actionEvent) {
        PartsRequestRecord selected = requestTableView.getSelectionModel().getSelectedItem();
        if (selected == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a request to approve.");
            alert.show();
            return;
        }

        selected.setStatus("Dispatched");
        requestTableView.refresh();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Request " + selected.getRequestId() + " approved and dispatched.");
        alert.show();
    }
}