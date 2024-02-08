package com.vallejos.service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private static final String BACKEND_A = "backendA";

    // ... other member variables or methods

    @CircuitBreaker(name = BACKEND_A, // Customize configuration if needed
            fallbackMethod = "fallbackMethod")
    public String myMethod() {
        // Call to external service or other logic that might fail
        return "Result";
    }

    public String fallbackMethod() {
        // Fallback logic when circuit breaker is open
        return "Fallback response";
    }
}
