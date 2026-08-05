-- =====================================================
-- FoodFlow Backend
-- Sample Data Script
-- Version : 1.0
-- =====================================================

USE foodflow_db;

-- =====================================================
-- Administrators
-- =====================================================

INSERT INTO administrators (
    full_name,
    email,
    password
)
VALUES
    (
        'System Administrator',
        'admin@foodflow.com',
        'admin123'
    );

-- =====================================================
-- Customers
-- =====================================================

INSERT INTO customers (
    full_name,
    email,
    mobile_number,
    password
)
VALUES
    (
        'Rahul Sharma',
        'rahul@example.com',
        '9876543210',
        'rahul123'
    ),
    (
        'Priya Verma',
        'priya@example.com',
        '9876543211',
        'priya123'
    ),
    (
        'Aman Khan',
        'aman@example.com',
        '9876543212',
        'aman123'
    );

-- =====================================================
-- Restaurants
-- =====================================================

INSERT INTO restaurants (
    restaurant_name,
    owner_name,
    email,
    mobile_number,
    address,
    password,
    status
)
VALUES
    (
        'Spice Garden',
        'Rajesh Patel',
        'spicegarden@example.com',
        '9123456780',
        'Belagavi',
        'spice123',
        'ACTIVE'
    ),
    (
        'Pizza Corner',
        'Suresh Naik',
        'pizzacorner@example.com',
        '9123456781',
        'Hubballi',
        'pizza123',
        'ACTIVE'
    );

-- =====================================================
-- Food Items
-- =====================================================

INSERT INTO food_items (
    restaurant_id,
    food_name,
    category,
    description,
    price,
    availability
)
VALUES
    (1, 'Paneer Butter Masala', 'Main Course', 'Creamy paneer curry', 220.00, TRUE),
    (1, 'Veg Biryani', 'Main Course', 'Traditional vegetable biryani', 180.00, TRUE),
    (1, 'Butter Naan', 'Bread', 'Soft butter naan', 40.00, TRUE),
    (1, 'Masala Dosa', 'South Indian', 'Crispy dosa with potato filling', 120.00, TRUE),
    (1, 'Gulab Jamun', 'Dessert', 'Sweet milk dumplings', 80.00, TRUE),

    (2, 'Margherita Pizza', 'Pizza', 'Classic cheese pizza', 299.00, TRUE),
    (2, 'Farmhouse Pizza', 'Pizza', 'Loaded vegetable pizza', 399.00, TRUE),
    (2, 'Garlic Bread', 'Starter', 'Garlic flavored bread', 149.00, TRUE),
    (2, 'French Fries', 'Snacks', 'Crispy potato fries', 129.00, TRUE),
    (2, 'Chocolate Lava Cake', 'Dessert', 'Warm chocolate cake', 99.00, TRUE);

-- =====================================================
-- Carts
-- =====================================================

INSERT INTO carts (
    customer_id,
    total_amount
)
VALUES
    (1, 638.00),
    (2, 448.00),
    (3, 220.00);

-- =====================================================
-- Cart Items
-- =====================================================

INSERT INTO cart_items (
    cart_id,
    food_id,
    quantity,
    subtotal
)
VALUES
    (1, 1, 2, 440.00),
    (1, 3, 2, 80.00),
    (1, 5, 1, 80.00),

    (2, 6, 1, 299.00),
    (2, 8, 1, 149.00),

    (3, 2, 1, 180.00),
    (3, 5, 1, 80.00);

-- =====================================================
-- Orders
-- =====================================================

INSERT INTO orders (
    customer_id,
    restaurant_id,
    total_amount,
    order_status
)
VALUES
    (1, 1, 600.00, 'DELIVERED'),
    (2, 2, 548.00, 'PREPARING'),
    (3, 1, 220.00, 'PENDING');

-- =====================================================
-- Order Items
-- =====================================================

INSERT INTO order_items (
    order_id,
    food_id,
    quantity,
    price,
    subtotal
)
VALUES
    (1, 1, 2, 220.00, 440.00),
    (1, 5, 2, 80.00, 160.00),

    (2, 6, 1, 299.00, 299.00),
    (2, 7, 1, 399.00, 399.00),

    (3, 2, 1, 180.00, 180.00),
    (3, 3, 1, 40.00, 40.00);

-- =====================================================
-- Payments
-- =====================================================

INSERT INTO payments (
    order_id,
    payment_method,
    payment_status
)
VALUES
    (1, 'UPI', 'SUCCESS'),
    (2, 'CARD', 'SUCCESS'),
    (3, 'CASH_ON_DELIVERY', 'PENDING');



