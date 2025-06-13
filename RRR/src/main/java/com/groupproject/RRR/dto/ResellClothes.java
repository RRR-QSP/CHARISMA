package com.groupproject.RRR.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class ResellClothes 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	private Customer customer;
	
	@ManyToOne
	private Order order;
	
	@OneToOne
	private Brand brand;
	
	private Quality quality;
	
	
}
