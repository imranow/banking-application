package com.example.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.CustomerNotFoundException;
import com.example.model.Customer;

import com.example.repo.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	public CustomerRepository repo;
	
	
	public Customer addCustomer(Customer customer) {
		return this.repo.save(customer);
	}
	public List<Customer> getAllCustomer(){
		return this.repo.findAll();
	}

	public Customer updateCustomer(Long id , Customer customer){
		Customer temp = this.repo.findById(id).orElseThrow(CustomerNotFoundException::new);
		Optional<Customer> myTempCustomer=Optional.of(temp);
		Customer existing=myTempCustomer.get();		
		existing.setUserName(customer.getUserName());
		existing.setPassword(customer.getPassword());
		existing.setEmail(customer.getEmail());
		existing.setPhone(customer.getPhone());
		return this.repo.save(existing);
	}
	public boolean deleteCustomer(Long id) {
		this.repo.deleteById(id);
		boolean exists=this.repo.existsById(id);
		return !exists;
	}
	
	public List<Customer> getlogin(String userName, String password){
		return this.repo.login(userName, password);
	}
	
	
	public int checkCredentials(String userName, String password) {
		int flag=0;
		if(!repo.login(userName, password).isEmpty()) {
			flag=1;
			return flag;
		}
		return flag;
	}
	
	

}
