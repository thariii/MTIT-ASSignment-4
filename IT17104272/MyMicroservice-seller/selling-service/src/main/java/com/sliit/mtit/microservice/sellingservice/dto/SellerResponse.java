package com.sliit.mtit.microservice.sellingservice.dto;

import java.util.PrimitiveIterator;

public class SellerResponse {
    private String sellerId;
    private String paymentId;
    private String salaryReport;

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getSalaryReport() {
        return salaryReport;
    }

    public void setSalaryReport(String salaryReport) {
        this.salaryReport = salaryReport;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
}
