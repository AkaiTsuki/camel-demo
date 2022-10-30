package com.example.cameldemo.service;

import com.example.cameldemo.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<ProductDTO> queryProductsByCategory(String category) {
        ProductDTO p1 = new ProductDTO();
        p1.setId(1L);
        p1.setName("p1");
        ProductDTO p2 = new ProductDTO();
        p2.setId(2L);
        p2.setName("p2");

        List<ProductDTO> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        return products;
    }
}
