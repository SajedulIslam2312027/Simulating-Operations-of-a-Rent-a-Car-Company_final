package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class U2g4_FleetTrackingController {

    @FXML
    private ComboBox<String> vehicleCB;

    @FXML
    private TableView locationTableView;

    @FXML
    private TableColumn vehicleIdTC;

    @FXML
    private TableColumn latitudeTC;

    @FXML
    private TableColumn longitudeTC;

    @FXML
    public void initialize() {

        try {

            ObjectInputStream ois =
                    new ObjectInputStream(
                            new FileInputStream("Vehicle.bin")
                    );

            while (true) {

                try {

                    Vehicle vehicle =
                            (Vehicle) ois.readObject();

                    vehicleCB.getItems().add(
                            vehicle.getPlate()
                    );

                } catch (EOFException e) {
                    break;
                }
            }

            ois.close();

        } catch (IOException | ClassNotFoundException e) {

            Alert alert =
                    new Alert(Alert.AlertType.ERROR);

            alert.setContentText(
                    "Unable to load vehicle information."
            );

            alert.show();
        }
    }

    @FXML
    public void trackButtonOnAction(ActionEvent actionEvent) {

        if (vehicleCB.getValue() == null) {

            Alert alert =
                    new Alert(Alert.AlertType.ERROR);

            alert.setContentText(
                    "Please select a vehicle to track."
            );

            alert.show();

            return;
        }

        Alert alert =
                new Alert(Alert.AlertType.INFORMATION);

        alert.setContentText(
                "Showing live location for vehicle "
                        + vehicleCB.getValue()
                        + "."
        );

        alert.show();
    }
}