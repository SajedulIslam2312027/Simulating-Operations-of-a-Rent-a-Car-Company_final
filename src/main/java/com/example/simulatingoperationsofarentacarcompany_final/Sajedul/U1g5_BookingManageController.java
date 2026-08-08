package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class U1g5_BookingManageController {

    @javafx.fxml.FXML
    private TableView bookingTableView;
    @javafx.fxml.FXML
    private TableColumn bookingIdTC;
    @javafx.fxml.FXML
    private TableColumn carTC;
    @javafx.fxml.FXML
    private TableColumn dateTC;
    @javafx.fxml.FXML
    private TableColumn statusTC;
    @javafx.fxml.FXML
    private DatePicker newDateDP;

    @javafx.fxml.FXML
    public void editBookingButtonOnAction(ActionEvent actionEvent) {

        if (bookingTableView.getSelectionModel().getSelectedItem() == null || newDateDP.getValue() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a booking and choose a new date.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Booking date updated to " + newDateDP.getValue() + ".");
        alert.show();
    }

    @javafx.fxml.FXML
    public void cancelBookingButtonOnAction(ActionEvent actionEvent) {

        if (bookingTableView.getSelectionModel().getSelectedItem() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a booking to cancel.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Booking cancelled.");
        alert.show();
    }
}