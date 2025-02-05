package com.Agriculture.Agro.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Agriculture.Agro.dto.Customer;
import com.Agriculture.Agro.dto.Farmer;
import com.Agriculture.Agro.repo.CustomerRepo;

@Repository
public class CustomerDao {
	@Autowired
	private CustomerRepo repo;
	
	
	public Customer fetchById(int cid) {
		Optional<Customer> c = repo.findById(cid);
		if(c.isPresent()) {
			return c.get();
		}
		return null;
	}
	
	public List<Customer> fetchAll(){
		return repo.findAll();
	}
	
	public Customer updateFarmer(Customer c) {
		return repo.save(c);
	}

}
