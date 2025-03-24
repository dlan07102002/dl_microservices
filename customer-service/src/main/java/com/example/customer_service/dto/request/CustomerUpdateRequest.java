package com.example.customer_service.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerUpdateRequest {
    private String fullName;
    private String password;
    private String email;
    private String phone;
    private String address;
    private float balance;
}
