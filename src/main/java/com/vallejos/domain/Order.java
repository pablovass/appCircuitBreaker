package com.vallejos.domain;

import lombok.Data;

import java.util.List;

@Data
public class Order {
    private String orderId;
    private List<Product> products;
    private Customer customer;
    // Otros atributos y métodos

    // Getters y setters
}
