package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private User customer;
    @JsonIgnore
    @ManyToOne
    private Product product;
    private Long totalAmount;
    private Date createAt;
    private String orderStatus;
    @ManyToOne
    private Address deliveryAddress;
    @OneToMany
    private List<OrderItem> items;

    //private Payment payment;
    private int totalItems;

    private int totalPrice;
}
