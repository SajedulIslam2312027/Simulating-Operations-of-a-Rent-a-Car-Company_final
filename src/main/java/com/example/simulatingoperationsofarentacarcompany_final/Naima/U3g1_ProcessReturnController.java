package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class U3g1_ProcessReturnController {
    @javafx.fxml.FXML
    private TextField rentalIdTF;
    @javafx.fxml.FXML
    private TextField odometerReadingTF;
    @javafx.fxml.FXML
    private ComboBox<String> fuelLevelCombobox;
    @javafx.fxml.FXML
    private TextArea conditionNoteTextArea;
    @javafx.fxml.FXML
    public void processReturnOnAction(ActionEvent actionEvent) {
        System.out.println("Process Return button clicked");
    }
}