package com.vallejos.controller;

import com.vallejos.domain.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InventoryController {

    @PostMapping("/update")
    public ResponseEntity<String> updateInventory(@RequestBody Order order) {
        // Lógica para actualizar el inventario basado en el pedido

        return ResponseEntity.ok("Inventory updated successfully.");
    }
}

