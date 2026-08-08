package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class U1g3_CarBookingController {

    @javafx.fxml.FXML
    private CheckBox insuranceCB;
    @javafx.fxml.FXML
    private CheckBox childSeatCB;
    @javafx.fxml.FXML
    private CheckBox gpsCB;
    @javafx.fxml.FXML
    private ComboBox pickupBranchCB;
    @javafx.fxml.FXML
    private ComboBox dropBranchCB;
    @javafx.fxml.FXML
    private TextArea totalCostTA;

    @javafx.fxml.FXML
    public void confirmBookingButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Sajedul/U1g4_Payment.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("Rent A Car");
        nextStage.setScene(scene);
        nextStage.show();
    }
}
