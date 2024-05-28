package com.example.demo.models;

public class OrderResponse {

    private String orderId;
    private String broth;
    private String protein;
    private String message;

    // Constructors
    public OrderResponse(String message) {
        this.message = message;
    }

    public OrderResponse(String orderId, String broth, String protein) {
        this.orderId = orderId;
        this.broth = broth;
        this.protein = protein;
        this.message = "Order created successfully";
    }

    // Getters and Setters
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getBroth() {
        return broth;
    }

    public void setBroth(String broth) {
        this.broth = broth;
    }

    public String getProtein() {
        return protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
