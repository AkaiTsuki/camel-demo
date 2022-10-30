package com.example.cameldemo.controller;

import com.example.cameldemo.ProductDTO;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProducerTemplate producerTemplate;

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/category/{category}")
    public List<ProductDTO> queryByCategory(@PathVariable("category") String category) {
        producerTemplate.start();
        List<ProductDTO> products = producerTemplate.requestBody("direct:fetchProducts", category, List.class);
        producerTemplate.stop();
        return products;
    }
}
