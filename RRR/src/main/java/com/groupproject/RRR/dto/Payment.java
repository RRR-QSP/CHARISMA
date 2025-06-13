package com.groupproject.RRR.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Payment 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int paymentId;
	
	@ManyToOne
	private Customer customer;
	
	private Delivery delivery;
	
	private double finalAmount;
}
