package com.ecom.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.processing.Generated;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productId;
    private  String productName;
    private String image;
    private String description;
    private Integer quantity;
    private double price;
    private  double specialPrice;
    private double discount;

    @JoinColumn(name = "category_id")
    @ManyToOne
    private Category category;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User user;
}
