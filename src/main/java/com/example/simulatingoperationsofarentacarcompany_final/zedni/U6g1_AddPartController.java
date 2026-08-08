package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import com.example.simulatingoperationsofarentacarcompany_final.AppendableObjectOutputStream;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class U6g1_AddPartController {
    @FXML private TextField nameTF;
    @FXML private TextField codeTF;
    @FXML private ComboBox<String> categoryCB;
    @FXML private TextField priceTF;
    @FXML private TextField quantityTF;

    private ArrayList<Part> partsList;

    @FXML
    public void initialize() {
        partsList = new ArrayList<>();
        categoryCB.getItems().addAll("Engine", "Brake", "Electrical", "Body", "Tyre");
    }

    @FXML
    public void addPartButtonOnAction(ActionEvent actionEvent) {
        if (nameTF.getText().isEmpty() || codeTF.getText().isEmpty()
                || categoryCB.getValue() == null
                || priceTF.getText().isEmpty() || quantityTF.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Fill up the form properly.");
            alert.show();
            return;
        }
        double price;
        int quantity;
        try {
            price = Double.parseDouble(priceTF.getText());
            quantity = Integer.parseInt(quantityTF.getText());
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Unit Price and Quantity must be numbers.");
            alert.show();
            return;
        }
        Part p = new Part(nameTF.getText(), codeTF.getText(), categoryCB.getValue(), price, quantity);
        partsList.add(p);
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Part added to Parts List.");
        alert.show();
        nameTF.clear();
        codeTF.clear();
        categoryCB.setValue(null);
        priceTF.clear();
        quantityTF.clear();
    }

    @FXML
    public void savePartsListToTextFileButtonOnAction(ActionEvent actionEvent) {
        try {
            File f = new File("PartsInfo.txt");
            FileWriter fw = f.exists() ? new FileWriter(f, true) : new FileWriter(f);
            StringBuilder str = new StringBuilder();
            for (Part p : partsList) {
                str.append(p.toString("abc"));
            }
            fw.write(str.toString());
            fw.close();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Saved to text file successfully.");
            alert.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @FXML
    public void savePartsListToBinFileButtonOnAction(ActionEvent actionEvent) {
        try {
            File f = new File("PartsInfo.bin");
            FileOutputStream fos;
            ObjectOutputStream oos;
            if (f.exists()) {
                fos = new FileOutputStream(f, true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            for (Part p : partsList) {
                oos.writeObject(p);
            }
            oos.close();
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Saved to binary file successfully.");
            alert.show();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}