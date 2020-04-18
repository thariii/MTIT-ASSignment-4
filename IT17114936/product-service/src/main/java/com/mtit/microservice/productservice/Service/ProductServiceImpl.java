package com.mtit.microservice.productservice.Service;

import com.mtit.microservice.productservice.dto.PaymentCreationRequest;
import com.mtit.microservice.productservice.dto.PaymentCreationResponse;
import com.mtit.microservice.productservice.dto.ProductRequest;
import com.mtit.microservice.productservice.dto.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@Service
public class ProductServiceImpl {

    @Autowired
    private RestTemplate restTemplate;

    public ProductResponse createProduct(ProductRequest productRequest){

        var paymentCreationRequest = new PaymentCreationRequest();
        paymentCreationRequest.setProductName(productRequest.getProductName());
        paymentCreationRequest.setQuantity(productRequest.getQuantity());
        paymentCreationRequest.setUnitPrice(productRequest.getUnitPrice());

        ResponseEntity<PaymentCreationResponse> paymentCreationResponse = restTemplate.postForEntity("http://localhost:8181/payment",paymentCreationRequest, PaymentCreationResponse.class);

        var productResponse = new ProductResponse();
        productResponse.setProductId(UUID.randomUUID().toString());
        productResponse.setPaymentID(paymentCreationResponse.getBody().getPaymentID());
        productResponse.setMessage("Product created");

        return productResponse;
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
