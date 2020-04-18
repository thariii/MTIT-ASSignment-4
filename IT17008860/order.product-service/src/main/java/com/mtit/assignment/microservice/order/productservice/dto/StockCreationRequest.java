package com.mtit.assignment.microservice.order.productservice.dto;

public class StockCreationRequest {

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
}
