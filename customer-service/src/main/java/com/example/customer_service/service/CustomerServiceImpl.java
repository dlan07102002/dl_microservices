package com.example.customer_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.customer_service.dto.request.CustomerCreationRequest;
import com.example.customer_service.dto.request.CustomerUpdateRequest;
import com.example.customer_service.entity.Customer;
import com.example.customer_service.repository.CustomerRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public Customer createCustomer(CustomerCreationRequest request) {
        Customer customer = new Customer();
        customer.setFullName(request.getFullName());
        customer.setUsername(request.getUsername());
        customer.setPassword(request.getPassword());
        customer.setEmail(request.getEmail());
        customer.setPhone(request.getPhone());
        customer.setAddress(request.getAddress());
        customer.setBalance(request.getBalance());

        return customerRepository.save(customer);
    }

    @Override
    public Customer findCustomerById(String id) {
        return customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));
    }

    @Override
    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer updateCustomer(CustomerUpdateRequest request, String id) {
        Customer customer =
                customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Customer not found"));

        customer.setFullName(request.getFullName());
        customer.setPassword(request.getPassword());
        customer.setEmail(request.getEmail());
        customer.setPhone(request.getPhone());
        customer.setAddress(request.getAddress());
        customer.setBalance(request.getBalance());
        return customerRepository.save(customer);
    }
}
