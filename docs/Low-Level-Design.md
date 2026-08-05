# Low-Level Design (LLD)

## Document Information

| Field | Details |
|-------|---------|
| Project Name | FoodFlow Backend |
| Document Name | Low-Level Design |
| Version | 1.0 |
| Status | Final |
| Prepared By | Mohammed Rehan Anwarsab Jirayat |
| Last Updated | August 2026 |

---

# 1. Purpose

This document defines the internal structure of the FoodFlow Backend application. It describes the package organization, Java classes, interfaces, enumerations, custom exceptions, and the relationships between different layers of the application.

The Low-Level Design serves as the implementation blueprint for the project.

---

# 2. Layered Architecture

The project follows a layered architecture.

```

Main
│
▼

Menu Layer
│
▼

Service Layer
│
▼

Repository Layer
│
▼

Database (MySQL)

```

Each layer has a specific responsibility, making the application easier to maintain and extend.

---

# 3. Package Structure

```

com.foodflow
│
├── model
├── repository
├── repository.impl
├── service
├── service.impl
├── menu
├── exception
├── util
└── main

```

---

# 4. Model Classes

The application contains the following model classes.

- Customer
- Restaurant
- FoodItem
- Cart
- CartItem
- Order
- OrderItem
- Payment
- Administrator

---

# 5. Repository Interfaces

The repository layer contains the following interfaces.

- CustomerRepository
- RestaurantRepository
- FoodRepository
- CartRepository
- OrderRepository
- PaymentRepository
- AdminRepository

These interfaces define database operations without exposing implementation details.

---

# 6. Repository Implementations

Each repository interface has its own implementation.

- CustomerRepositoryImpl
- RestaurantRepositoryImpl
- FoodRepositoryImpl
- CartRepositoryImpl
- OrderRepositoryImpl
- PaymentRepositoryImpl
- AdminRepositoryImpl

These classes interact directly with the MySQL database using JDBC.

---

# 7. Service Interfaces

The service layer contains business logic through the following interfaces.

- CustomerService
- RestaurantService
- FoodService
- CartService
- OrderService
- PaymentService
- AdminService

---

# 8. Service Implementations

Each service interface has a corresponding implementation.

- CustomerServiceImpl
- RestaurantServiceImpl
- FoodServiceImpl
- CartServiceImpl
- OrderServiceImpl
- PaymentServiceImpl
- AdminServiceImpl

These classes implement business rules and coordinate repository operations.

---

# 9. Menu Classes

The console interface is divided into multiple menu classes.

- MainMenu
- CustomerMenu
- RestaurantMenu
- AdminMenu

Each menu is responsible for interacting with the user.

---

# 10. Utility Classes

The util package contains reusable helper classes.

- DatabaseConnection
- InputValidator
- PasswordUtil
- MenuUtil

---

# 11. Custom Exceptions

The application uses custom exceptions for better error handling.

- CustomerNotFoundException
- RestaurantNotFoundException
- FoodNotFoundException
- OrderNotFoundException
- PaymentException
- InvalidInputException
- AuthenticationException

---

# 12. Enumerations

The application defines the following enums.

### OrderStatus

- PENDING
- ACCEPTED
- PREPARING
- OUT_FOR_DELIVERY
- DELIVERED
- CANCELLED

### PaymentStatus

- PENDING
- SUCCESS
- FAILED

### PaymentMethod

- CASH_ON_DELIVERY
- UPI
- CARD

---

# 13. Design Principles

The project follows these software engineering principles.

- Layered Architecture
- Separation of Concerns
- Interface-Based Design
- Single Responsibility Principle
- Code Reusability
- Exception Handling
- Input Validation

---

# 14. Conclusion

The Low-Level Design defines the internal architecture of the FoodFlow Backend project. It provides a clear structure for implementation and ensures consistency between the project documentation and the Java source code.