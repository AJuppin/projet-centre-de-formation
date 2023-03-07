package com.intiFormation.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.entity.Formateur;

public interface FormateurDao extends JpaRepository<Formateur, Integer> {
	
	public Optional<Formateur> findByNom(String nom);

}
