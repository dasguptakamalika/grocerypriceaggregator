package com.example.grocery.model;

public class Product {
    private String store;
    private String name;
    private double price;
    private boolean membershipRequired;

    public Product(String store, String name, double price, boolean membershipRequired) {
        this.store = store;
        this.name = name;
        this.price = price;
        this.membershipRequired = membershipRequired;
    }

    // Getters and setters
    public String getStore() { return store; }
    public void setStore(String store) { this.store = store; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public boolean isMembershipRequired() { return membershipRequired; }
    public void setMembershipRequired(boolean membershipRequired) { this.membershipRequired = membershipRequired; }
}