package com.example.customermanagementservice.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.customermanagementservice.model.Customer;
import com.example.customermanagementservice.service.CustomerService;




@RestController
@RequestMapping("/car")
public class Controller {
	
	@Autowired
	CustomerService Service;
	
	@GetMapping("/all")
	public ResponseEntity<List<Customer>> getAll(){
		return new ResponseEntity(Service.getAll(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer car){
		return new ResponseEntity(Service.addCustomer(car), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{mobile}")
	public ResponseEntity<String> deleteCustomer(int mobile){
		return new ResponseEntity(Service.deleteCustomer(mobile), HttpStatus.ACCEPTED);
	}

	

}
