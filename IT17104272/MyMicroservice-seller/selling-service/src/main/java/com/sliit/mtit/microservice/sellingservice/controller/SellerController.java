package com.sliit.mtit.microservice.sellingservice.controller;

import com.sliit.mtit.microservice.sellingservice.dto.SellerRequest;
import com.sliit.mtit.microservice.sellingservice.dto.SellerResponse;
import com.sliit.mtit.microservice.sellingservice.service.SellerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/sellers")
public class SellerController {

    @Autowired
    private SellerServiceImpl sellerService;

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody SellerResponse createSeller(@RequestBody SellerRequest request){
        System.out.println("Seller Details:"+request);
        return sellerService.createSeller(request);
    }
}
