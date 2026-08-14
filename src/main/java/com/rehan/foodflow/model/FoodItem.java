package com.rehan.foodflow.model;
import java.math.BigDecimal;
import com.rehan.foodflow.enums.FoodItemStatus;

public class FoodItem {
    private long foodItemId;
    private long restaurantId;
    private String foodName;
    private String category;
    private String description;
    private BigDecimal price;
    private FoodItemStatus availabilityStatus;

    public FoodItem() {
    }

    public FoodItem(long restaurantId, String foodName, String category, String description, BigDecimal price) {
        this.restaurantId = restaurantId;
        this.foodName = foodName;
        this.category = category;
        this.description = description;
        this.price = price;
    }

    public FoodItem(long foodItemId, long restaurantId, String foodName, String category, String description, BigDecimal price, FoodItemStatus availabilityStatus) {
        this.foodItemId = foodItemId;
        this.restaurantId = restaurantId;
        this.foodName = foodName;
        this.category = category;
        this.description = description;
        this.price = price;
        this.availabilityStatus = availabilityStatus;
    }

    public long getFoodItemId() {
        return foodItemId;
    }

    public void setFoodItemId(long foodItemId) {
        this.foodItemId = foodItemId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public FoodItemStatus getAvailabilityStatus() {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(FoodItemStatus availabilityStatus) {
        this.availabilityStatus = availabilityStatus;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodItemId=" + foodItemId +
                ", restaurantId=" + restaurantId +
                ", foodName='" + foodName + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", availabilityStatus=" + availabilityStatus +
                '}';
    }
}
