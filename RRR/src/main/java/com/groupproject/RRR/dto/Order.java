package com.groupproject.RRR.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Order 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	
	@ManyToOne
	private Customer customer;
	
	@ManyToOne
	private Product product;
	
	private int quantity;
	
	private String Color;
}
