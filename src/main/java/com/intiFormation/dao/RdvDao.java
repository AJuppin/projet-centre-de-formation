package com.intiFormation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.intiFormation.entity.Rdv;

public interface RdvDao extends JpaRepository<Rdv, Integer>{
	
	public List<Rdv> findByPersonne_Id(int id);

}
