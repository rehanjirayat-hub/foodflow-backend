package com.rehan.foodflow.model;

import java.math.BigDecimal;

public class CartItem {
    private long cartItemId;
    private long cartId;
    private long foodId;
    private int quantity;
    private BigDecimal subTotal;

    public CartItem() {
    }

    public CartItem(long cartId, long foodId, int quantity, BigDecimal subTotal) {
        this.cartId = cartId;
        this.foodId = foodId;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }

    public CartItem(long cartItemId, long cartId, long foodId, int quantity, BigDecimal subTotal) {
        this.cartItemId = cartItemId;
        this.cartId = cartId;
        this.foodId = foodId;
        this.quantity = quantity;
        this.subTotal = subTotal;
    }

    public long getCartItemId() {
        return cartItemId;
    }

    public void setCartItemId(long cartItemId) {
        this.cartItemId = cartItemId;
    }

    public long getCartId() {
        return cartId;
    }

    public void setCartId(long cartId) {
        this.cartId = cartId;
    }

    public long getFoodId() {
        return foodId;
    }

    public void setFoodId(long foodId) {
        this.foodId = foodId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "cartItemId=" + cartItemId +
                ", cartId=" + cartId +
                ", foodId=" + foodId +
                ", quantity=" + quantity +
                ", subTotal=" + subTotal +
                '}';
    }
}
