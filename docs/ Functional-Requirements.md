# Functional Requirements

## Project Information

| Field        | Details                 |
|--------------|-------------------------|
| Project Name | FoodFlow Backend        |
| Document     | Functional Requirements |
| Version      | 1.0                     |
| Status       | Draft                   |

---

# 1. Introduction

## 1.1 Purpose

This document defines the functional requirements of the FoodFlow Backend system. It describes the features the
application must provide and the expected behavior of each feature. These requirements will be used during database
design, application development, testing, and validation.

---

## 1.2 User Roles

The system supports three user roles.

### Customer

A customer can register, log in, browse restaurants, view food items, manage the cart, place orders, and view order
history.

### Restaurant Manager

A restaurant manager can manage restaurant information, maintain the menu, and process customer orders.

### Administrator

The administrator manages customers, restaurants, and monitors the overall system.

---

# 2. Functional Requirements

## FR-01 Customer Registration

### Description

The system shall allow a new customer to create an account by providing the required personal information.

### Primary Actor

Customer

### Priority

High

### Business Value

Allows customers to create an account and use the food ordering services provided by the system.

### Preconditions

- The customer must not already have a registered account.
- All mandatory information must be provided.

### Input

- Full Name
- Email Address
- Mobile Number
- Password

### Processing

- Validate all input fields.
- Verify that the email address is unique.
- Verify that the mobile number is unique.
- Save the customer information in the database.

### Output

A new customer account is created successfully.

### Postconditions

The customer can log in using the registered credentials.

### Exceptions

- Email address already exists.
- Mobile number already exists.
- Invalid input.
- Database operation failed.

---

## FR-02 Customer Login

### Description

The system shall allow registered customers to log in using valid credentials.

### Primary Actor

Customer

### Priority

High

### Business Value

Allows registered customers to securely access the system and use customer features.

### Preconditions

- The customer account must exist.
- The customer account must be active.

### Input

- Email Address
- Password

### Processing

- Validate the email address and password.
- Search for the customer account.
- Verify the entered password.
- Check whether the customer account is active.
- Display the customer menu.

### Output

The customer is successfully authenticated.

### Postconditions

The customer session starts successfully.

### Exceptions

- Invalid email address.
- Incorrect password.
- Customer account not found.
- Customer account is inactive.

---

## FR-03 Restaurant Registration

### Description

The system shall allow a restaurant manager to register a restaurant by providing the required information.

### Primary Actor

Restaurant Manager

### Priority

High

### Business Value

Allows restaurants to join the FoodFlow platform and offer food services to customers.

### Preconditions

- The restaurant must not already be registered.
- All mandatory information must be provided.

### Input

- Restaurant Name
- Owner Name
- Email Address
- Mobile Number
- Restaurant Address
- Password

### Processing

- Validate all input fields.
- Verify that the email address is unique.
- Verify that the mobile number is unique.
- Save the restaurant information in the database.

### Output

The restaurant account is created successfully.

### Postconditions

The restaurant manager can log in and manage restaurant operations.

### Exceptions

- A restaurant with the same name and owner already exists.
- Email address already exists.
- Mobile number already exists.
- Invalid input.
- Database operation failed.

---

## FR-04 Restaurant Login

### Description

The system shall allow registered restaurant managers to log in using valid credentials.

### Primary Actor

Restaurant Manager

### Priority

High

### Business Value

Allows restaurant managers to manage menus and process customer orders.

### Preconditions

- The restaurant account must exist.
- The restaurant account must be active.

### Input

- Email Address
- Password

### Processing

- Validate the email address and password.
- Search for the restaurant account.
- Verify the entered password.
- Check whether the restaurant account is active.
- Display the restaurant menu.

### Output

The restaurant manager is successfully authenticated.

### Postconditions

The restaurant manager session starts successfully.

### Exceptions

- Invalid email address.
- Incorrect password.
- Restaurant account not found.
- Restaurant account is inactive.

---

## FR-05 Food Management

### Description

The system shall allow restaurant managers to manage food items available in their restaurant menu.

### Primary Actor

Restaurant Manager

### Priority

High

### Business Value

Ensures customers always see an accurate and up-to-date restaurant menu.

### Preconditions

- The restaurant manager must be logged in.
- The restaurant account must be active.

### Input

- Food Name
- Category
- Description
- Price
- Availability Status

### Processing

- Validate all input fields.
- Add new food items.
- Update existing food items.
- Remove unavailable food items.
- Save all changes to the database.

### Output

The restaurant menu is updated successfully.

### Postconditions

The updated menu becomes available for customers to browse.

### Exceptions

- Invalid food information.
- Duplicate food item.
- Food item not found.
- Database operation failed.

---

## FR-06 Cart Management

### Description

The system shall allow customers to manage food items in their shopping cart before placing an order.

### Primary Actor

Customer

### Priority

High

### Business Value

Allows customers to review and modify their selected food items before checkout.

### Preconditions

- The customer must be logged in.
- The selected restaurant must be active.
- The selected food item must be available.

### Input

- Food Item
- Quantity

### Validation Rules

- Quantity must be greater than zero.
- Food item must exist.
- Food item must be available.

### Processing

- Add food items to the cart.
- Update the quantity of existing items.
- Remove selected items from the cart.
- Calculate the total cart amount.

### Output

The shopping cart is updated successfully.

### Postconditions

The customer can proceed to place an order using the current cart.

### Exceptions

- Food item not found.
- Invalid quantity.
- Food item unavailable.
- Database operation failed.

---

## FR-07 Order Management

### Description

The system shall allow customers to place food orders and allow restaurant managers to process those orders.

### Primary Actor

Customer

### Secondary Actor

Restaurant Manager

### Priority

High

### Business Value

Provides the core functionality of the FoodFlow application by managing the complete order lifecycle.

### Preconditions

- Customer must be logged in.
- Shopping cart must not be empty.
- Restaurant must be active.

### Input

- Cart Details
- Delivery Address
- Payment Method

### Validation Rules

- Cart must contain at least one food item.
- Delivery address must not be empty.
- Payment method must be valid.

### Processing

- Validate customer information.
- Calculate the final bill.
- Create a new order.
- Store ordered items.
- Assign an initial order status.
- Notify the restaurant through the system.

### Output

The order is placed successfully and an order ID is generated.

### Postconditions

The order becomes available for restaurant processing.

### Exceptions

- Empty cart.
- Invalid payment method.
- Restaurant unavailable.
- Database operation failed.

---

## FR-08 Payment Management

### Description

The system shall support simulated payment processing for customer orders.

### Primary Actor

Customer

### Priority

Medium

### Business Value

Allows customers to complete the ordering process using different payment methods.

### Preconditions

- A valid order must exist.

### Input

- Payment Method

### Validation Rules

- Payment method must be supported.

### Processing

- Verify the selected payment method.
- Record payment details.
- Update the payment status.

### Output

Payment is recorded successfully.

### Postconditions

The order payment status is updated.

### Exceptions

- Invalid payment method.
- Database operation failed.

---

## FR-09 Administration

### Description

The system shall allow the administrator to monitor and manage the overall application.

### Primary Actor

Administrator

### Priority

High

### Business Value

Ensures smooth operation of the FoodFlow system through centralized administration.

### Preconditions

- Administrator must be logged in.

### Input

- Customer Details
- Restaurant Details
- Order Details

### Validation Rules

- Administrator credentials must be valid.

### Processing

- View registered customers.
- View registered restaurants.
- Monitor all orders.
- Activate or deactivate customer accounts.
- Activate or deactivate restaurant accounts.

### Output

Administrative operations are completed successfully.

### Postconditions

System information is updated accordingly.

### Exceptions

- Administrator authentication failed.
- Database operation failed.

---

## FR-10 Reporting

### Description

The system shall generate reports required by the administrator.

### Primary Actor

Administrator

### Priority

Medium

### Business Value

Provides useful information for monitoring system activity and decision-making.

### Preconditions

- Administrator must be logged in.

### Input

- Report Type

### Validation Rules

- Report type must be valid.

### Processing

- Retrieve the required information.
- Generate the requested report.
- Display report details.

### Output

The requested report is displayed successfully.

### Postconditions

The administrator can review the generated report.

### Exceptions

- Invalid report request.
- No data available.
- Database operation failed.