package com.groupproject.RRR.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Delivery 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deliveryId;
	
	@ManyToOne
	private Customer customer;
	
	@ManyToOne 
	private DeliverBoy deliveryBoy;
	
	
}
