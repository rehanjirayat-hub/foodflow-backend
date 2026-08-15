package com.rehan.foodflow.repository.repository_impl;

import com.rehan.foodflow.model.Customer;
import com.rehan.foodflow.repository.CustomerRepositry;
import com.rehan.foodflow.util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CustomerRepositoryimpl implements CustomerRepositry {

    @Override
    public Customer save(Customer customer) {
        String sql = """
                INSERT INTO customers(full_name, mobile_number, email, password)
                VALUES(?,?,?,?)
                """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, customer.getFullName());
            statement.setString(2, customer.getMobileNumber());
            statement.setString(3, customer.getEmail());
            statement.setString(4, customer.getPassword());

            statement.executeUpdate();

            return customer;

        } catch (SQLException e) {
            throw new RuntimeException("Failed to save customer", e);
        }
    }

    @Override
    public Optional<Customer> findById(long customerId) {
        String sql = """
                SELECT *
                FROM customers
                WHERE customer_id = ?
                """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setLong(1, customerId);

            ResultSet result = statement.executeQuery();

            if (result.next()) {

                Customer customer = new Customer(
                        result.getString("full_name"),
                        result.getString("email"),
                        result.getString("mobile_number"),
                        result.getString("password")
                );

                customer.setCustomerId(result.getLong("customer_id"));

                return Optional.of(customer);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return Optional.empty();
    }

    @Override
    public Optional<Customer> findByEmail(String email) {
        String sql = """
                SELECT *
                FROM customers
                WHERE email = ?
                """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, email);

            ResultSet result = statement.executeQuery();

            if (result.next()) {

                Customer customer = new Customer(
                        result.getString("full_name"),
                        result.getString("email"),
                        result.getString("mobile_number"),
                        result.getString("password")
                );

                customer.setCustomerId(result.getLong("customer_id"));

                return Optional.of(customer);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return Optional.empty();
    }

    @Override
    public Optional<Customer> findByMobileNumber(String mobileNumber) {
        String sql = """
                SELECT *
                FROM customers
                WHERE mobile_number = ?
                """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, mobileNumber);

            ResultSet result = statement.executeQuery();

            if (result.next()) {

                Customer customer = new Customer(
                        result.getString("full_name"),
                        result.getString("email"),
                        result.getString("mobile_number"),
                        result.getString("password")
                );

                customer.setCustomerId(result.getLong("customer_id"));

                return Optional.of(customer);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return Optional.empty();
    }

    @Override
    public List<Customer> findAll() {
        String sql = """
                SELECT *
                FROM customers
                """;

        List<Customer> customers = new ArrayList<>();

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            ResultSet result = statement.executeQuery();

            while (result.next()) {

                Customer customer = new Customer(
                        result.getString("full_name"),
                        result.getString("email"),
                        result.getString("mobile_number"),
                        result.getString("password")
                );

                customer.setCustomerId(result.getLong("customer_id"));

                customers.add(customer);
            }

            return customers;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean update(Customer customer) {
        String sql = """
                UPDATE customers
                SET full_name = ?, email = ?, mobile_number = ?, password = ?
                WHERE customer_id = ?
                """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setString(1, customer.getFullName());
            statement.setString(2, customer.getEmail());
            statement.setString(3, customer.getMobileNumber());
            statement.setString(4, customer.getPassword());
            statement.setLong(5, customer.getCustomerId());

            int roweffected = statement.executeUpdate();

            if (roweffected == 1) {
                System.out.println("Customer updated successfully");
            } else {
                System.out.println("Not updated Customer");
            }

            return roweffected > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean deleteById(long customerId) {
        String sql = """
                DELETE
                FROM customers
                WHERE customer_id = ?
                """;

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setLong(1, customerId);

            int roweffected = statement.executeUpdate();

            if (roweffected == 1) {
                System.out.println("Customer deleted successfully");
            } else {
                System.out.println("Not deleted Customer");
            }

            return roweffected > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}