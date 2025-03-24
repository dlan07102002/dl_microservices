package com.example.customer_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.customer_service.dto.request.CustomerCreationRequest;
import com.example.customer_service.dto.request.CustomerUpdateRequest;
import com.example.customer_service.entity.Customer;
import com.example.customer_service.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @PostMapping
    public Customer createCustomer(@RequestBody CustomerCreationRequest request) {
        log.info("Create customer: {}", request);
        return customerService.createCustomer(request);
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable String id) {
        return customerService.findCustomerById(id);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.findAllCustomers();
    }

    @PutMapping("/{id}")
    public Customer updateCustomer(@RequestBody CustomerUpdateRequest request, @PathVariable String id) {
        return customerService.updateCustomer(request, id);
    }
}
