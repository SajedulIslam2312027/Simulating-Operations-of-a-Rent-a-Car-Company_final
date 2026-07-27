package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class U2g2_MaintenanceSchedulerController {

    @javafx.fxml.FXML
    private ComboBox typeCB;
    @javafx.fxml.FXML
    private DatePicker serviceDateDP;
    @javafx.fxml.FXML
    private TextField vehicleIdTF;

    @javafx.fxml.FXML
    public void scheduleButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U2g3_VehicleStatusUpdate.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Rent A Car");
        nextStage.setScene(scene);
        nextStage.show();
    }
}