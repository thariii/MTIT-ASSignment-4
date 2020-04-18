package com.sliit.mtit.microservice.customerservice.dto;

public class CustomerResponse {

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
