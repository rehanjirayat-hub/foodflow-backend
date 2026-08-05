-- =====================================================
-- FoodFlow Backend
-- Database Test Queries
-- Version : 1.0
-- =====================================================

USE foodflow_db;

-- Display all customers
SELECT * FROM customers;

-- Display all restaurants
SELECT * FROM restaurants;

-- Display all food items
SELECT * FROM food_items;

-- Display all orders
SELECT * FROM orders;

-- Display all payments
SELECT * FROM payments;

-- Find a customer by email
SELECT *
FROM customers
WHERE email = 'rahul@example.com';

-- Display available food items
SELECT *
FROM food_items
WHERE availability = TRUE;

-- Display delivered orders
SELECT *
FROM orders
WHERE order_status = 'DELIVERED';

-- Food items sorted by price
SELECT *
FROM food_items
ORDER BY price ASC;

-- Customers sorted by name
SELECT *
FROM customers
ORDER BY full_name;

-- Total customers
SELECT COUNT(*) AS total_customers
FROM customers;

-- Total restaurants
SELECT COUNT(*) AS total_restaurants
FROM restaurants;

-- Average food price
SELECT AVG(price) AS average_price
FROM food_items;

-- Highest food price
SELECT MAX(price) AS highest_price
FROM food_items;

-- Lowest food price
SELECT MIN(price) AS lowest_price
FROM food_items;

-- Customer Orders
SELECT
    o.order_id,
    c.full_name,
    o.total_amount,
    o.order_status
FROM orders o
         INNER JOIN customers c
                    ON o.customer_id = c.customer_id;

-- Restaurant Food Items
SELECT
    r.restaurant_name,
    f.food_name,
    f.price
FROM restaurants r
         INNER JOIN food_items f
                    ON r.restaurant_id = f.restaurant_id;

-- Order Payments
SELECT
    o.order_id,
    p.payment_method,
    p.payment_status
FROM orders o
         INNER JOIN payments p
                    ON o.order_id = p.order_id;

SELECT
    c.full_name,
    o.order_id,
    p.payment_status
FROM customers c
         INNER JOIN orders o
                    ON c.customer_id = o.customer_id
         INNER JOIN payments p
                    ON o.order_id = p.order_id;

SELECT
    restaurant_id,
    COUNT(*) AS total_food_items
FROM food_items
GROUP BY restaurant_id;

SELECT
    SUM(total_amount) AS total_revenue
FROM orders;

SELECT *
FROM orders
WHERE order_status='PENDING';

SHOW TABLES;

DESCRIBE customers;

DESCRIBE restaurants;

DESCRIBE food_items;

DESCRIBE carts;

DESCRIBE cart_items;

DESCRIBE orders;

DESCRIBE order_items;

DESCRIBE payments;

DESCRIBE administrators;