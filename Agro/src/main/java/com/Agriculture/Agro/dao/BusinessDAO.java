package com.Agriculture.Agro.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Agriculture.Agro.DTO.*;
import com.Agriculture.Agro.Repo.BusinessRepo;

@Repository
public class BusinessDAO {
	@Autowired
	private BusinessRepo repo;
	
	
	public Business fetchById(int bid) {
		Optional<Business> b = repo.findById(bid);
		if(b.isPresent()) {
			return b.get();
		}
		return null;
	}
	
	public List<Business> fetchAll(){
		return repo.findAll();
	}
	
	public Business updateBussiness(Business b) {
		return repo.save(b);
	}
}