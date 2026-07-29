package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class U4g2_ShiftScheduleController {
    public ComboBox staffCB;
    public TextField startTimeTF;
    public TextField endTimeTF;
    @javafx.fxml.FXML
    public void assignShiftButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Naima/U4g3_DiscountApproval.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("rent A Car");
        nextStage.setScene(scene);
        nextStage.show();
    }
}

