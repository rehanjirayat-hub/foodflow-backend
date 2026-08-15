package com.rehan.foodflow;

import com.rehan.foodflow.util.DatabaseConnection;

public class TestDatabaseConnetion {
    public static void main(String[] args){
        try {
            DatabaseConnection.getConnection();
            System.out.println("Connection completed");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
