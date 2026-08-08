package com.example.simulatingoperationsofarentacarcompany_final.Naima;

public class CustomerRecord {

    private String customerId;
    private String name;
    private String phone;

    public CustomerRecord(String customerId, String name, String phone) {
        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }
}
