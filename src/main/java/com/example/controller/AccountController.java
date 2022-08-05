package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Account;
import com.example.service.AccountService;
@RestController
@RequestMapping("/account")
public class AccountController {
	@Autowired
	private AccountService service;

	public AccountController(AccountService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/create")
	public Account create(@RequestBody Account account) { 
		return this.service.addAccount(account);
	}
	@GetMapping("/accountNumber")
	public List<Account> getList() {
		return this.service.getAllAccount();
	}
	@PutMapping("/update/{id}")
	public Account update (@PathVariable Long id,@RequestBody Account account) {
	
		return this.service.updateAccount(id, account);
	}
	@DeleteMapping("/delete/{id}")
	public void delete (@PathVariable Long id) {
		this.service.deleteAccount(id);
	}

	@GetMapping("/login/{accountNumber}/{pin}")
	public int login(@PathVariable String accountNumber, @PathVariable int pin){
		return this.service.checkAccess(accountNumber, pin);
	}
	@GetMapping("/home")
	public String home() {
		return "My home";
	}
	
	

}
