package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class U3g4_ShiftScheduleController {
    @javafx.fxml.FXML
    private TextField agentIdTF;
    @javafx.fxml.FXML
    private DatePicker shiftDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String > shiftTypeComboBox;
    @javafx.fxml.FXML
    public void initialize() {
        shiftTypeComboBox.getItems().addAll("Morning ( 8 AM - 4 PM ", "Evening (4 PM - 12 AM ) ", "Night (12 AM - 8 AM) ");
    }
    @javafx.fxml.FXML
    public void checkShiftOnAction(ActionEvent actionEvent) {
        System.out.println(" Schedule checked .");
    }
    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent actionEvent) throws IOException {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("U3_RentalAgentDashboard.fxml"));
            Parent root = loader.load();
            Stage currentStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            currentStage.setScene(new Scene(root));
            currentStage.show();
        }
        catch (IOException e) {
            System.out.println("Error Loading back scene: " + e.getMessage());
        }
    }
}
