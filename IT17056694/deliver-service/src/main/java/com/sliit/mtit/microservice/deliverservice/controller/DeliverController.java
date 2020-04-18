package com.sliit.mtit.microservice.deliverservice.controller;

import com.sliit.mtit.microservice.deliverservice.dto.DetailsRequest;
import com.sliit.mtit.microservice.deliverservice.dto.DetailsResponse;
import com.sliit.mtit.microservice.deliverservice.service.deliverServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Delivers")
public class DeliverController {

    @Autowired
    private deliverServiceImpl deliverService;

    @PostMapping(consumes = "application/json",produces = "application/json")

    public @ResponseBody DetailsResponse getDeliverDetails(@RequestBody DetailsRequest request){

        System.out.println("Customer Details :"+request);


        return deliverService.getCustomerDetails(request);

    }
}
