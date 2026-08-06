package com.example.simulatingoperationsofarentacarcompany_final;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;

public class SignupController {

    @javafx.fxml.FXML
    private TextField usernameTF;

    @javafx.fxml.FXML
    private PasswordField passwordPF;

    @javafx.fxml.FXML
    private PasswordField confirmPasswordPF;

    @javafx.fxml.FXML
    public void registerButtonOnAction(ActionEvent actionEvent) throws IOException {

        if(usernameTF.getText().isEmpty() ||
                passwordPF.getText().isEmpty() ||
                confirmPasswordPF.getText().isEmpty()){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill up all fields.");
            alert.show();
            return;
        }

        if(!passwordPF.getText().equals(confirmPasswordPF.getText())){

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Passwords do not match.");
            alert.show();
            return;
        }

        User user = new User(
                usernameTF.getText(),
                passwordPF.getText()
        );

        File file = new File("UserInfo.bin");

        if(file.exists()){

            FileOutputStream fos = new FileOutputStream(file,true);

            AppendableObjectOutputStream aos =
                    new AppendableObjectOutputStream(fos);

            aos.writeObject(user);

            aos.close();

        }

        else{

            FileOutputStream fos = new FileOutputStream(file);

            ObjectOutputStream oos =
                    new ObjectOutputStream(fos);

            oos.writeObject(user);

            oos.close();

        }

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Registration Successful.");
        alert.showAndWait();

        FXMLLoader loader =
                new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));

        Scene scene = new Scene(loader.load());

        Stage stage =
                (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);

        stage.show();

    }

    @javafx.fxml.FXML
    public void backToLoginOnAction(ActionEvent actionEvent) throws IOException {

        FXMLLoader loader =
                new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));

        Scene scene = new Scene(loader.load());

        Stage stage =
                (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);

        stage.show();

    }

}