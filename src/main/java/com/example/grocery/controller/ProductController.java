package com.example.grocery.controller;

import com.example.grocery.model.Product;
import com.example.grocery.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // GET /products/search?name=milk
    @GetMapping("/search")
    public List<Product> searchProducts(@RequestParam String name) {
        return productService.search(name);
    }

    // GET /products/best-deal?name=milk
    @GetMapping("/best-deal")
    public Product bestDeal(@RequestParam String name) {
        Optional<Product> product = productService.bestDeal(name);
        return product.orElse(null);
    }
}