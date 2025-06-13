package com.groupproject.RRR.dto;

import java.util.List;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

public class Product 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	private String productName;
	
	private String clothingType;
	
	private String category;
	
	private double price;
	
	@ManyToOne
	private Brand brand;
	
	@OneToMany(mappedBy = "product")
	private List<Order> orders;
}
