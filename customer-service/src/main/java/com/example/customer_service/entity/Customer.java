package com.example.customer_service.entity;

import java.sql.Date;

import jakarta.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String fullName;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String address;
    private float balance;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date createdAt;

    @Temporal(TemporalType.DATE)
    @CreationTimestamp
    private Date updatedAt;
}
