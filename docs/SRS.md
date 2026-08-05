# Software Requirements Specification (SRS)

## Project Information

| Field | Details |
|-------|---------|
| Project Name | FoodFlow Backend |
| Project Type | Console-Based Food Delivery Backend System |
| Version | 1.0 |
| Document Version | 1.0 |
| Status | Draft |
| Prepared By | Mohammed Rehan Anwarsab Jirayat |
| Technology Stack | Java 21, Core Java, JDBC, MySQL, Maven, JUnit 5 |
| Architecture | Layered Architecture |
| Last Updated | August 2026 |

---

# 1. Introduction

## 1.1 Purpose

FoodFlow Backend is a console-based Java application developed to understand how a food delivery platform works behind the scenes. The project focuses on the backend logic required to manage customers, restaurants, food items, orders, payments, and deliveries.

The main objective of this project is to apply Core Java concepts in a structured way by using object-oriented programming, layered architecture, JDBC, MySQL, exception handling, and the Collections Framework. The project is also intended to serve as a portfolio project for Java Backend Developer internships and entry-level software development roles.

---

## 1.2 Scope

The system provides the core backend features required for a food delivery application.

The application allows customers to create an account, browse restaurants, view menus, add food items to a cart, place orders, and check their order history.

Restaurant managers can manage food items, update menu information, and process customer orders.

Administrators can manage customers, restaurants, and monitor the overall system.

The application is developed as a console-based system using Java and MySQL. It is designed for learning backend development concepts and does not include a web interface or mobile application.

---

## 1.3 Intended Audience

This document is prepared for:

- Developers working on the project
- Software testers
- Students learning Java backend development
- Project reviewers
- Technical interviewers who want to understand the project design

---

## 1.4 Definitions and Acronyms

| Term | Description |
|------|-------------|
| SRS | Software Requirements Specification |
| OOP | Object-Oriented Programming |
| JDBC | Java Database Connectivity |
| CRUD | Create, Read, Update, Delete |
| DBMS | Database Management System |
| UI | User Interface |
| Admin | User responsible for managing the entire system |
| Customer | User who places food orders |
| Restaurant | Business that offers food through the system |

# 2. Overall Description

## 2.1 Product Perspective

FoodFlow Backend is an independent console-based application developed using Java. It represents the backend of a food delivery system where users can register, browse restaurants, place food orders, and manage their accounts.

The application follows a layered architecture to separate business logic, database operations, and user interaction. This approach keeps the project organized, improves maintainability, and makes future enhancements easier.

The system stores all application data in a MySQL database and communicates with it using JDBC.

---

## 2.2 Product Functions

The system provides the following features.

### Customer

- Register a new account
- Login securely
- View available restaurants
- Browse restaurant menus
- Search food items
- Add food items to the cart
- Update cart quantity
- Remove items from the cart
- Place an order
- Cancel an order before preparation
- View order history
- Update profile information

### Restaurant

- Register restaurant details
- Login
- Manage menu items
- Add new food items
- Update existing food items
- Remove unavailable items
- View incoming orders
- Accept or reject customer orders
- Update order status

### Administrator

- View all customers
- View all restaurants
- Manage customer accounts
- Manage restaurant accounts
- View system reports
- Monitor orders

---

## 2.3 User Classes

The application has three primary user roles.

### Customer

Customers can browse restaurants, place food orders, make payments, and track their previous orders.

### Restaurant Manager

Restaurant managers maintain their restaurant information, update menus, and process customer orders.

### Administrator

The administrator manages the overall system by monitoring customers, restaurants, and orders.

---

## 2.4 Operating Environment

The application is designed to run in the following environment.

| Component | Requirement |
|-----------|-------------|
| Operating System | Windows 10 or later |
| Programming Language | Java 21 |
| IDE | IntelliJ IDEA Community Edition |
| Database | MySQL 8.x |
| Build Tool | Maven |
| Version Control | Git |
| Repository Hosting | GitHub |

---

## 2.5 Design Constraints

The project follows the following constraints.

- The application is console-based.
- Java 21 is used for development.
- JDBC is used for database connectivity.
- MySQL is the only database.
- Maven is used for dependency management.
- Layered architecture is followed throughout the project.
- The project does not use Spring Boot, Hibernate, JPA, REST APIs, Docker, Redis, Kafka, or Microservices.

---

## 2.6 Assumptions and Dependencies

The following assumptions are made during development.

- Users provide valid input wherever required.
- MySQL Server is installed and running.
- Java 21 is installed on the development machine.
- Maven is available through IntelliJ IDEA.
- Internet access is required only for downloading Maven dependencies and pushing code to GitHub.
