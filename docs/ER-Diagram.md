# Entity Relationship Diagram (ER Diagram)

## Document Information

| Field | Details |
|-------|---------|
| Project Name | FoodFlow Backend |
| Document Name | Entity Relationship Diagram |
| Version | 1.0 |
| Status | Draft |
| Prepared By | Mohammed Rehan Anwarsab Jirayat |
| Last Updated | August 2026 |

---

# 1. Purpose

This document describes the entities and their relationships in the FoodFlow Backend database. The ER Diagram provides a visual representation of how data is organized and how different entities interact with each other.

The ER Diagram is based on the database design and will be used as the reference for creating the MySQL schema and Java model classes.

---

# 2. Entities

The FoodFlow Backend system contains the following entities:

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

# 3. Entity Relationships

| Parent Entity | Child Entity | Cardinality |
|--------------|--------------|-------------|
| Customer | Cart | 1 : 1 |
| Customer | Order | 1 : N |
| Restaurant | FoodItem | 1 : N |
| Restaurant | Order | 1 : N |
| Cart | CartItem | 1 : N |
| FoodItem | CartItem | 1 : N |
| Order | OrderItem | 1 : N |
| FoodItem | OrderItem | 1 : N |
| Order | Payment | 1 : 1 |

---

# 4. Relationship Description

### Customer → Cart

Each customer owns one shopping cart.

### Customer → Order

A customer can place multiple orders over time.

### Restaurant → FoodItem

A restaurant can provide multiple food items.

### Restaurant → Order

A restaurant can receive multiple customer orders.

### Cart → CartItem

A shopping cart can contain multiple food items.

### FoodItem → CartItem

A food item can appear in multiple shopping carts.

### Order → OrderItem

An order can contain multiple ordered food items.

### FoodItem → OrderItem

A food item can appear in multiple customer orders.

### Order → Payment

Each order has one corresponding payment record.

---

# 5. ER Diagram

The visual ER Diagram will be created after the database schema is finalized to ensure consistency with the implemented database design.

---

# 6. Conclusion

The ER Diagram defines the relationships among all entities in the FoodFlow Backend system. It serves as a reference for database implementation and helps maintain consistency between the database structure and the application design.