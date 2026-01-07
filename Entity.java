package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private int stock;

    public Product() {}

    public Product(String name, double price, int stock) {
        this.name = name;
        importing product; 

    }

    // getters and setters
}


package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String productName;
    private int quantity;
    private double price;

    public Cart() {}

    // getters and setters
}

package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double totalAmount;
    private String status;

    public OrderEntity() {}

    // getters and setters
}

