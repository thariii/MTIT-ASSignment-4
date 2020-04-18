package com.mtit.microservice.productservice.controller;

import com.mtit.microservice.productservice.Service.ProductServiceImpl;
import com.mtit.microservice.productservice.dto.ProductRequest;
import com.mtit.microservice.productservice.dto.ProductResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductController
{
    String product;
    String p1 = "p1";
    String p2 = "p2";

    @Autowired
    private ProductServiceImpl productService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public @ResponseBody ProductResponse createProduct(@RequestBody ProductRequest productRequest){

        product = productRequest.getProductName();
        System.out.println("Product details: " + productRequest);

        return productService.createProduct(productRequest);

    }


}
