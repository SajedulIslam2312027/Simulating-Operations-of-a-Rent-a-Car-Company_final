package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

import java.io.Serializable;

public class Booking implements Serializable {

    private String bookingId;
    private String vehicleId;
    private String pickupBranch;
    private String dropBranch;
    private String startDate;
    private String endDate;
    private String status;

    public Booking(String bookingId, String vehicleId,
                   String pickupBranch, String dropBranch,
                   String startDate, String endDate,
                   String status) {

        this.bookingId = bookingId;
        this.vehicleId = vehicleId;
        this.pickupBranch = pickupBranch;
        this.dropBranch = dropBranch;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getPickupBranch() {
        return pickupBranch;
    }

    public String getDropBranch() {
        return dropBranch;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}