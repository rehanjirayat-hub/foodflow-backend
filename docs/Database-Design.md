# Database Design

## Document Information

| Field | Details |
|-------|---------|
| Project Name | FoodFlow Backend |
| Document Name | Database Design |
| Version | 1.0 |
| Status | Draft |
| Prepared By | Mohammed Rehan Anwarsab Jirayat |
| Last Updated | August 2026 |

---

# 1. Purpose

This document defines the database structure of the FoodFlow Backend system. It identifies the database entities, their relationships, primary keys, foreign keys, and the overall design that will be implemented in MySQL.

The database is designed to maintain data consistency, minimize redundancy, and support the functional requirements of the application.

---

# 2. Database

Database Name

FoodFlowDB

Database Management System

MySQL 8.x

---

# 3. Database Entities

The FoodFlow Backend system contains the following entities.

| Entity | Description |
|---------|-------------|
| Customer | Stores customer information |
| Restaurant | Stores restaurant information |
| FoodItem | Stores restaurant menu items |
| Cart | Stores customer shopping carts |
| CartItem | Stores food items inside the cart |
| Order | Stores customer orders |
| OrderItem | Stores food items included in each order |
| Payment | Stores payment details |
| Administrator | Stores administrator information |

---

# 4. Primary Keys

| Entity | Primary Key |
|---------|-------------|
| Customer | customer_id |
| Restaurant | restaurant_id |
| FoodItem | food_id |
| Cart | cart_id |
| CartItem | cart_item_id |
| Order | order_id |
| OrderItem | order_item_id |
| Payment | payment_id |
| Administrator | admin_id |