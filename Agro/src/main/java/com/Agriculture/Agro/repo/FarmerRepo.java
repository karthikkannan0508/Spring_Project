package com.Agriculture.Agro.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Agriculture.Agro.DTO.Farmer;


public interface FarmerRepo extends JpaRepository<Farmer, Integer> {

}