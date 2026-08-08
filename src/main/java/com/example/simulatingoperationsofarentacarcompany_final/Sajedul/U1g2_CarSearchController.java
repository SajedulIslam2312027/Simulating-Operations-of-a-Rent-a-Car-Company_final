package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class U1g2_CarSearchController {

    @FXML
    private DatePicker startDateDP;

    @FXML
    private DatePicker endDateDP;

    @FXML
    private TableView<Vehicle> carTableView;

    @FXML
    private TableColumn<Vehicle, String> idTC;

    @FXML
    private TableColumn<Vehicle, String> modelTC;

    @FXML
    private TableColumn<Vehicle, String> statusTC;

    @FXML
    private TableColumn<Vehicle, String> rateTC;

    @FXML
    public void initialize() {

        idTC.setCellValueFactory(
                new PropertyValueFactory<>("plate")
        );

        modelTC.setCellValueFactory(
                new PropertyValueFactory<>("model")
        );
    }

    @FXML
    public void searchButtonOnAction(ActionEvent actionEvent) {

        if (startDateDP.getValue() == null ||
                endDateDP.getValue() == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select both dates.");
            alert.show();
            return;
        }

        if (!startDateDP.getValue().isBefore(endDateDP.getValue())) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(
                    "Start date must be before end date."
            );
            alert.show();
            return;
        }

        ObservableList<Vehicle> vehicles =
                FXCollections.observableArrayList();

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream("Vehicle.bin")
                    );

            while (true) {

                try {
                    vehicles.add((Vehicle) ois.readObject());
                } catch (EOFException e) {
                    break;
                }
            }

            ois.close();

            carTableView.setItems(vehicles);

        } catch (IOException | ClassNotFoundException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(
                    "Unable to load vehicle information."
            );
            alert.show();
        }
    }

    @FXML
    public void bookButtonOnAction(ActionEvent actionEvent) {

        Vehicle selectedVehicle =
                carTableView.getSelectionModel()
                        .getSelectedItem();

        if (selectedVehicle == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText(
                    "Please select a vehicle first."
            );
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText(
                "Vehicle " + selectedVehicle.getPlate()
                        + " selected."
        );
        alert.show();
    }
}