package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class U3g5_InspectVehicleConditionController {
    @javafx.fxml.FXML
    private TextField vehicleRegistrationTF;
    @javafx.fxml.FXML
    private ComboBox<String> overallStatusComboBox;
    @javafx.fxml.FXML
    private TextArea inspectionNotesTextArea;
    @javafx.fxml.FXML
    public void initialize() {
        overallStatusComboBox.getItems().addAll("Excellent","Good","Needs Maintenance","Damaged");
    }
    @javafx.fxml.FXML
    public void submitInspectionReportOnAction(ActionEvent actionEvent) {
        System.out.println("Inspection report submitted.");
    }
    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Naima/U3g4_ShiftSchedule.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
