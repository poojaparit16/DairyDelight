package com.coders.DairyDelight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coders.DairyDelight.entity.Customer;
import com.coders.DairyDelight.service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customer")
	public Customer createCustomer(@RequestBody Customer customer ) {
		return customerService.createCustomer(customer);
	}
	
	@GetMapping("/customer")
	public List<Customer> getAllCustomers(){
				return customerService.getAllCustomers();
	}		
	
	@GetMapping("/customer/id")
	public Customer getCustomerById(@RequestParam Long id ){
		return customerService.getCustomerById(id);
	}
	
	@GetMapping("/search")
	public ResponseEntity<List<Customer>> searchCustomerContactNo(@RequestParam Long contactNo ){
		return customerService.searchCustomerByContactNo(contactNo);
	}

	//id, fname, lname,contactNo,adharNo,street,city
	/*@RequestParam Long id,@RequestParam String fname, 
	@RequestParam String lname, @RequestParam Long contactNo, @RequestParam Long adharNo, 
	@RequestParam  String street, @RequestParam String city*/
}
