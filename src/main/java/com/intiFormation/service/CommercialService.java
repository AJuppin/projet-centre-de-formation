package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.CommercialDao;
import com.intiFormation.entity.Commercial;

@Service
public class CommercialService implements CommercialServiceInterface {
	
	@Autowired
	private CommercialDao commercialDao;
	
	
	//afficher tout les commerciaux
	public List<Commercial> afficherAllCommercial()
	{
		return commercialDao.findAll();
	}
	
	
	//chercher un commercial avec l'id
	public Optional<Commercial>  selectCommercial(int id)
	{
		Optional<Commercial> opt=commercialDao.findById(id);
		return opt;
	}
	
	
	//ajouter ou modifier un commercial
	public void ajouterModifierCommercial(Commercial commercial)
	{
		commercialDao.save(commercial);
	}
	
	
	//supprimer un commercial
	public void supprimerCommercial(int id)
	{
		commercialDao.deleteById(id);
	}

}
