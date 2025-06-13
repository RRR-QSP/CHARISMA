package com.groupproject.RRR.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groupproject.RRR.dto.Customer;

public interface RRRRepository extends JpaRepository<Customer, Integer>
{
	
}
