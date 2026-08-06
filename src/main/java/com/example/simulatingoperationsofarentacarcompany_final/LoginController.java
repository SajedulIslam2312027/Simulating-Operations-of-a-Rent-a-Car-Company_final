package com.example.simulatingoperationsofarentacarcompany_final;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoginController {

    @javafx.fxml.FXML
    private TextField usernameTF;

    @javafx.fxml.FXML
    private PasswordField passwordPF;

    @javafx.fxml.FXML
    private ComboBox<String> roleCB;

    @javafx.fxml.FXML
    public void initialize() {

        roleCB.getItems().addAll(
                "Customer",
                "Fleet Manager",
                "Rental Agent",
                "Branch Manager",
                "Maintenance Technician",
                "Inventory Manager"
        );
    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {

        String username = usernameTF.getText();
        String password = passwordPF.getText();
        String role = roleCB.getValue();

        if (username.isEmpty() || password.isEmpty() || role == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill all fields.");
            alert.show();
            return;
        }

        String nextFxml = "";

        if (username.equals("sajedul") && password.equals("sajedul123")) {

            if (role.equals("Customer")) {
                nextFxml = "Sajedul/CustomerDashboard.fxml";
            }

            else if (role.equals("Fleet Manager")) {
                nextFxml = "Sajedul/FleetManagerDashboard.fxml";
            }

            else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid role.");
                alert.show();
                return;
            }
        }

        else if (username.equals("naima") && password.equals("naima123")) {

            if (role.equals("Rental Agent")) {
                nextFxml = "Naima/U3_RentalAgentDashboard.fxml";
            }

            else if (role.equals("Branch Manager")) {
                nextFxml = "Naima/U4_BranchManagerDashboard.fxml";
            }

            else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid role.");
                alert.show();
                return;
            }
        }

        else if (username.equals("zedni") && password.equals("zedni123")) {

            if (role.equals("Maintenance Technician")) {
                nextFxml = "zedni/MaintenanceTechnicianDashboard.fxml";
            }

            else if (role.equals("Inventory Manager")) {
                nextFxml = "zedni/InventoryManagerDashboard.fxml";
            }

            else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid role.");
                alert.show();
                return;
            }
        }

        else {

            if (!role.equals("Customer")) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("New users can only login as Customer.");
                alert.show();
                return;
            }

            File file = new File("UserInfo.bin");

            if (!file.exists()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid Username or Password.");
                alert.show();
                return;
            }

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

            try {

                while (true) {

                    User user = (User) ois.readObject();

                    if (user.getUsername().equals(username)
                            && user.getPassword().equals(password)) {

                        nextFxml = "Sajedul/CustomerDashboard.fxml";
                        break;
                    }
                }

            }

            catch (EOFException e) {

            }

            catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            ois.close();

            if (nextFxml.equals("")) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Invalid Username or Password.");
                alert.show();
                return;
            }
        }

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource(nextFxml));

        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setTitle("Rent A Car");

        stage.setScene(scene);

        stage.show();
    }

    @javafx.fxml.FXML
    public void signupLinkOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Signup.fxml"));

        Scene scene = new Scene(loader.load());

        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);

        stage.show();
    }
}