package com.example.simulatingoperationsofarentacarcompany_final.Sajedul;

public
class Customer {
    private String customerID;
    private String name;
    private String email;
    private String phone;
    private String password;

    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public
    Customer setCustomerID(String customerID) {
        this.customerID = customerID;
        return this;
    }

    public
    Customer setName(String name) {
        this.name = name;
        return this;
    }

    public
    Customer setEmail(String email) {
        this.email = email;
        return this;
    }

    public
    Customer setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public
    Customer setPassword(String password) {
        this.password = password;
        return this;
    }

    public
    String getCustomerID() {
        return customerID;
    }

    public
    String getName() {
        return name;
    }

    public
    String getEmail() {
        return email;
    }

    public
    String getPhone() {
        return phone;
    }

    public
    String getPassword() {
        return password;
    }

    public
    Customer(String customerID, String name, String email, String phone, String password) {
        this.customerID = customerID;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
