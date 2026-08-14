package com.rehan.foodflow.model;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FoodItem {
    private long foodId;
    private long restaurantId;
    private String foodName;
    private String category;
    private BigDecimal price;
    private Boolean availability;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public FoodItem() {
    }

    public FoodItem(long restaurantId, String foodName, String category, BigDecimal price, Boolean availability) {
        this.restaurantId = restaurantId;
        this.foodName = foodName;
        this.category = category;
        this.price = price;
        this.availability = availability;
    }

    public FoodItem(long foodId, long restaurantId, String foodName, String category, BigDecimal price, Boolean availability, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.foodId = foodId;
        this.restaurantId = restaurantId;
        this.foodName = foodName;
        this.category = category;
        this.price = price;
        this.availability = availability;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public long getFoodId() {
        return foodId;
    }

    public void setFoodId(long foodId) {
        this.foodId = foodId;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodId=" + foodId +
                ", restaurantId=" + restaurantId +
                ", foodName='" + foodName + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", availability=" + availability +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
