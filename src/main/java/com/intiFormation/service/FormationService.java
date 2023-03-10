package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.FormationDao;
import com.intiFormation.entity.Formation;

@Service
public class FormationService implements FormationServiceInterface {
	
	@Autowired
	private FormationDao formationDao;
	
	//afficher toutes les formations
	public List<Formation> afficherAllFormation()
	{
		return formationDao.findAll();
	}
	
	
	
	//chercher une formation par id
	public Optional<Formation> selectFormationById(int id)
	{
		Optional<Formation> opt=formationDao.findById(id);
		return opt;
	}
	
	
	//chercher une formation avec son nom
	public Optional<Formation> selectFormationByNom(String nom)
	{
		Optional<Formation> opt=formationDao.findByNom(nom);
		return opt;
	}
	
	
	
	//ajouter, modifier une formation
	public void ajouterModifierFormation(Formation f)
	{
		formationDao.save(f);
	}
	
	
	
	//supprimer une formation
	public void supprimerFormation(int id)
	{
		formationDao.deleteById(id);
	}
	
	
	
	
	
}
