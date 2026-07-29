package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class U3g3_ValidatePromoController {
    @javafx.fxml.FXML
    private TextField promoCodeTF;
    @javafx.fxml.FXML
    private TextField originalAmountTF;
    @javafx.fxml.FXML
    public void validatePromoOnAction(ActionEvent actionEvent) {
        System.out.println("Validate Promo Clicked");
    }
     @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent event)throws IOException {
         FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Naima/U3g2_FileComplaint.fxml"));
         Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
         stage.setScene(new Scene(loader.load()));
         stage.show();
     }
}

