package com.coders.DairyDelight.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.coders.DairyDelight.entity.Customer;
import com.coders.DairyDelight.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepositoy;
	public Customer createCustomer(Customer customer) {
		return customerRepositoy.save(customer);
	}
	
	public Customer getCustomerById(Long id) {
		return customerRepositoy.findById(id).get();
	}

	public List<Customer> getAllCustomers() {
		return customerRepositoy.findAll();
	}

	public Customer searchCustomerByCustomParameter(Long id, String fname, String lname, Long contactNo, Long adharNo,
			String street, String city) {
		return null;
	}

	public ResponseEntity<List<Customer>> searchCustomerByContactNo(Long contactNo) {
		List<Customer> customerBycontactNo = customerRepositoy.getCustomerBycontactNo(contactNo).get();
		return new ResponseEntity<>(customerBycontactNo,HttpStatus.OK);
	}
}
