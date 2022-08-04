package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exception.CustomerNotFoundException;
import com.example.model.Account;
import com.example.model.Customer;
import com.example.repo.AccountRepository;
@Service
public class AccountService {
	@Autowired
	public AccountRepository repo;

	public Account addAccount(Account account) {
		return this.repo.save(account);
	}

	public List<Account> getAllAccount(){
		return this.repo.findAll();
	}

	public Account updateAccount(Long id , Account account){
		Account temp = this.repo.findById(id).orElseThrow(CustomerNotFoundException::new);
		Optional<Account> myTempAccount=Optional.of(temp);
		Account existing=myTempAccount.get();		
		existing.setAccountNumber(account.getAccountNumber());
		existing.setPin(account.getPin());
		existing.setCustomer(account.getCustomer());
		return this.repo.save(existing);
	}
	public boolean deleteAccount(Long id) {
		this.repo.deleteById(id);
		boolean exists=this.repo.existsById(id);
		return !exists;
	}
	public List<Account> getaccess(String accountNumber, int pin){
		return this.repo.access(accountNumber, pin);
	}
	
	
	public int checkAccess(String accountNumber, int pin) {
		int flag=0;
		if(!repo.access(accountNumber, pin).isEmpty()) {
			flag=1;
			return flag;
		}
		return flag;
	}
	
	
	
	
	

}
