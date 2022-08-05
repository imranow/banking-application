package com.example.rest;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.model.Account;
import com.example.model.Customer;
import com.example.repo.AccountRepository;
import com.example.repo.CustomerRepository;
import com.example.service.CustomerService;

@SpringBootTest
public class AcccountServiceUnitTest {
	@Autowired
	private Account service;
	
	@MockBean
	private AccountRepository repo;
	
	@Test
    void testCreate() {
    	 // GIVEN is our testing data - you can make this a final local variable if you want, e.g.:
        final Account TEST_ACCOUNT = new Account(1,"hello","1234", Customer);
        final Account TEST_SAVED_ACCOUNT = new Account(1,"hello","1234",Customer);

        // WHEN
        Mockito.when(this.repo.save(TEST_ACCOUNT)).thenReturn(TEST_SAVED_ACCOUNT);

        // THEN
        Assertions.assertThat(this.service.addAccount(TEST_ACCOUNT)).isEqualTo(TEST_SAVED_ACCOUNT);

        // verify that our repo was accessed exactly once
        Mockito.verify(this.repo, Mockito.times(1)).save(TEST_ACCOUNT);
    }


	
	
	

}
