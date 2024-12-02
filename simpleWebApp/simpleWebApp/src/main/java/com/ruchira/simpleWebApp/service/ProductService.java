package com.ruchira.simpleWebApp.service;

import com.ruchira.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone", 50000),
            new Product(102, "Cannon Camera", 70000),
            new Product(103, "Shura Mic", 10000)));

    public List<Product> getProduct() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId).findFirst().get();
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }
}
