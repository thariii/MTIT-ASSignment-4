package com.mtit.assignment.microservice.order.productservice.dto;

public class StockCreationResponse {

    private String stockId;
    private String confirmationMessage;

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getConfirmationMessage() {
        return confirmationMessage;
    }

    public void setConfirmationMessage(String confirmationMessage) {
        this.confirmationMessage = confirmationMessage;
    }
}
