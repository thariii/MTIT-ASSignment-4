package com.mtit.microservice.productservice.dto;

public class PaymentCreationResponse {

    private String paymentID;
    private String message;

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
