package com.sliit.mtit.microservice.deliverservice.dto;

public class CustomerCreationRequest {

    private String fullName;
    private String address;
    private int phoneNumber;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "CustomerCreationRequest{" +
                "FullName='" + fullName + '\'' +
                ", Address='" + address + '\'' +
                ", PhoneNumber=" + phoneNumber +
                '}';
    }
}
