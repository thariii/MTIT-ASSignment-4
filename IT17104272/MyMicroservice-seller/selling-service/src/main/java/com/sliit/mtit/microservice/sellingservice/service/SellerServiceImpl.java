package com.sliit.mtit.microservice.sellingservice.service;

import com.sliit.mtit.microservice.sellingservice.dto.PaymentCreationRequest;
import com.sliit.mtit.microservice.sellingservice.dto.PaymentCreationResponse;
import com.sliit.mtit.microservice.sellingservice.dto.SellerRequest;
import com.sliit.mtit.microservice.sellingservice.dto.SellerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class SellerServiceImpl {

    @Autowired
    private RestTemplate restTemplate;
    public SellerResponse createSeller(SellerRequest sellerRequest){

        var paymentCreationRequest = new PaymentCreationRequest();
        paymentCreationRequest.setAge(sellerRequest.getAge());
        paymentCreationRequest.setFullName(sellerRequest.getFullName());
        ResponseEntity<PaymentCreationResponse> paymentCreationResponse =restTemplate.postForEntity("http://localhost:8080/payments",paymentCreationRequest, PaymentCreationResponse.class);

        var sellerResponse = new SellerResponse();
        sellerResponse.setSellerId(UUID.randomUUID().toString());
        sellerResponse.setPaymentId(paymentCreationResponse.getBody().getSellerId());
        sellerResponse.setSalaryReport("Successfully Generated the salary report");

        return sellerResponse;

    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
