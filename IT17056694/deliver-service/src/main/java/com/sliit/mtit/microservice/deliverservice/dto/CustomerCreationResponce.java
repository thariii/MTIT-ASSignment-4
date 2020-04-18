package com.sliit.mtit.microservice.deliverservice.dto;

public class CustomerCreationResponce {

    private String CustomerID;
    private String Message;

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
