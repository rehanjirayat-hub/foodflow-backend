package com.rehan.foodflow.model;

import com.rehan.foodflow.enums.RestaurantStatus;

public class Restaurant {
    private long restaurantId;
    private String restaurantName;
    private String ownerName;
    private String email;
    private String mobileNumber;
    private String address;
    private String password;
    private RestaurantStatus status;

    public Restaurant() {
    }

    public Restaurant(String restaurantName, String ownerName, String email, String mobileNumber, String address, String password) {
        this.restaurantName = restaurantName;
        this.ownerName = ownerName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.password = password;
    }

    public Restaurant(long restaurantId, String restaurantName, String ownerName, String email, String mobileNumber, String address, String password, RestaurantStatus status) {
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
        this.ownerName = ownerName;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.address = address;
        this.password = password;
        this.status = status;
    }

    public long getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(long restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RestaurantStatus getStatus() {
        return status;
    }

    public void setStatus(RestaurantStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "restaurantId=" + restaurantId +
                ", restaurantName='" + restaurantName + '\'' +
                ", ownerName='" + ownerName + '\'' +
                ", email='" + email + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}
