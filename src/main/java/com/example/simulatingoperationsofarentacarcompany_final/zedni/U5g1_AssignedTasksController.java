package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;

public class U5g1_AssignedTasksController {
    @FXML private TableView<?> taskTableView;

    @FXML
    public void viewTaskButtonOnAction(ActionEvent actionEvent) {
        if (taskTableView.getSelectionModel().getSelectedItem() == null) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please select a task from the table.");
            alert.show();
            return;
        }
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Task details loaded.");
        alert.show();
    }
}