package com.example.exception;

import javax.persistence.EntityNotFoundException;

public class AccountNotFoundException extends EntityNotFoundException{
	public AccountNotFoundException() {}
	public AccountNotFoundException(String msg) {
		super(msg);
	}


}