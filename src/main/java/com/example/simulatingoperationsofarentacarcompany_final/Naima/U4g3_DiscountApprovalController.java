package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class U4g3_DiscountApprovalController {
    @javafx.fxml.FXML
    private TextField rejectionreasonTF;
    @javafx.fxml.FXML
    private TextArea requestDetailsTA;

    @javafx.fxml.FXML
    public void approveButtonOnAction(ActionEvent actionEvent) throws IOException {
        goNext(actionEvent);
    }
    @javafx.fxml.FXML
    public void rejectButtonOnAction(ActionEvent actionEvent)throws IOException {
        goNext(actionEvent);
    }
        private void goNext(ActionEvent actionEvent) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Naima/U4g4_CustomerFeedback.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("rent A Car");
        nextStage.setScene(scene);
        nextStage.show();
    }
    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent event)throws IOException {
            FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Naima/U4g2_ShiftSchedule.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load()));
            stage.show();
    }
}
