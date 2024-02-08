package com.vallejos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorEjemplo {

    @GetMapping("/servicio1")
    public String servicio1() {
        // Lógica del servicio 1
        return "Servicio 1 completado";
    }

    @GetMapping("/servicio2")
    public String servicio2() {
        // Lógica del servicio 2
        return "Servicio 2 completado";
    }

    @GetMapping("/orquestar")
    public String orquestar() {
        // Lógica de orquestación
        String resultadoServicio1 = servicio1();
        String resultadoServicio2 = servicio2();
        return "Orquestación completada: " + resultadoServicio1 + ", " + resultadoServicio2;
    }
}

