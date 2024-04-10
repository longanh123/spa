package com.example.model;

import com.example.dto.ProductDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private String fullname;
private String email;
private String password;
private USER_ROLE role=USER_ROLE.ROLE_CUSTOMER;
@JsonIgnore
@OneToMany(cascade=CascadeType.ALL, mappedBy = "customer")
private List<Order> orders = new ArrayList<>();
@ElementCollection
private List<ProductDto> product=new ArrayList<>();
@OneToMany(cascade = CascadeType.ALL, orphanRemoval =  true)
private List<Address>address=new ArrayList<>();
}
