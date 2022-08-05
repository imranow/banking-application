package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Customer;

import com.example.service.CustomerService;
@RestController
public class CustomerController {
	private CustomerService service;

	public CustomerController(CustomerService service) {
		super();
		this.service = service;
	}
	@PostMapping("/create")
	public Customer create(@RequestBody Customer customer) { 
		return this.service.addCustomer(customer);
	}
	@GetMapping("/read")
	public List<Customer> getList() {
		return this.service.getAllCustomer();
	}
	@PutMapping("/update/{id}")
	public Customer update (@PathVariable Long id,@RequestBody Customer customer) {
	
		return this.service.updateCustomer(id, customer);
	}
	@DeleteMapping("/delete/{id}")
	public void delete (@PathVariable Long id) {
		this.service.deleteCustomer(id);
	}

	@GetMapping("/login/{userName}/{password}")
	public int login(@PathVariable String userName, @PathVariable String password){
		return this.service.checkCredentials(userName, password);
	}
	@GetMapping("/home")
	public String home() {
		return "My home";
	}
	
	
	
	
	

}
