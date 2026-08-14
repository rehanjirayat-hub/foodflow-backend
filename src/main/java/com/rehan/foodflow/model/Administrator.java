package com.rehan.foodflow.model;

import java.time.LocalDateTime;

public class Administrator {
    private long admitId;
    private String fullName;
    private String email;
    private String password;
    private LocalDateTime createdAt;
    private LocalDateTime updaedAt;

    public Administrator() {
    }

    public Administrator(String fullName, String email, String password) {
        this.fullName = fullName;
        this.email = email;
        this.password = password;
    }

    public Administrator(long admitId, String fullName, String email, String password, LocalDateTime createdAt, LocalDateTime updaedAt) {
        this.admitId = admitId;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
        this.updaedAt = updaedAt;
    }

    public long getAdmitId() {
        return admitId;
    }

    public void setAdmitId(long admitId) {
        this.admitId = admitId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdaedAt() {
        return updaedAt;
    }

    public void setUpdaedAt(LocalDateTime updaedAt) {
        this.updaedAt = updaedAt;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "admitId=" + admitId +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", createdAt=" + createdAt +
                ", updaedAt=" + updaedAt +
                '}';
    }
}
