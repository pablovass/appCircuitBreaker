package com.vallejos.domain;

import lombok.Data;

@Data
public class Product {
    private String productId;
    private String name;
    private String description;
    private double price;
    private int stockQuantity;
    // Otros atributos y métodos

    // Getters y setters
}

