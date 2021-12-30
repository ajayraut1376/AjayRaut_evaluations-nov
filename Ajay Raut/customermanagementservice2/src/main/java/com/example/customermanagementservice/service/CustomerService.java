package com.example.customermanagementservice.service;

import java.util.List;

import com.example.customermanagementservice.model.Customer;



public interface CustomerService {
	public List<Customer> getAll();
	public Customer addCustomer(Customer customer);
	public String deleteCustomer(int mobile);


}
