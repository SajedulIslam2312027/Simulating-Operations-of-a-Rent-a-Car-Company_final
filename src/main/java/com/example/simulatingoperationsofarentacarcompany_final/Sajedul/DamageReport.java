package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

public class DamageReport {
    private String reportId, vehicleId, severity, status;

    public DamageReport(String reportId, String vehicleId, String severity, String status) {
        this.reportId = reportId;
        this.vehicleId = vehicleId;
        this.severity = severity;
        this.status = status;
    }

    public String getReportId() {
        return reportId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getSeverity() {
        return severity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}