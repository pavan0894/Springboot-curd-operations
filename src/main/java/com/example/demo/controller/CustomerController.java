package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.*;
import com.example.demo.repository.CustomerRepository;

@RestController
@RequestMapping("/customer")
public class CustomerController {	

	@Autowired
	CustomerRepository customerRepository;

		// fetch all customer list from database
		@GetMapping("/all")
		public Iterable<Customer> allCustomer() {

			return customerRepository.findAll();
		}
		
		// update existing customer
		@PutMapping("/update/{customerId}")
		public Customer updateCustomer(@RequestBody Customer customer) {

			return customerRepository.save(customer);
		}	

		
		// insert new customer into database
		@PostMapping("/add")
		public Customer addCustomer(@RequestBody Customer customer) {

		return customerRepository.save(customer);
	}
		
		// delete customer from database
		@DeleteMapping("/{customerId}")
		public void deleteCustomer(@PathVariable("customerId") int customerId) {

			customerRepository.deleteById(customerId);
		}

}
