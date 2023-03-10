package com.intiFormation.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intiFormation.entity.Formation;
import com.intiFormation.entity.Historique;

public interface HistoriqueDao extends JpaRepository <Historique, Integer> {
	
	public List<Historique> findByPersonne_Id(int id);
	
	

}
