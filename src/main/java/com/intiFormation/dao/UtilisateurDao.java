package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.intiFormation.entity.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Integer> {

	public Utilisateur findByUsername(String username);
	
	//@Query("select r from Role r where r.nom_role =:role")
	public List<Utilisateur> findByRole_Id (int id);
	
}
