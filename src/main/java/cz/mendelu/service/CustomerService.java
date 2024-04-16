package cz.mendelu.service;

import cz.mendelu.domain.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);
}