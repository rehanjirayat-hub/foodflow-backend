# Use Cases

## Document Information

| Field | Details |
|-------|---------|
| Project Name | FoodFlow Backend |
| Document Name | Use Cases |
| Version | 1.0 |
| Status | Draft |
| Prepared By | Mohammed Rehan Anwarsab Jirayat |
| Last Updated | August 2026 |

---

# 1. Introduction

## 1.1 Purpose

This document describes how different users interact with the FoodFlow Backend system. Each use case explains the steps performed by a user and the system to complete a specific task.

---

# 2. Actors

### Customer

- Registers an account
- Logs in
- Browses restaurants
- Views food items
- Manages the shopping cart
- Places orders
- Makes payments
- Views order history

### Restaurant Manager

- Registers a restaurant
- Logs in
- Manages menu items
- Processes customer orders

### Administrator

- Manages customers
- Manages restaurants
- Monitors orders
- Monitors payments

---

# 3. Use Cases

## UC-01 Customer Registration

**Primary Actor**

Customer

**Goal**

Create a new customer account.

**Preconditions**

- Customer is not already registered.

**Main Flow**

1. Customer selects the registration option.
2. System requests customer details.
3. Customer enters the required information.
4. System validates the entered data.
5. System checks for duplicate email and mobile number.
6. System stores the customer information.
7. System displays a successful registration message.

**Alternative Flow**

- Email address already exists.
- Mobile number already exists.
- Invalid input.

**Postconditions**

Customer account is created successfully.

---

## UC-02 Customer Login

**Primary Actor**

Customer

**Goal**

Access customer features.

**Preconditions**

- Customer account exists.

**Main Flow**

1. Customer selects the login option.
2. System requests login credentials.
3. Customer enters email and password.
4. System validates the credentials.
5. System authenticates the customer.
6. System displays the customer menu.

**Alternative Flow**

- Invalid email.
- Incorrect password.
- Account inactive.

**Postconditions**

Customer session starts successfully.

---

## UC-03 Manage Food Menu

**Primary Actor**

Restaurant Manager

**Goal**

Maintain the restaurant menu.

**Preconditions**

- Restaurant manager is logged in.

**Main Flow**

1. Restaurant manager opens the food management menu.
2. System displays available options.
3. Restaurant manager adds, updates, or removes food items.
4. System validates the entered information.
5. System saves the changes.
6. System confirms successful completion.

**Alternative Flow**

- Invalid food details.
- Duplicate food item.

**Postconditions**

Restaurant menu is updated successfully.

---

## UC-04 Place Order

**Primary Actor**

Customer

**Goal**

Place a food order.

**Preconditions**

- Customer is logged in.
- Shopping cart is not empty.

**Main Flow**

1. Customer reviews the shopping cart.
2. Customer selects the delivery address.
3. Customer selects a payment method.
4. System validates the order.
5. System calculates the total amount.
6. System creates the order.
7. System generates an order ID.
8. System confirms successful order placement.

**Alternative Flow**

- Shopping cart is empty.
- Invalid payment method.
- Restaurant unavailable.

**Postconditions**

A new order is created successfully.

---

## UC-05 Process Order

**Primary Actor**

Restaurant Manager

**Goal**

Manage customer orders.

**Preconditions**

- Restaurant manager is logged in.
- A new customer order exists.

**Main Flow**

1. Restaurant manager views pending orders.
2. Restaurant manager accepts or rejects an order.
3. Restaurant manager updates the order status.
4. System saves the updated status.
5. Customer can view the latest order status.

**Alternative Flow**

- Order already cancelled.
- Invalid order status.

**Postconditions**

Order status is updated successfully.

---

## UC-06 Manage Customers and Restaurants

**Primary Actor**

Administrator

**Goal**

Manage the overall system.

**Preconditions**

- Administrator is logged in.

**Main Flow**

1. Administrator opens the administration menu.
2. System displays customers and restaurants.
3. Administrator activates or deactivates accounts.
4. System saves the changes.
5. System confirms the operation.

**Alternative Flow**

- Invalid administrator credentials.
- Account not found.

**Postconditions**

System information is updated successfully.