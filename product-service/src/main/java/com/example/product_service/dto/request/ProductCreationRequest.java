package com.example.product_service.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductCreationRequest {
    private String name;
    private String description;
    private float price;
    private int quantity;
}
