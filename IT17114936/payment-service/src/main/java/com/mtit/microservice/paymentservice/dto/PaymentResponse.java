package com.mtit.microservice.paymentservice.dto;

public class PaymentResponse {

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
