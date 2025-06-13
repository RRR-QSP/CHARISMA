package com.groupproject.RRR.dto;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class Brand 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int brandId;
	
	private String brandName;
	
	private String registerDate;
	
	@OneToMany(mappedBy = "brand")
	private List<Product> products;
	
	
}
