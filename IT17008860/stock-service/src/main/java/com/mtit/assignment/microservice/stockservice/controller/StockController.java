package com.mtit.assignment.microservice.stockservice.controller;

import com.mtit.assignment.microservice.stockservice.dto.StockRequest;
import com.mtit.assignment.microservice.stockservice.dto.StockResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/stocks")
public class StockController {

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody StockResponse createStock(@RequestBody StockRequest stockRequest){

        System.out.println("Stock Details : "+ stockRequest);

        var stockResponse = new StockResponse();
        stockResponse.setStockId(UUID.randomUUID().toString());
        stockResponse.setConfirmationMessage("Stock is successfully created");

        return stockResponse;
    }
}
