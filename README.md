# Order-Management-System

## Overview  
The **Order Management System** is a microservices-based project built with Java, Maven, and Spring Boot. It manages product catalogs, inventory, orders, and notifications with a scalable and modular architecture.

## Microservices Architecture  

### 1. Product Service  
- Handles product-related operations like creation, updates, and retrieval.  
- **Database:** MongoDB for flexible document storage.  

### 2. Inventory Service  
- Tracks and manages product stock levels.  
- **Database:** MySQL with Flyway for schema migrations.  

### 3. Order Service  
- Manages order creation and processing workflows.  
- **Database:** MySQL with Flyway for schema migrations.  

### 4. Notification Service  
- Sends notifications for order updates.  
- Supports communication with other services.  

## Key Features  
- Built with **Spring Boot** for microservice architecture.  
- Uses **REST APIs** for communication between services.  
- **MongoDB** for handling product data.  
- **MySQL** with **Flyway migrations** for inventory and order management.  
- **Docker** for containerized deployment.

## How to Run  

1. Clone the repository:  
   ```bash
   git clone https://github.com/your-username/Order-Management-System.git
   cd Order-Management-System

