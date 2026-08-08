package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import java.io.Serializable;

public class Vehicle implements Serializable {

    private String make;
    private String model;
    private String year;
    private String colour;
    private String plate;

    public Vehicle(String make, String model, String year, String colour, String plate) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.colour = colour;
        this.plate = plate;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }

    public String getColour() {
        return colour;
    }

    public String getPlate() {
        return plate;
    }
}