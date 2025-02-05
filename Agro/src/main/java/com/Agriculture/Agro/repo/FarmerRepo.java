package com.Agriculture.Agro.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Agriculture.Agro.dto.Farmer;


public interface FarmerRepo extends JpaRepository<Farmer, Integer> {

}
