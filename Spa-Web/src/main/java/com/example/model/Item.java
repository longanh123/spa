package com.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String description;
    private Long price;
    @ManyToOne
    private Category category;
    @Column(length = 1000)
    @ElementCollection
    private List<String> images;
    private boolean available;
    @ManyToOne
    private Product product;
    @ManyToMany
    private List<IngredientItem> ingredients=new ArrayList<>();

    private Date creationdate;



}
