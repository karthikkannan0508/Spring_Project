package com.Agriculture.Agro.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Agriculture.Agro.dto.Farmer;
import com.Agriculture.Agro.repo.FarmerRepo;

@Repository
public class FarmerDao {
	
	@Autowired
	private FarmerRepo repo;
	
	public Farmer fetchById(int fid) {
		Optional<Farmer> f = repo.findById(fid);
		if(f.isPresent()) {
			return f.get();
		}
		return null;
	}
	
	public List<Farmer> fetchAll(){
		return repo.findAll();
	}
	
	public Farmer updateFarmer(Farmer f) {
		return repo.save(f);
	}
	

}
