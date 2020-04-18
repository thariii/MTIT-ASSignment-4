package com.sliit.mtit.microservice.sellingservice.dto;

public class SellerRequest {
    private String fullName;
    private String age;
    private String sellerType;
    private String coveredTime;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSellerType() {
        return sellerType;
    }

    public void setSellerType(String sellerType) {
        this.sellerType = sellerType;
    }

    public String getCoveredTime() {
        return coveredTime;
    }

    public void setCoveredTime(String coveredTime) {
        this.coveredTime = coveredTime;
    }

    @Override
    public String toString() {
        return "SellerRequest{" +
                "fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                ", sellerType='" + sellerType + '\'' +
                ", coveredTime='" + coveredTime + '\'' +
                '}';
    }
}
