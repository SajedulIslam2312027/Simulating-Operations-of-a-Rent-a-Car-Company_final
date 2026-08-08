package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import com.example.simulatingoperationsofarentacarcompany_final.AppendableObjectOutputStream;
import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class U2g1_VehicleAddController {

    @FXML
    private TextField yearTF;

    @FXML
    private TextField colourTF;

    @FXML
    private TextField makeTF;

    @FXML
    private TextField modelTF;

    @FXML
    private TextField plateTF;

    @FXML
    public void addVehicleButtonOnAction(ActionEvent actionEvent) throws IOException {

        if (makeTF.getText().trim().isEmpty()
                || modelTF.getText().trim().isEmpty()
                || yearTF.getText().trim().isEmpty()
                || colourTF.getText().trim().isEmpty()
                || plateTF.getText().trim().isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Validation Error");
            alert.setHeaderText(null);
            alert.setContentText("Please fill in all vehicle information.");
            alert.show();
            return;
        }

        Vehicle vehicle = new Vehicle(
                makeTF.getText().trim(),
                modelTF.getText().trim(),
                yearTF.getText().trim(),
                colourTF.getText().trim(),
                plateTF.getText().trim()
        );

        File file = new File("Vehicle.bin");

        try {
            FileOutputStream fos = new FileOutputStream(file, true);

            ObjectOutputStream oos;

            if (file.length() == 0) {
                oos = new ObjectOutputStream(fos);
            } else {
                oos = new AppendableObjectOutputStream(fos);
            }

            oos.writeObject(vehicle);
            oos.close();

        } catch (IOException e) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("File Error");
            alert.setHeaderText(null);
            alert.setContentText("Unable to save vehicle information.");
            alert.show();
            return;
        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Vehicle Added");
        alert.setHeaderText(null);
        alert.setContentText("Vehicle has been added successfully.");
        alert.show();

        FXMLLoader fxmlLoader = new FXMLLoader(
                HelloApplication.class.getResource(
                        "Sajedul/U2g2_MaintenanceScheduler.fxml"));

        Scene scene = new Scene(fxmlLoader.load());

        Stage nextStage = (Stage) ((Node) actionEvent.getSource())
                .getScene()
                .getWindow();

        nextStage.setTitle("Rent A Car");
        nextStage.setScene(scene);
        nextStage.show();
    }
}