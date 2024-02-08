package com.vallejos.controller;

import com.vallejos.domain.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping
    public ResponseEntity<String> createOrder(@RequestBody Order order) {
        // Lógica para crear un pedido

        // Llamar al servicio de inventario para actualizar el stock
        String inventoryUrl = "http://inventory-service/update";
        restTemplate.postForObject(inventoryUrl, order, String.class);

        return ResponseEntity.ok("Order created successfully.");
    }
}

