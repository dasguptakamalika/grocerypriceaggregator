package com.example.grocery.service;

import com.example.grocery.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<>();

    public ProductService() {
        // Populate some fake data
        products.add(new Product("Walmart", "Milk", 4.99, false));
        products.add(new Product("Target", "Milk", 5.49, false));
        products.add(new Product("BJs", "Milk", 3.99, true));
        products.add(new Product("Walmart", "Eggs", 2.99, false));
        products.add(new Product("BJs", "Eggs", 2.49, true));
    }

    public List<Product> search(String name) {
        List<Product> result = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                result.add(p);
            }
        }
        return result;
    }

    public Optional<Product> bestDeal(String name) {
        return products.stream()
                .filter(p -> p.getName().equalsIgnoreCase(name))
                .min((p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice()));
    }
}