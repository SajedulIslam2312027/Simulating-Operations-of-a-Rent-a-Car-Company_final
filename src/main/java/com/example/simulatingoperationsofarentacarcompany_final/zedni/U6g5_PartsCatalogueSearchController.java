package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class U6g5_PartsCatalogueSearchController {
    @FXML private TableView<Part> partsTV1;
    @FXML private TableColumn<Part, String> nameTC1;
    @FXML private TableColumn<Part, String> codeTC1;
    @FXML private TableColumn<Part, String> categoryTC1;
    @FXML private TableColumn<Part, Double> priceTC1;
    @FXML private TableColumn<Part, Integer> quantityTC1;

    @FXML private TableView<Part> partsTV2;
    @FXML private TableColumn<Part, String> nameTC2;
    @FXML private TableColumn<Part, String> codeTC2;
    @FXML private TableColumn<Part, String> categoryTC2;
    @FXML private TableColumn<Part, Double> priceTC2;
    @FXML private TableColumn<Part, Integer> quantityTC2;

    @FXML
    public void initialize() {
        nameTC1.setCellValueFactory(new PropertyValueFactory<>("partName"));
        codeTC1.setCellValueFactory(new PropertyValueFactory<>("partCode"));
        categoryTC1.setCellValueFactory(new PropertyValueFactory<>("category"));
        priceTC1.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        quantityTC1.setCellValueFactory(new PropertyValueFactory<>("quantityReceived"));

        nameTC2.setCellValueFactory(new PropertyValueFactory<>("partName"));
        codeTC2.setCellValueFactory(new PropertyValueFactory<>("partCode"));
        categoryTC2.setCellValueFactory(new PropertyValueFactory<>("category"));
        priceTC2.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        quantityTC2.setCellValueFactory(new PropertyValueFactory<>("quantityReceived"));
    }

    @FXML
    public void loadPartsFromTextFileButtonOnAction(ActionEvent actionEvent) {
        try {
            File f = new File("PartsInfo.txt");
            if (!f.exists()) return;
            Scanner s = new Scanner(f);
            partsTV1.getItems().clear();
            while (s.hasNextLine()) {
                String str = s.nextLine();
                String[] tokens = str.split(",");
                if (tokens.length >= 5) {
                    Part p = new Part(tokens[0], tokens[1], tokens[2], Double.parseDouble(tokens[3]), Integer.parseInt(tokens[4]));
                    partsTV1.getItems().add(p);
                }
            }
            s.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    public void loadPartsFromBinFileButtonOnAction(ActionEvent actionEvent) {
        try {
            File f = new File("PartsInfo.bin");
            if (!f.exists()) return;
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            partsTV2.getItems().clear();
            while (true) {
                try {
                    partsTV2.getItems().add((Part) ois.readObject());
                } catch (Exception e) {
                    break;
                }
            }
            ois.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}