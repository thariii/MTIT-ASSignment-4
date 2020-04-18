package com.mtit.microservice.productservice.dto;

public class ProductResponse {

    private String productId;
    private String paymentID;
    private String message;

    public String getProductId() {
        return productId;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
