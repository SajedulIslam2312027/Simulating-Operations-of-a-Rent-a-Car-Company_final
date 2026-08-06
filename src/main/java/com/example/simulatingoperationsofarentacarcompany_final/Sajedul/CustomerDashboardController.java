package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CustomerDashboardController {

    @javafx.fxml.FXML
    private BorderPane customerBorderpane;

    @javafx.fxml.FXML
    public void registerButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U1g1_CustomerRegister.fxml"));
        customerBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void searchButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U1g2_CarSearch.fxml"));
        customerBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void bookingButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U1g3_CarBooking.fxml"));
        customerBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void paymentButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U1g4_Payment.fxml"));
        customerBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void manageButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U1g5_BookingManage.fxml"));
        customerBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void roadsideButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U1g6_RoadsideAssistance.fxml"));
        customerBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void historyButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U1g7_RentalHistory.fxml"));
        customerBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void reviewButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U1g8_ReviewSubmit.fxml"));
        customerBorderpane.setCenter(fxmlLoader.load());
    }

    @javafx.fxml.FXML
    public void logoutButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Rent A Car");
        nextStage.setScene(scene);
        nextStage.show();
    }
}