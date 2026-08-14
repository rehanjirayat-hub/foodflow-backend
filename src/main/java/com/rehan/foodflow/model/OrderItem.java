package com.rehan.foodflow.model;

import java.math.BigDecimal;

public class OrderItem {
    private long orderItemId;
    private long orderId;
    private long foodItemId;
    private String foodName;
    private int quantity;
    private BigDecimal unitPrice;
    private BigDecimal subTotal;

    public OrderItem() {
    }

    public OrderItem(long orderId, long foodItemId, String foodName, int quantity, BigDecimal unitPrice) {
        this.orderId = orderId;
        this.foodItemId = foodItemId;
        this.foodName = foodName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public OrderItem(long orderItemId, long orderId, long foodItemId, String foodName, int quantity, BigDecimal unitPrice, BigDecimal subTotal) {
        this.orderItemId = orderItemId;
        this.orderId = orderId;
        this.foodItemId = foodItemId;
        this.foodName = foodName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.subTotal = subTotal;
    }

    public long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(long foodItemId) {
        this.foodItemId = foodItemId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public BigDecimal getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "orderItemId=" + orderItemId +
                ", orderId=" + orderId +
                ", foodItemId=" + foodItemId +
                ", foodName='" + foodName + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", subTotal=" + subTotal +
                '}';
    }
}
