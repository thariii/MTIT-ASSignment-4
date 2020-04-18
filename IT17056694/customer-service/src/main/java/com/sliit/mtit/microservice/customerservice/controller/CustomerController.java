package com.sliit.mtit.microservice.customerservice.controller;

import com.sliit.mtit.microservice.customerservice.dto.CustomerRequest;
import com.sliit.mtit.microservice.customerservice.dto.CustomerResponse;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody CustomerResponse getCusDetails(@RequestBody  CustomerRequest request) {

        System.out.println("Customer Details :" + request);

        var customerResponse = new CustomerResponse();
        customerResponse.setCustomerID(UUID.randomUUID().toString());
        customerResponse.setMessage("Successfully get details....");

        return customerResponse;
    }
}
