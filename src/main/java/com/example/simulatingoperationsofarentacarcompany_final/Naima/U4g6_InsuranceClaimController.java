package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class U4g6_InsuranceClaimController {
    @javafx.fxml.FXML
    private ComboBox selectClaimCB;
    @javafx.fxml.FXML
    private TextArea claimDetailsTA;

    @javafx.fxml.FXML
    public void approveClaimOnAction(ActionEvent actionEvent) throws IOException {
        goNext(actionEvent);
    }
    @javafx.fxml.FXML
    public void rejectClaimOnAction(ActionEvent actionEvent) throws IOException{

        goNext(actionEvent);
    }
    private void goNext(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Naima/U4g7_RevenueReport.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("rent A Car");
        nextStage.setScene(scene);
        nextStage.show();
    }
    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Naima/U4g5_LeaveApproval.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }
}
