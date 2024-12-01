package com.ruchira.simpleWebApp.service;

import com.ruchira.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Cannon Camera", 70000),
            new Product(103, "Shura Mic", 10000));

    public List<Product> getProduct() {
        return products;
    }
}
