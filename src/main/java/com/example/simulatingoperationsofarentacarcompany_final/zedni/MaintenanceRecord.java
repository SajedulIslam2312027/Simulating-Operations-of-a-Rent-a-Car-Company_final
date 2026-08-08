package com.example.simulatingoperationsofarentacarcompany_final.zedni;

public class MaintenanceRecord {
    private String vehicleId, date, serviceType;
    private double cost;

    public MaintenanceRecord(String vehicleId, String date, String serviceType, double cost) {
        this.vehicleId = vehicleId;
        this.date = date;
        this.serviceType = serviceType;
        this.cost = cost;
    }

    public String getVehicleId() { return vehicleId; }
    public String getDate() { return date; }
    public String getServiceType() { return serviceType; }
    public double getCost() { return cost; }
}
