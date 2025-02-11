package com.Agriculture.Agro.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Agriculture.Agro.DTO.Customer;


public interface CustomerRepo extends JpaRepository<Customer, Integer> {

}