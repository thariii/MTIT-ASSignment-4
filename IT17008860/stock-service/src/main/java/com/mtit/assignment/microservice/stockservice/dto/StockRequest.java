package com.mtit.assignment.microservice.stockservice.dto;

public class StockRequest {

    private String productName;
    private String productCount;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCount() {
        return productCount;
    }

    public void setProductCount(String productCount) {
        this.productCount = productCount;
    }

    @Override
    public String toString() {
        return "StockRequest{" +
                "productName='" + productName + '\'' +
                ", productCount='" + productCount + '\'' +
                '}';
    }
}
