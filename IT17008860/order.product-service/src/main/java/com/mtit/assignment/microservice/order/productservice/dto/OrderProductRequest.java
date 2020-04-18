package com.mtit.assignment.microservice.order.productservice.dto;

public class OrderProductRequest {

    private String productName;
    private String productColor;
    private String productCount;
    private String productDetails;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCount() {
        return productCount;
    }

    public void setProductCount(String productCount) {
        this.productCount = productCount;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;


    }

    @Override
    public String toString() {
        return "OrderProductRequest{" +
                "productName='" + productName + '\'' +
                ", productColor='" + productColor + '\'' +
                ", productCount='" + productCount + '\'' +
                ", productDetails='" + productDetails + '\'' +
                '}';
    }
}
