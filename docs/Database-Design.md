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

---

# 5. Table Structure

## 5.1 Customer

| Column | Data Type | Constraints |
|---------|-----------|-------------|
| customer_id | BIGINT | Primary Key, Auto Increment |
| full_name | VARCHAR(100) | Not Null |
| email | VARCHAR(100) | Unique, Not Null |
| mobile_number | VARCHAR(15) | Unique, Not Null |
| password | VARCHAR(255) | Not Null |
| created_at | TIMESTAMP | Default Current Timestamp |

---

## 5.2 Restaurant

| Column | Data Type | Constraints |
|---------|-----------|-------------|
| restaurant_id | BIGINT | Primary Key, Auto Increment |
| restaurant_name | VARCHAR(100) | Not Null |
| owner_name | VARCHAR(100) | Not Null |
| email | VARCHAR(100) | Unique, Not Null |
| mobile_number | VARCHAR(15) | Unique, Not Null |
| address | VARCHAR(255) | Not Null |
| password | VARCHAR(255) | Not Null |
| status | VARCHAR(20) | Default 'ACTIVE' |
| created_at | TIMESTAMP | Default Current Timestamp |

---

## 5.3 FoodItem

| Column | Data Type | Constraints |
|---------|-----------|-------------|
| food_id | BIGINT | Primary Key, Auto Increment |
| restaurant_id | BIGINT | Foreign Key |
| food_name | VARCHAR(100) | Not Null |
| category | VARCHAR(50) | Not Null |
| description | VARCHAR(255) | Nullable |
| price | DECIMAL(10,2) | Not Null |
| availability | BOOLEAN | Default TRUE |
| created_at | TIMESTAMP | Default Current Timestamp |

---

## 5.4 Cart

| Column | Data Type | Constraints |
|---------|-----------|-------------|
| cart_id | BIGINT | Primary Key, Auto Increment |
| customer_id | BIGINT | Foreign Key |
| total_amount | DECIMAL(10,2) | Default 0 |
| created_at | TIMESTAMP | Default Current Timestamp |

---

## 5.5 CartItem

| Column | Data Type | Constraints |
|---------|-----------|-------------|
| cart_item_id | BIGINT | Primary Key, Auto Increment |
| cart_id | BIGINT | Foreign Key |
| food_id | BIGINT | Foreign Key |
| quantity | INT | Not Null |
| subtotal | DECIMAL(10,2) | Not Null |

---

## 5.6 Order

| Column | Data Type | Constraints |
|---------|-----------|-------------|
| order_id | BIGINT | Primary Key, Auto Increment |
| customer_id | BIGINT | Foreign Key |
| restaurant_id | BIGINT | Foreign Key |
| total_amount | DECIMAL(10,2) | Not Null |
| order_status | VARCHAR(30) | Not Null |
| order_date | TIMESTAMP | Default Current Timestamp |

---

## 5.7 OrderItem

| Column | Data Type | Constraints |
|---------|-----------|-------------|
| order_item_id | BIGINT | Primary Key, Auto Increment |
| order_id | BIGINT | Foreign Key |
| food_id | BIGINT | Foreign Key |
| quantity | INT | Not Null |
| price | DECIMAL(10,2) | Not Null |
| subtotal | DECIMAL(10,2) | Not Null |

---

## 5.8 Payment

| Column | Data Type | Constraints |
|---------|-----------|-------------|
| payment_id | BIGINT | Primary Key, Auto Increment |
| order_id | BIGINT | Foreign Key |
| payment_method | VARCHAR(30) | Not Null |
| payment_status | VARCHAR(30) | Not Null |
| payment_date | TIMESTAMP | Default Current Timestamp |

---

## 5.9 Administrator

| Column | Data Type | Constraints |
|---------|-----------|-------------|
| admin_id | BIGINT | Primary Key, Auto Increment |
| full_name | VARCHAR(100) | Not Null |
| email | VARCHAR(100) | Unique, Not Null |
| password | VARCHAR(255) | Not Null |

---

# 6. Table Relationships

The following relationships exist between the database entities.

| Parent Table | Child Table | Relationship |
|--------------|-------------|--------------|
| Customer | Cart | One Customer → One Cart (1:1) |
| Customer | Order | One Customer → Many Orders (1:N) |
| Restaurant | FoodItem | One Restaurant → Many Food Items (1:N) |
| Restaurant | Order | One Restaurant → Many Orders (1:N) |
| Cart | CartItem | One Cart → Many Cart Items (1:N) |
| FoodItem | CartItem | One Food Item → Many Cart Items (1:N) |
| Order | OrderItem | One Order → Many Order Items (1:N) |
| FoodItem | OrderItem | One Food Item → Many Order Items (1:N) |
| Order | Payment | One Order → One Payment (1:1) |

---

# 7. Foreign Keys

| Table | Foreign Key | References |
|--------|-------------|------------|
| FoodItem | restaurant_id | Restaurant(restaurant_id) |
| Cart | customer_id | Customer(customer_id) |
| CartItem | cart_id | Cart(cart_id) |
| CartItem | food_id | FoodItem(food_id) |
| Order | customer_id | Customer(customer_id) |
| Order | restaurant_id | Restaurant(restaurant_id) |
| OrderItem | order_id | Order(order_id) |
| OrderItem | food_id | FoodItem(food_id) |
| Payment | order_id | Order(order_id) |

---

# 8. Normalization

The database follows the Third Normal Form (3NF).

### First Normal Form (1NF)

- Every table contains atomic values.
- Repeating groups are removed.

### Second Normal Form (2NF)

- Every non-key attribute depends on the entire primary key.

### Third Normal Form (3NF)

- No transitive dependencies exist.
- Non-key attributes depend only on the primary key.

This design reduces data redundancy and improves consistency.

---

# 9. Database Constraints

The following constraints are applied throughout the database.

## Primary Key

Every table contains a unique primary key.

## Foreign Key

Foreign keys maintain relationships between related tables.

## Unique

Email addresses and mobile numbers must be unique where applicable.

## Not Null

Mandatory fields cannot contain NULL values.

## Default Values

Default values are used for:

- created_at
- order_status
- payment_status
- availability
- total_amount

---

# 10. Conclusion

The FoodFlow database is designed using a normalized relational structure. The design minimizes data redundancy, maintains referential integrity, and supports all functional requirements of the application.

This database structure will be used to create the MySQL schema and later mapped to Java model classes, repository implementations, and service layer logic.