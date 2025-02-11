package com.Agriculture.Agro.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Agriculture.Agro.DTO.*;
import com.Agriculture.Agro.DTO.*;
import com.Agriculture.Agro.Repo.CustomerRepo;

@Repository
public class CustomerDAO {
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