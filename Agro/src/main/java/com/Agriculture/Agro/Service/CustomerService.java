package com.Agriculture.Agro.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Agriculture.Agro.DAO.CustomerDAO;


@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO dao;
	

}