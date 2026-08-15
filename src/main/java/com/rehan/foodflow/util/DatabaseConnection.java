package com.rehan.foodflow.util;

import java.sql.*;

public class DatabaseConnection {

    private static final String URl = "jdbc:mysql://127.0.0.1:3306/foodflow_db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(
                    URl,
                    USERNAME,
                    PASSWORD
            );
            return connection;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }


}
