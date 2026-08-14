package com.rehan.foodflow.model;

public class CartItem {
    private long cartId;
    private long customerId;
    private long foodItemId;
    private int quantity;


    public CartItem() {
    }

    public CartItem(long customerId, long foodItemId, int quantity) {
        this.customerId = customerId;
        this.foodItemId = foodItemId;
        this.quantity = quantity;
    }

    public CartItem(long cartId, long customerId, long foodItemId, int quantity) {
        this.cartId = cartId;
        this.customerId = customerId;
        this.foodItemId = foodItemId;
        this.quantity = quantity;
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public long getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(long foodItemId) {
        this.foodItemId = foodItemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "cartId=" + cartId +
                ", customerId=" + customerId +
                ", foodItemId=" + foodItemId +
                ", quantity=" + quantity +
                '}';
    }
}
