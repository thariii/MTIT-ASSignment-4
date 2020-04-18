package com.sliit.mtit.microservice.paymentservice.controller;

import com.sliit.mtit.microservice.paymentservice.dto.PaymentRequest;
import com.sliit.mtit.microservice.paymentservice.dto.PaymentResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody PaymentResponse createSeller(@RequestBody PaymentRequest paymentRequest){

        System.out.println("Seller Details:" + paymentRequest);
        var paymentResponse = new PaymentResponse();
        paymentResponse.setSellerId(UUID.randomUUID().toString());
        paymentResponse.setSalaryReport("Successfully created the salary report");

        return paymentResponse;

    }
}
