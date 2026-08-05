# Business Rules

## Project Information

| Field | Details |
|-------|---------|
| Project Name | FoodFlow Backend |
| Document | Business Rules |
| Version | 1.0 |
| Status | Draft |
| Prepared By | Mohammed Rehan Anwarsab Jirayat |
| Last Updated | August 2026 |

---

# 1. Introduction

## 1.1 Purpose

This document defines the business rules that govern the FoodFlow Backend system. These rules ensure that the application behaves consistently and maintains data integrity. Every rule listed here must be enforced during application development.

---

# 2. Customer Rules

### BR-01

A customer must register before accessing the system.

### BR-02

Each customer must use a unique email address.

### BR-03

Each customer must use a unique mobile number.

### BR-04

A customer must log in before placing an order.

### BR-05

A customer cannot place an order with an empty shopping cart.

### BR-06

A customer can only view their own order history.

### BR-07

A customer cannot modify an order after it has been accepted by the restaurant.

---

# 3. Restaurant Rules

### BR-08

A restaurant must register before offering food items.

### BR-09

Each restaurant must have a unique email address.

### BR-10

Each restaurant must have a unique mobile number.

### BR-11

A restaurant manager must log in before managing food items.

### BR-12

Food items must belong to only one restaurant.

### BR-13

A restaurant cannot process cancelled orders.

### BR-14

A restaurant can update only its own menu.

---

# 4. Food Rules

### BR-15

Every food item must have a name.

### BR-16

Food price must be greater than zero.

### BR-17

Food quantity must never be negative.

### BR-18

Unavailable food items cannot be added to a customer's cart.

---

# 5. Cart Rules

### BR-19

A customer can add only available food items to the cart.

### BR-20

The quantity of each cart item must be greater than zero.

### BR-21

A customer can remove any item from the cart before placing an order.

### BR-22

The cart total must always be recalculated after every modification.

---

# 6. Order Rules

### BR-23

An order must contain at least one food item.

### BR-24

Every order belongs to one customer.

### BR-25

Every order belongs to one restaurant.

### BR-26

Each order must have a unique order ID.

### BR-27

The order status must follow this sequence:

Pending → Accepted → Preparing → Out for Delivery → Delivered

### BR-28

Cancelled orders cannot be delivered.

---

# 7. Payment Rules

### BR-29

Payment can be made only after an order is created.

### BR-30

Only supported payment methods are accepted.

### BR-31

Each payment record belongs to exactly one order.

### BR-32

Payment status must be updated after successful payment.

---

# 8. Administrator Rules

### BR-33

Only administrators can activate or deactivate customer accounts.

### BR-34

Only administrators can activate or deactivate restaurant accounts.

### BR-35

Administrators can view all customers, restaurants, orders, and payments.

---

# 9. General Rules

### BR-36

Mandatory fields cannot be left empty.

### BR-37

All user input must be validated before saving data.

### BR-38

Every database operation must be handled using JDBC.

### BR-39

Application exceptions must be handled using custom exception classes.

### BR-40

Only valid data should be stored in the database.