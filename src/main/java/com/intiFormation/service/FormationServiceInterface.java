package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Formation;

public interface FormationServiceInterface {
	
	public List<Formation> afficherAllFormation();
	public Optional<Formation> selectFormationById(int id);
	public Optional<Formation> selectFormationByNom(String nom);
	public void ajouterModifierFormation(Formation f);
	public void supprimerFormation(int id);

}
