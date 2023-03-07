package com.intiFormation.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.entity.Formation;

public interface FormationDao extends JpaRepository<Formation, Integer>{
	
	public Optional<Formation>  findByNom(String nom);

}
