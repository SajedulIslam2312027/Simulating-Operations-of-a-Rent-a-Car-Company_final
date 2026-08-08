package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class U1g2_CarSearchController {

    @javafx.fxml.FXML
    private TextField locationTF;
    @javafx.fxml.FXML
    private DatePicker startDateDP;
    @javafx.fxml.FXML
    private DatePicker endDateDP;
    @javafx.fxml.FXML
    private TableView carTableView;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private TableColumn modelTC;
    @javafx.fxml.FXML
    private TableColumn rateTC;
    @javafx.fxml.FXML
    private TableColumn idTC;

    @javafx.fxml.FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {

        if (locationTF.getText().isEmpty() || startDateDP.getValue() == null || endDateDP.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please enter a location and both dates to search.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Showing available cars in " + locationTF.getText() + ".");
        alert.show();
    }

    @javafx.fxml.FXML
    public void bookButtonOnAction(ActionEvent actionEvent) {

        if (carTableView.getSelectionModel().getSelectedItem() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a car from the results to book.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Car selected. Continue to Car Booking from the sidebar.");
        alert.show();
    }
}