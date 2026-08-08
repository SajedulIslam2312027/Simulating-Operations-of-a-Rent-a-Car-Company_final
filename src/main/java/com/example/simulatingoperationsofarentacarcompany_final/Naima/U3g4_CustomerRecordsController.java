package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.HelloApplication;
import com.example.simulatingoperationsofarentacarcompany_final.Sajedul.Customer;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.cell.PropertyValueFactory;
import java.util.ArrayList;

public class U3g4_CustomerRecordsController {

    @javafx.fxml.FXML
    private TableColumn<CustomerRecord, String> idTableColumn;
    @javafx.fxml.FXML
    private TableColumn<CustomerRecord, String> nameTableColumn;
    @javafx.fxml.FXML
    private TableView<CustomerRecord> tableView;
    @javafx.fxml.FXML
    private ComboBox selectCustomerTypeComboBox;
    @javafx.fxml.FXML
    private TableColumn<CustomerRecord, String> phoneTableColumn;
    @javafx.fxml.FXML
    private Label customerRecordsManagementLabel;
    @javafx.fxml.FXML
    private DatePicker selectDatePicker;
    @javafx.fxml.FXML
    private TextField customerIdTF;

    ArrayList<Customer> customerList;

    @javafx.fxml.FXML
    public void initialize() {

        selectCustomerTypeComboBox.getItems().addAll(
                "Regular",
                "Premium",
                "All"
        );

        idTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("customerID")
        );

        nameTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("name")
        );

        phoneTableColumn.setCellValueFactory(
                new PropertyValueFactory<>("Phone")
        );

    }

    @javafx.fxml.FXML
    public void backButtonOnAction(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("Naima/U3g3_ValidatePromo.fxml")
        );
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(loader.load()));
        stage.show();
    }

    @javafx.fxml.FXML
    public void searchCustomerButtonOnAction(ActionEvent actionEvent) {
        ObservableList<CustomerRecord> customerList = FXCollections.observableArrayList();

        customerList.add(new CustomerRecord("C001", "Kaabir", "01716769524"));
        customerList.add(new CustomerRecord("C002", "Tawhid", "01712669510"));
        customerList.add(new CustomerRecord("C003", "Manha", "01749754644"));

        tableView.setItems(customerList);

    }
}