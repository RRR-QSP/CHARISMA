package com.groupproject.RRR.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Orphanage 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orphanageId;
	
	private String orphanageName;
	
	private String orphanageAddress;
	
	private int orphanagePincode;
}
