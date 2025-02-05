package com.Agriculture.Agro.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Agriculture.Agro.dto.Bussiness;
import com.Agriculture.Agro.repo.BussinessRepo;

@Repository
public class BussinessDao {
	@Autowired
	private BussinessRepo repo;
	
	
	public Bussiness fetchById(int bid) {
		Optional<Bussiness> b = repo.findById(bid);
		if(b.isPresent()) {
			return b.get();
		}
		return null;
	}
	
	public List<Bussiness> fetchAll(){
		return repo.findAll();
	}
	
	public Bussiness updateBussiness(Bussiness b) {
		return repo.save(b);
	}
}
