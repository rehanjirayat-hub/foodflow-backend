package com.rehan.foodflow.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Cart {
    private long cartId;
    private long customerId;
    private BigDecimal totalAmount;
    private LocalDateTime createAt;
    private LocalDateTime updatedAt;

    public Cart() {
    }

    public Cart(long customerId, BigDecimal totalAmount) {
        this.customerId = customerId;
        this.totalAmount = totalAmount;
    }

    public Cart(long cartId, long customerId, BigDecimal totalAmount, LocalDateTime createAt, LocalDateTime updatedAt) {
        this.cartId = cartId;
        this.customerId = customerId;
        this.totalAmount = totalAmount;
        this.createAt = createAt;
        this.updatedAt = updatedAt;
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

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", customerId=" + customerId +
                ", totalAmount=" + totalAmount +
                ", createAt=" + createAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
