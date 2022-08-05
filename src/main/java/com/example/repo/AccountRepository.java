package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.model.Account;

@Repository
@EnableJpaRepositories
public interface AccountRepository extends JpaRepository<Account, Integer>{
	@Query(value="SELECT a from Account a WHERE a.accountNumber =?1 and a.pin =?2", nativeQuery=true)
	 List<Account>access(String accountNumber, int pin);
		
	

}
