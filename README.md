# Online Shop

## Description
This project is an online shop platform that aims to implement a microservices architecture. The system will include services for order processing, delivery, and payment, communicating via Apache Kafka. Redis will be used for caching to improve performance and reduce database load.

### Key Features (Planned):
- **Order Management**: Handles the creation, processing, and tracking of customer orders.
- **Delivery Service**: Manages delivery information and tracks the status of shipments.
- **Payment Service**: (Planned) Handles customer payments and communicates with external payment gateways.
- **Kafka Integration**: Services will communicate through Kafka for event-driven architecture.
- **Redis Caching**: Used to cache frequently accessed data to improve response times and reduce database load.

## Technologies
- **Java 17**
- **Spring Boot**
- **Hibernate/JPA**
- **PostgreSQL**
- **Spring Security** (for authentication and authorization)
- **Swagger** (for API documentation)
- **Docker** (for containerization)
- **Kafka** (for message-driven architecture)
- **Redis** (for caching)
- **Maven**
- **REST API**
- **Git**

## Project Structure
The project is organized into several packages for better modularity and separation of concerns:
- `configuration`: Contains configurations for Kafka, Redis, and Spring Boot.
- `controller`: REST controllers for handling HTTP requests.
- `dto`: Data Transfer Objects for exchanging data between client and server.
- `exception`: Custom exception handling.
- `repository`: Interfaces for interacting with the database.
- `security`: Handles user authentication and authorization using Spring Security.
- `service`: Core business logic.
- `swagger`: Configuration for API documentation.
- `validator`: Custom input validation logic.

## How to Run the Project

1. **Clone the repository:**
   ```bash
   git clone <https://github.com/GromGT12/SweetBitesShop-.git>
