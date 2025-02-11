package com.Agriculture.Agro.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Agriculture.Agro.DAO.BusinessDAO;
import com.Agriculture.Agro.DTO.Business;

@Service
public class BusinessService {
	
	@Autowired
	private BusinessDAO dao;
	
	
	public Business fetchById(int bid) {
		return dao.fetchById(bid);
	}
	
	public List<Business> fetchAll(){
		return dao.fetchAll();
	}
	
	public Business updateAddress(int bid,Business newBussiness) {
		Business b = fetchById(bid);
		
		if(b!=null) {
			newBussiness.setBid(bid);
			
			return dao.updateBussiness(newBussiness);
		}
		return null;
	}
	
	public Business updateCity(int bid,long bPhone) {
		Business b = fetchById(bid);
		
		if(b!=null) {
			b.setbPhone(bPhone);
			return dao.updateBussiness(b);
		}
		return null;
	}
	
}