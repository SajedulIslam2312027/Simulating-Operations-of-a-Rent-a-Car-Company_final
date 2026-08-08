package com.example.simulatingoperationsofarentacarcompany_final.zedni;

public class  PartsRequestRecord {
    private String requestId, partName, status;
    private int quantity;

    public PartsRequestRecord(String requestId, String partName, int quantity, String status) {
        this.requestId = requestId;
        this.partName = partName;
        this.quantity = quantity;
        this.status = status;
    }

    public String getRequestId() { return requestId; }
    public String getPartName() { return partName; }
    public int getQuantity() { return quantity; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
