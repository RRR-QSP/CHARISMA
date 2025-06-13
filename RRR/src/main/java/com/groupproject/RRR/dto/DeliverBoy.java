package com.groupproject.RRR.dto;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class DeliverBoy 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deliveryBoyId;
	
	private String deliveryBoyName;
	
	private String deliveryBoyContact;
	
	private String deliveryBoyEmail;
	
	private String deliveryBoyAddress;
	
	@OneToMany(mappedBy = "deliveryBoy")
	private List<Delivery> deliveries;
}
