package com.rehan.foodflow.repository.repository_impl;

import com.rehan.foodflow.model.Customer;
import com.rehan.foodflow.repository.CustomerRepositry;

import java.util.List;
import java.util.Optional;

public class CustomerRepositoryimpl implements CustomerRepositry {
    @Override
    public Customer save(Customer customer) {
        return null;
    }

    @Override
    public Optional<Customer> findById(long customerId) {
        return Optional.empty();
    }

    @Override
    public Optional<Customer> findByEmail(String email) {
        return Optional.empty();
    }

    @Override
    public Optional<Customer> findByMobileNumber(String mobileNumber) {
        return Optional.empty();
    }

    @Override
    public List<Customer> findAll() {
        return List.of();
    }

    @Override
    public boolean update(Customer customer) {
        return false;
    }

    @Override
    public boolean deleteById(long customerId) {
        return false;
    }
}
