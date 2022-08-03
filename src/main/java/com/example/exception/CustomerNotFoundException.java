package com.example.exception;

import javax.persistence.EntityNotFoundException;

public class CustomerNotFoundException extends EntityNotFoundException{
	public CustomerNotFoundException() {}
	public CustomerNotFoundException(String msg) {
		super(msg);
	}
}
