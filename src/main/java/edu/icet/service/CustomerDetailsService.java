package edu.icet.service;

import edu.icet.dto.Customer;

import java.util.List;

public interface CustomerDetailsService {
    void addCustomer(Customer customer);

    List<Customer> getAll();
}
