package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.example.model.Customer;

@Repository
@EnableJpaRepositories
public interface CustomerRepository extends JpaRepository<Customer,Long>{
	@Query(value="SELECT c from Customer c WHERE c.userName =?1 and c.password =?2", nativeQuery=true)
	List<Customer>login(String userName, String password);

}
