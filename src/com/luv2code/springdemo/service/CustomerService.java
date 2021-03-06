package com.luv2code.springdemo.service;

import com.luv2code.springdemo.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> getCustomers();

    void saveCustomer(Customer theCustomer);

    Customer getCustomers(int theId);

    void deleteCustomer(int theId);
}
