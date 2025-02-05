package com.Agriculture.Agro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Agriculture.Agro.dao.CustomerDao;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDao dao;
	

}
