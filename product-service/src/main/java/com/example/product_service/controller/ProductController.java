package com.example.product_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.product_service.dto.request.ProductCreationRequest;
import com.example.product_service.dto.request.ProductUpdateRequest;
import com.example.product_service.entity.Product;
import com.example.product_service.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody ProductCreationRequest request) {
        return productService.createProduct(request);
    }

    @GetMapping("{id}")
    public Product getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PutMapping("{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody ProductUpdateRequest request) {
        return productService.updateProduct(id, request);
    }
}
