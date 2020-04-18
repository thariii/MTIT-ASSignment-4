package com.sliit.mtit.microservice.deliverservice.service;

import com.sliit.mtit.microservice.deliverservice.dto.CustomerCreationRequest;
import com.sliit.mtit.microservice.deliverservice.dto.CustomerCreationResponce;
import com.sliit.mtit.microservice.deliverservice.dto.DetailsRequest;
import com.sliit.mtit.microservice.deliverservice.dto.DetailsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class deliverServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public DetailsResponse getCustomerDetails(DetailsRequest detailsRequest){
        var  customerCreationRequest = new CustomerCreationRequest();
        customerCreationRequest.setFullName(detailsRequest.getFullName());
        customerCreationRequest.setAddress(detailsRequest.getAddress());
        customerCreationRequest.setPhoneNumber(detailsRequest.getMobileNumber1());
        ResponseEntity<CustomerCreationResponce> customerCreationResponce=restTemplate.postForEntity("http://localhost:8080/Customer",customerCreationRequest, CustomerCreationResponce.class);


        var detailsResponse = new DetailsResponse();
        detailsResponse.setOderId(UUID.randomUUID().toString());
        detailsResponse.setCustomerID(customerCreationResponce.getBody().getCustomerID());
        detailsResponse.setMessage("Successfully get details for diliver services....");

        return detailsResponse;


    }
    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
