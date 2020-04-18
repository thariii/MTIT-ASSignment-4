package com.sliit.mtit.microservice.deliverservice.dto;

import java.util.Date;

public class DetailsRequest {

    private String fullName;
    private String address;
    private  int mobileNumber1;
    private int mobileNumber2;
    private  String oderNumber;
    private String oderDetails;
    private String oderDate;
    private String payment;

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

    public int getMobileNumber1() {
        return mobileNumber1;
    }

    public void setMobileNumber1(int mobileNumber1) {
        this.mobileNumber1 = mobileNumber1;
    }

    public int getMobileNumber2() {
        return mobileNumber2;
    }

    public void setMobileNumber2(int mobileNumber2) {
        this.mobileNumber2 = mobileNumber2;
    }

    public String getOderNumber() {
        return oderNumber;
    }

    public void setOderNumber(String oderNumber) {
        this.oderNumber = oderNumber;
    }

    public String getOderDetails() {
        return oderDetails;
    }

    public void setOderDetails(String oderDetails) {
        this.oderDetails = oderDetails;
    }

    public String getOderDate() {
        return oderDate;
    }

    public void setOderDate(String oderDate) {
        this.oderDate = oderDate;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "DetailsRequest{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", mobileNumber1=" + mobileNumber1 +
                ", mobileNumber2=" + mobileNumber2 +
                ", oderNumber='" + oderNumber + '\'' +
                ", oderDetails='" + oderDetails + '\'' +
                ", oderDate='" + oderDate + '\'' +
                ", payment='" + payment + '\'' +
                '}';
    }
}
