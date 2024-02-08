Por supuesto, aquí tienes el README en inglés:

---

# Circuit Breaker Example with Spring Boot and Resilience4j

This example project demonstrates how to implement a Circuit Breaker in a Spring Boot application using the Resilience4j library.

## Description

A Circuit Breaker is a design pattern used to enhance the resilience of an application against errors in remote services. When an error occurs in a remote service, the Circuit Breaker "opens" and prevents the application from making additional calls to the affected service for a specified period of time. This helps prevent system overload and improves application stability.

In this example, we have created a Spring Boot application with a service (`MyService`) that simulates making a call to a remote service. We use Resilience4j to configure and manage the Circuit Breaker.

## Configuration

The project is configured using Gradle as the dependency manager. Make sure you have Gradle installed on your system before running the project.

To configure the Circuit Breaker, we have used the following dependency in the `build.gradle` file:

```build.gradle
implementation 'org.springframework.cloud:spring-cloud-starter-circuitbreaker-resilience4j'
```

We have also created a configuration class (`CircuitBreakerConfiguration`) where we configure the Circuit Breaker parameters, such as the failure rate threshold and the wait duration in the open state.

## Usage

The `MyService` service contains a method (`myMethod`) that is annotated with `@CircuitBreaker`. This means that the Resilience4j Circuit Breaker will be applied to this method. Inside this method, you can add your application logic that makes calls to remote services.

```java
@Service
public class MyService {

    private final CircuitBreaker circuitBreaker;

    public MyService(CircuitBreaker circuitBreaker) {
        this.circuitBreaker = circuitBreaker;
    }

    @CircuitBreaker(name = "backendA")
    public String myMethod() {
        // Your method logic here
        return "Result";
    }
}
```

To customize the Circuit Breaker configuration, you can adjust properties in the `application.properties` file. For example:

```properties
resilience4j.circuitbreaker.configs.backendA.registerHealthIndicator=true
```

## Execution

You can run the application using the following Maven command:

```
mvn spring-boot:run
```

This will start the Spring Boot application on your local machine. Once the application is up and running, you can access it from your web browser or using tools like Postman.

## Contributions

Contributions are welcome. If you wish to improve this example or add new features, feel free to submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).

---
