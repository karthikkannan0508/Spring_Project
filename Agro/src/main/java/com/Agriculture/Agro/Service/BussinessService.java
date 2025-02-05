package com.Agriculture.Agro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Agriculture.Agro.dao.BussinessDao;
import com.Agriculture.Agro.dto.Bussiness;

@Service
public class BussinessService {
	
	@Autowired
	private BussinessDao dao;
	
	
	public Bussiness fetchById(int bid) {
		return dao.fetchById(bid);
	}
	
	public List<Bussiness> fetchAll(){
		return dao.fetchAll();
	}
	
	public Bussiness updateAddress(int bid,Bussiness newBussiness) {
		Bussiness b = fetchById(bid);
		
		if(b!=null) {
			newBussiness.setBid(bid);
			
			return dao.updateBussiness(newBussiness);
		}
		return null;
	}
	
	public Bussiness updateCity(int bid,long bPhone) {
		Bussiness b = fetchById(bid);
		
		if(b!=null) {
			b.setbPhone(bPhone);
			return dao.updateBussiness(b);
		}
		return null;
	}
	
}
