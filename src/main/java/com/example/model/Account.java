package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Acc")
public class Account {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="uname", unique = true, nullable = false)
	private String userName;
	
	@Column(nullable=false)
	private String password;
	@Column
	private int pin;

}
