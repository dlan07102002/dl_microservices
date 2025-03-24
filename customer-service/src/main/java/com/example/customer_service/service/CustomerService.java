package com.example.customer_service.service;

import java.util.List;

import com.example.customer_service.dto.request.CustomerCreationRequest;
import com.example.customer_service.dto.request.CustomerUpdateRequest;
import com.example.customer_service.entity.Customer;

public interface CustomerService {
    Customer createCustomer(CustomerCreationRequest request);

    Customer findCustomerById(String id);

    List<Customer> findAllCustomers();

    Customer updateCustomer(CustomerUpdateRequest request, String id);
}
