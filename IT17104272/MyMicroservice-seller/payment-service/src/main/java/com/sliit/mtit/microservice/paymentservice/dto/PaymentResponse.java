package com.sliit.mtit.microservice.paymentservice.dto;

public class PaymentResponse {
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
