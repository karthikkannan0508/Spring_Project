package com.Agriculture.Agro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Agriculture.Agro.dao.FarmerDao;

@Service
public class FarmerService {
	
	@Autowired
	private FarmerDao dao;

}
