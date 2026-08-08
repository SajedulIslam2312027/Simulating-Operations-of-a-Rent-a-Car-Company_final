package com.example.simulatingoperationsofarentacarcompany_final.Naima;

import com.example.simulatingoperationsofarentacarcompany_final.AppendableObjectOutputStream;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class U3g1_ProcessReturnController
{
    @javafx.fxml.FXML
    private Label processVehicleReturnLable;
    @javafx.fxml.FXML
    private TextField rentalIdTF;
    @javafx.fxml.FXML
    private TextArea conditionNoteTextArea;
    @javafx.fxml.FXML
    private TextField odometerReadingTF;
    @javafx.fxml.FXML
    private ComboBox<String> fuelLevelCombobox;

    ArrayList<String>returnList;

    @javafx.fxml.FXML
    public void initialize() {
        returnList = new ArrayList<String>();

        fuelLevelCombobox.getItems().addAll(
                "Empty",
                "Quarter(1/4)",
                "Half(1/2)",
                "Three-Quarters(3/4)",
                "Full");
    }

    @javafx.fxml.FXML
    public void processReturnOnAction(ActionEvent actionEvent) {
        String record =
                "Rental ID:" + rentalIdTF.getText()
                        + "Odometer:" + odometerReadingTF.getText()
                        + "Fuel Level:" + fuelLevelCombobox.getValue()
                        + "Vehicle Condition:" + conditionNoteTextArea.getText();
        returnList.add(record);

        rentalIdTF.clear();
        odometerReadingTF.clear();
        conditionNoteTextArea.clear();
        fuelLevelCombobox.setValue(null);
    }
    @javafx.fxml.FXML
    public void saveReturnListToTextFileButtonOnAction(ActionEvent actionEvent){
        FileWriter fw = null;
        try {
            File f = new File("VehicleReturnInfo.txt");

            if (f.exists()){
                fw = new FileWriter(f,true);
            } else {
                fw = new FileWriter(f);
            }
            String str = "";
            for(String s: returnList){
                str += s + "\n";
            }
            fw.write(str);
            fw.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    @javafx.fxml.FXML
    public void saveReturnListToBinFileButtonOnAction(ActionEvent actionEvent){
        try {
            File f = new File("VehicleReturnInfo.bin");

            FileOutputStream fos = null;
            ObjectOutputStream oos = null;

            if(f.exists()) {
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);
            } else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }
            for (String s : returnList){
                oos.writeObject(s);
            }
            oos.close();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}