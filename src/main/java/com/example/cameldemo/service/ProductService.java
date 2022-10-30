package com.example.cameldemo.service;

import com.example.cameldemo.ProductDTO;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ProductService {
    List<ProductDTO> queryProductsByCategory(String category);
}
