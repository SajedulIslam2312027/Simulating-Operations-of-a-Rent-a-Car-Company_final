package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

import java.io.IOException;

public class U2g4_FleetTrackingController {

    @javafx.fxml.FXML
    private TableView locationTableView;
    @javafx.fxml.FXML
    private TableColumn vehicleIdTC;
    @javafx.fxml.FXML
    private ComboBox vehicleCB;
    @javafx.fxml.FXML
    private TableColumn latitudeTC;
    @javafx.fxml.FXML
    private TableColumn longitudeTC;

    @javafx.fxml.FXML
    public void trackButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U2g5_FleetUtilisationReport.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Rent A Car");
        nextStage.setScene(scene);
        nextStage.show();
    }
}