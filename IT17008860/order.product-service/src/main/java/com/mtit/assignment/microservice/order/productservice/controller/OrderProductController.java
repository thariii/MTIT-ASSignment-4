package com.mtit.assignment.microservice.order.productservice.controller;

import com.mtit.assignment.microservice.order.productservice.dto.OrderProductRequest;
import com.mtit.assignment.microservice.order.productservice.dto.OrderProductResponse;
import com.mtit.assignment.microservice.order.productservice.service.OrderProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/order-products")
public class OrderProductController {

    @Autowired
    private OrderProductServiceImpl orderProductService;

    @PostMapping(consumes = "application/json",produces = "application/json")
    public @ResponseBody OrderProductResponse createOrder(@RequestBody OrderProductRequest request){

        System.out.println("Product Details : "+ request);


        return orderProductService.createProductOrder(request);

    }
}
