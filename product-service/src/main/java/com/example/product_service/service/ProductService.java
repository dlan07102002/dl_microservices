package com.example.product_service.service;

import java.util.List;

import com.example.product_service.dto.request.ProductCreationRequest;
import com.example.product_service.dto.request.ProductUpdateRequest;
import com.example.product_service.entity.Product;

public interface ProductService {
    Product createProduct(ProductCreationRequest request);

    Product getProductById(String id);

    List<Product> getAllProducts();

    Product updateProduct(String id, ProductUpdateRequest request);
}
