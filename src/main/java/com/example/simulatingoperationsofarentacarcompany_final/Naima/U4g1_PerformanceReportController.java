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


public class U4g1_PerformanceReportController {
    @javafx.fxml.FXML
    private ComboBox<String> timePeriodComboBox;
    @javafx.fxml.FXML
    private TextArea performanceIndicatorTextArea;

    @javafx.fxml.FXML
    public void initialize(){
        timePeriodComboBox.getItems().clear();
        timePeriodComboBox.getItems().addAll(
                "Daily",
                "Weekly",
                "Monthly",
                "Yearly"
        );
        }

    @javafx.fxml.FXML
    public void exportDashboardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Naima/U4g2_ShiftSchedule.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage nextStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        nextStage.setTitle("rent A Car");
        nextStage.setScene(scene);
        nextStage.show();
    }
}

