package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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
    public void backButtonOnAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Naima/U3g1_ProcessReturn.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
