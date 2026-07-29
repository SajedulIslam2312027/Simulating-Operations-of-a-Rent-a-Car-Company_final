package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
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

public class U3g2_FileComplaintController {

    @javafx.fxml.FXML
    private TextField customerIdTF;
    @javafx.fxml.FXML
    private ComboBox<String> complaintTypeComboBox;
    @javafx.fxml.FXML
    private TextArea complaintDetailsTextArea;

    @javafx.fxml.FXML
    public void submitComplaintOnAction(ActionEvent actionEvent) {
        System.out.println("Complaint Submitted");
    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("U3_RentalAgentDashboard.fxml"));
            Parent root = loader.load();
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(new Scene(root));
            currentStage.show();
        } catch (IOException e) {
            System.out.println("Error Loading back scene: " + e.getMessage());
        }
    }
}
