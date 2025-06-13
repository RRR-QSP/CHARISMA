package com.groupproject.RRR.dto;

import jakarta.validation.constraints.Pattern;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	private String customerName;
	
	private String password;
	
	@Pattern(regexp = "^[6-9][0-9]{9}$", message = "Contact number must start with 6, 7, 8, or 9 and be 10 digits long")
	private String customerEmail;
	
	private String customerAddress;
	
	@Pattern(regexp = "^[0-9]{6}$", message = "Must be 6 digits")
	private String pincode;
	
	@OneToMany(mappedBy = "customer")
	private List<Order> orders;
	
	@OneToMany(mappedBy = "customer")
	private List<ResellClothes> reselledClothes;
	
	@OneToMany(mappedBy = "customer")
	private List<Payment> payments;

	
	
}
