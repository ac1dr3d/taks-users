# Taks Users Microservice

This project is a demo microservice for managing user-related operations. It's built using Java and Spring Boot, and integrates with a Kafka message broker for handling asynchronous messaging between services.

## Features
- User management (CRUD operations)
- Kafka integration for message-based communication
- Microservice architecture

## Prerequisites
- Java 11+
- Apache Kafka
- Gradle build tool

## Running the Application

1. Clone the repository:
    ```bash
    git clone https://github.com/ac1dr3d/task-users.git
    cd task-users
    ```

2. Build the application:
    ```bash
    ./gradlew build
    ```

3. Start Kafka broker:
   Ensure that Kafka is running on your local machine or provide the correct Kafka broker URL in the configuration.

4. Run the application:
    ```bash
    ./gradlew bootRun
    ```

## API Endpoints
- `POST /users`: Create a new user
- `GET /users`: Get all users
- `GET /users/{id}`: Get a specific user by ID
- `PUT /users/{id}`: Update a user's information
- `DELETE /users/{id}`: Delete a user

## Kafka Integration
The service sends Kafka messages for certain user-related events. Make sure Kafka is set up and running.

## Configuration

You can modify the `application.properties` file for custom Kafka configurations, database connections, or other service-related settings.

```properties
spring.kafka.bootstrap-servers=localhost:29092
