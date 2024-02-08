package com.vallejos.config;

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class CircuitBreakerConfiguration {

    @Bean
    public CircuitBreakerConfig circuitBreakerConfig() {
        return CircuitBreakerConfig.custom()
                .failureRateThreshold(50) // Umbral de tasa de fallas en porcentaje
                .waitDurationInOpenState(Duration.ofMillis(10000)) // Duración de espera en estado abierto
                .slidingWindowType(CircuitBreakerConfig.SlidingWindowType.COUNT_BASED) // Tipo de ventana deslizante
                .slidingWindowSize(5) // Tamaño de la ventana deslizante
                .build();
    }


}
