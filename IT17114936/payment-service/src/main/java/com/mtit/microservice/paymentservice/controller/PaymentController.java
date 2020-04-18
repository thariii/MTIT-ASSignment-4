package com.mtit.microservice.paymentservice.controller;

import com.mtit.microservice.paymentservice.dto.PaymentRequest;
import com.mtit.microservice.paymentservice.dto.PaymentResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    public double total;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody PaymentResponse createPayment(@RequestBody PaymentRequest request){

        System.out.println("Payment Details: " + request);

        //calculating total payment
        double unitPrice = request.getUnitPrice();
        int quantity = request.getQuantity();
        total = unitPrice * quantity;

        System.out.println("Total Payment: " + total);

        var paymentResponse = new PaymentResponse();
        paymentResponse.setPaymentID(UUID.randomUUID().toString());
        paymentResponse.setMessage("Payment created");


        return paymentResponse;

    }



}
