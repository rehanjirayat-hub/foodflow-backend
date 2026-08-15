-- =====================================================
-- FoodFlow Backend
-- Table Creation Script
-- Version : 1.0
-- =====================================================

USE
foodflow_db;

-- =====================================================
-- Table: customers
-- Description: Stores customer information
-- =====================================================

CREATE TABLE customers
(
    customer_id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    full_name     VARCHAR(100) NOT NULL,
    email         VARCHAR(100) NOT NULL UNIQUE,
    mobile_number VARCHAR(15)  NOT NULL UNIQUE,
    password      VARCHAR(255) NOT NULL,
    created_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- =====================================================
-- Table: restaurants
-- Description: Stores restaurant information
-- =====================================================

CREATE TABLE restaurants
(
    restaurant_id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    restaurant_name VARCHAR(100) NOT NULL,
    owner_name      VARCHAR(100) NOT NULL,
    email           VARCHAR(100) NOT NULL UNIQUE,
    mobile_number   VARCHAR(15)  NOT NULL UNIQUE,
    address         VARCHAR(255) NOT NULL,
    password        VARCHAR(255) NOT NULL,
    status          VARCHAR(20)  NOT NULL DEFAULT 'ACTIVE',
    created_at      TIMESTAMP             DEFAULT CURRENT_TIMESTAMP,
    updated_at      TIMESTAMP             DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

-- =====================================================
-- Table: food_items
-- Description: Stores food items offered by restaurants
-- =====================================================

CREATE TABLE food_items
(
    food_id       BIGINT AUTO_INCREMENT PRIMARY KEY,
    restaurant_id BIGINT         NOT NULL,
    food_name     VARCHAR(100)   NOT NULL,
    category      VARCHAR(50)    NOT NULL,
    description   VARCHAR(255),
    price         DECIMAL(10, 2) NOT NULL,
    availability  BOOLEAN        NOT NULL DEFAULT TRUE,
    created_at    TIMESTAMP               DEFAULT CURRENT_TIMESTAMP,
    updated_at    TIMESTAMP               DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    CONSTRAINT fk_food_restaurant
        FOREIGN KEY (restaurant_id)
            REFERENCES restaurants (restaurant_id)
            ON UPDATE CASCADE
            ON DELETE RESTRICT
);

-- =====================================================
-- Table: carts
-- Description: Stores the active shopping cart for each customer
-- =====================================================

CREATE TABLE carts
(
    cart_id      BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_id  BIGINT         NOT NULL UNIQUE,
    total_amount DECIMAL(10, 2) NOT NULL DEFAULT 0.00,
    created_at   TIMESTAMP               DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP               DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    CONSTRAINT fk_cart_customer
        FOREIGN KEY (customer_id)
            REFERENCES customers (customer_id)
            ON UPDATE CASCADE
            ON DELETE RESTRICT
);

-- =====================================================
-- Table: cart_items
-- Description: Stores food items added to a customer's cart
-- =====================================================

CREATE TABLE cart_items
(
    cart_item_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    cart_id      BIGINT         NOT NULL,
    food_id      BIGINT         NOT NULL,
    quantity     INT            NOT NULL,
    subtotal     DECIMAL(10, 2) NOT NULL,
    created_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    CONSTRAINT chk_cart_quantity
        CHECK (quantity > 0),

    CONSTRAINT chk_cart_subtotal
        CHECK (subtotal >= 0),

    CONSTRAINT fk_cart_item_cart
        FOREIGN KEY (cart_id)
            REFERENCES carts (cart_id)
            ON UPDATE CASCADE
            ON DELETE CASCADE,

    CONSTRAINT fk_cart_item_food
        FOREIGN KEY (food_id)
            REFERENCES food_items (food_id)
            ON UPDATE CASCADE
            ON DELETE RESTRICT
);

-- =====================================================
-- Table: orders
-- Description: Stores customer order information
-- =====================================================

CREATE TABLE orders
(
    order_id      BIGINT AUTO_INCREMENT PRIMARY KEY,
    customer_id   BIGINT         NOT NULL,
    restaurant_id BIGINT         NOT NULL,
    total_amount  DECIMAL(10, 2) NOT NULL,
    order_status  VARCHAR(30)    NOT NULL DEFAULT 'PENDING',
    order_date    TIMESTAMP               DEFAULT CURRENT_TIMESTAMP,
    created_at    TIMESTAMP               DEFAULT CURRENT_TIMESTAMP,
    updated_at    TIMESTAMP               DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    CONSTRAINT chk_order_total
        CHECK (total_amount >= 0),

    CONSTRAINT fk_order_customer
        FOREIGN KEY (customer_id)
            REFERENCES customers (customer_id)
            ON UPDATE CASCADE
            ON DELETE RESTRICT,

    CONSTRAINT fk_order_restaurant
        FOREIGN KEY (restaurant_id)
            REFERENCES restaurants (restaurant_id)
            ON UPDATE CASCADE
            ON DELETE RESTRICT
);

-- =====================================================
-- Table: order_items
-- Description: Stores food items included in each order
-- =====================================================

CREATE TABLE order_items
(
    order_item_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    order_id      BIGINT         NOT NULL,
    food_id       BIGINT         NOT NULL,
    quantity      INT            NOT NULL,
    price         DECIMAL(10, 2) NOT NULL,
    subtotal      DECIMAL(10, 2) NOT NULL,
    created_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at    TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    CONSTRAINT chk_order_item_quantity
        CHECK (quantity > 0),

    CONSTRAINT chk_order_item_price
        CHECK (price >= 0),

    CONSTRAINT chk_order_item_subtotal
        CHECK (subtotal >= 0),

    CONSTRAINT fk_order_item_order
        FOREIGN KEY (order_id)
            REFERENCES orders (order_id)
            ON UPDATE CASCADE
            ON DELETE CASCADE,

    CONSTRAINT fk_order_item_food
        FOREIGN KEY (food_id)
            REFERENCES food_items (food_id)
            ON UPDATE CASCADE
            ON DELETE RESTRICT
);

-- =====================================================
-- Table: payments
-- Description: Stores payment information for orders
-- =====================================================

CREATE TABLE payments
(
    payment_id     BIGINT AUTO_INCREMENT PRIMARY KEY,
    order_id       BIGINT      NOT NULL UNIQUE,
    payment_method VARCHAR(30) NOT NULL,
    payment_status VARCHAR(30) NOT NULL DEFAULT 'PENDING',
    payment_date   TIMESTAMP            DEFAULT CURRENT_TIMESTAMP,
    created_at     TIMESTAMP            DEFAULT CURRENT_TIMESTAMP,
    updated_at     TIMESTAMP            DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,

    CONSTRAINT fk_payment_order
        FOREIGN KEY (order_id)
            REFERENCES orders (order_id)
            ON UPDATE CASCADE
            ON DELETE RESTRICT
);

-- =====================================================
-- Table: administrators
-- Description: Stores administrator account information
-- =====================================================

CREATE TABLE administrators
(
    admin_id   BIGINT AUTO_INCREMENT PRIMARY KEY,
    full_name  VARCHAR(100) NOT NULL,
    email      VARCHAR(100) NOT NULL UNIQUE,
    password   VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);