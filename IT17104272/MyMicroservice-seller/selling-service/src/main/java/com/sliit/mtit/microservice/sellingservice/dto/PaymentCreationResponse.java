package com.sliit.mtit.microservice.sellingservice.dto;

public class PaymentCreationResponse {
    private String sellerId;
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
}
