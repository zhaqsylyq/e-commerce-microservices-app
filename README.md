# E-Commerce Backend Project

This repository contains an implementation of an e-commerce backend system using the Spring Framework and a microservice architecture. The project leverages various technologies to ensure scalability, security, and maintainability.

## Technologies Used

- **Configuration Server**: Centralized management of configuration properties.
- **Discovery Server (Eureka)**: Service registry for locating microservices.
- **API Gateway**: Routing and filtering of requests to appropriate microservices.
- **Asynchronous Communication**: Implemented using Kafka.
- **Synchronous Communication**: Implemented using OpenFeign and RestTemplate.
- **Distributed Tracing**: Implemented using Zipkin and Spring Actuator for monitoring and troubleshooting.
- **Security**: Implemented using Keycloak for securing the application.
- **Infrastructure Setup**: Docker and Docker Compose for containerization and orchestration.

## Microservices

The following microservices are implemented in this project:

1. **Config Server**: Manages the configuration of all the microservices.
2. **Customer Service**: Manages customer-related operations.
3. **Discovery Server**: Service registry for microservices.
4. **Gateway**: API Gateway for routing requests.
5. **Notification Service**: Handles notifications and messaging.
6. **Order Service**: Manages orders and their lifecycles.
7. **Payment Service**: Manages payment transactions.
8. **Product Service**: Manages product-related operations.


### Domain Overview
![ecommerce-microservices(DDD)](https://github.com/zhaqsylyq/e-commerce-microservices-app/assets/71256573/94ae5937-499d-48f8-ac08-4fb56a8b1d1c)


### Global Architecture

A comprehensive view of the entire backend architecture.
![ecommerce-microservices-architecture](https://github.com/zhaqsylyq/e-commerce-microservices-app/assets/71256573/943b4314-55d1-4a24-be96-a533fc771c58)
