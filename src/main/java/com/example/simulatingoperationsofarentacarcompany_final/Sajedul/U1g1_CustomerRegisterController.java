package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class U1g1_CustomerRegisterController {

    ArrayList<Customer> allCustomers;

    @javafx.fxml.FXML
    private TextField nameTF;
    @javafx.fxml.FXML
    private TextField emailTF;
    @javafx.fxml.FXML
    private TextField phoneTF;
    @javafx.fxml.FXML
    private PasswordField passwordPF;
    @javafx.fxml.FXML
    private PasswordField confirmPasswordPF;

    @javafx.fxml.FXML
    public void initialize() {
        allCustomers = new ArrayList<Customer>();
    }

    @javafx.fxml.FXML
    public void registerButtonOnAction(ActionEvent actionEvent) throws IOException {
        if (nameTF.getText().isEmpty() || emailTF.getText().isEmpty()
                || phoneTF.getText().isEmpty() || passwordPF.getText().isEmpty()
                || confirmPasswordPF.getText().isEmpty()) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Fill up the form properly");
            myAlert.show();
            return;
        }

        if (!passwordPF.getText().equals(confirmPasswordPF.getText())) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Passwords do not match");
            myAlert.show();
            return;
        }

        if (passwordPF.getText().length() < 6) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Password must be at least 6 characters");
            myAlert.show();
            return;
        }

        boolean emailFound = false;
        for (Customer c : allCustomers) {
            if (c.getEmail().equals(emailTF.getText())) {
                emailFound = true;
            }
        }
        if (emailFound) {
            Alert myAlert = new Alert(Alert.AlertType.ERROR);
            myAlert.setContentText("Email already registered");
            myAlert.show();
            return;
        }

        String newId = "C" + (allCustomers.size() + 1);
        Customer c1 = new Customer(newId, nameTF.getText(), emailTF.getText(), phoneTF.getText(), passwordPF.getText());
        allCustomers.add(c1);

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U1g2_CarSearch.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Rent A Car");
        nextStage.setScene(scene);
        nextStage.show();
    }
}