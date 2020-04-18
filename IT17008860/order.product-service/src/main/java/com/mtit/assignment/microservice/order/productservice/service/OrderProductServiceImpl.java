package com.mtit.assignment.microservice.order.productservice.service;

import ch.qos.logback.classic.spi.TurboFilterList;
import com.mtit.assignment.microservice.order.productservice.dto.OrderProductRequest;
import com.mtit.assignment.microservice.order.productservice.dto.OrderProductResponse;
import com.mtit.assignment.microservice.order.productservice.dto.StockCreationRequest;
import com.mtit.assignment.microservice.order.productservice.dto.StockCreationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class OrderProductServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public OrderProductResponse createProductOrder(OrderProductRequest orderProductRequest){

        var stockCreationRequest = new StockCreationRequest();
        stockCreationRequest.setProductCount(orderProductRequest.getProductCount());
        stockCreationRequest.setProductName(orderProductRequest.getProductName());
        ResponseEntity<StockCreationResponse> stockCreationResponse =restTemplate.postForEntity("http://localhost:8080/stocks",stockCreationRequest, StockCreationResponse.class);


        var orderProductResponse = new OrderProductResponse();
        orderProductResponse.setProductId(UUID.randomUUID().toString());
        orderProductResponse.setStockId(stockCreationResponse.getBody().getStockId());
        orderProductResponse.setConfirmationMessage("Product is successfully ordered");

        return orderProductResponse;

    }

    @Bean
    private RestTemplate restTemplate(RestTemplateBuilder builder){

        return builder.build();
    }
}
