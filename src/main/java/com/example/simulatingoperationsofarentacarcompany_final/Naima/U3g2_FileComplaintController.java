package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class U3g2_FileComplaintController {

    @javafx.fxml.FXML
    private TextField customerIdTF;

    @javafx.fxml.FXML
    private ComboBox<String> complaintTypeComboBox;

    @javafx.fxml.FXML
    private TextArea complaintDetailsTextArea;

    @javafx.fxml.FXML
    private Label fileComplaintLabel;

    ArrayList<String> complaintList;

    @javafx.fxml.FXML
    public void initialize() {
        complaintList = new ArrayList<String>();
        complaintTypeComboBox.getItems().addAll("Vehicle Condition", "Overcharged Fee", "Staff Behaviour", "Late Delivery", "Other");
    }

    @javafx.fxml.FXML
    public void submitComplaintButtonOnAction(ActionEvent actionEvent) {

        if (customerIdTF.getText().isEmpty()
                || complaintTypeComboBox.getValue() == null
                || complaintDetailsTextArea.getText().isEmpty()) {
            System.out.println("Fill up the form properly");
        } else {

            String record = "Customer ID:" + customerIdTF.getText()
                    + ", Type:" + complaintTypeComboBox.getValue()
                    + ", Details:" + complaintDetailsTextArea.getText();

            complaintList.add(record);

            customerIdTF.clear();
            complaintDetailsTextArea.clear();
            complaintTypeComboBox.setValue(null);
        }
    }
    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent event)throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Naima/U3g1_ProcessReturn.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
