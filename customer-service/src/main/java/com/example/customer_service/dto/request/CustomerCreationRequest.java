package com.example.customer_service.dto.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CustomerCreationRequest {
    private String fullName;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private float balance;
}
