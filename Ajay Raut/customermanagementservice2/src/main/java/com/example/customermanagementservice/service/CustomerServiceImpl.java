package com.example.customermanagementservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customermanagementservice.dao.CustomerDao;
import com.example.customermanagementservice.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerDao repo;


	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

	@Override
	public String deleteCustomer(int mobile) {
		// TODO Auto-generated method stub
		repo.deleteById(mobile);
		return "deleted success";
	}


}


