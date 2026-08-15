package com.rehan.foodflow.repository;

import com.rehan.foodflow.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepositry {
    public Customer save(Customer customer);

    public Optional<Customer> findById(long customerId);

    public Optional<Customer> findByEmail(String email);

    public Optional<Customer> findByMobileNumber(String mobileNumber);

    public List<Customer> findAll();

    public boolean update(Customer customer);

    public boolean deleteById(long customerId);


}
