package com.Agriculture.Agro.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Agriculture.Agro.dto.Customer;


public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}
