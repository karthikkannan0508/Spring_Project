package com.Agriculture.Agro.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Agriculture.Agro.DTO.Business;

public interface BusinessRepo extends JpaRepository<Business, Integer> {

}