package com.example.simulatingoperationsofarentacarcompany_final.zedni;

import java.io.Serializable;

public class Part implements Serializable {
    private String partName, partCode, category;
    private double unitPrice;
    private int quantityReceived;

    public Part(String partName, String partCode, String category, double unitPrice, int quantityReceived) {
        this.partName = partName;
        this.partCode = partCode;
        this.category = category;
        this.unitPrice = unitPrice;
        this.quantityReceived = quantityReceived;
    }

    public Part() {}

    public String getPartName() { return partName; }
    public void setPartName(String partName) { this.partName = partName; }

    public String getPartCode() { return partCode; }
    public void setPartCode(String partCode) { this.partCode = partCode; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    public int getQuantityReceived() { return quantityReceived; }
    public void setQuantityReceived(int quantityReceived) { this.quantityReceived = quantityReceived; }

    @Override
    public String toString() {
        return "Part{" +
                "partName='" + partName + '\'' +
                ", partCode='" + partCode + '\'' +
                ", category='" + category + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantityReceived=" + quantityReceived +
                '}';
    }

    public String toString(String random) {
        return partName + "," + partCode + "," + category + "," + unitPrice + "," + quantityReceived + "\n";
    }
}
