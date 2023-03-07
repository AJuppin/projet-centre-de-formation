package com.intiFormation.service;

import java.text.Format;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.FormateurDao;
import com.intiFormation.entity.Formateur;

@Service
public class FormateurService implements FormateurServiceInterface {
	
	@Autowired
	private FormateurDao formateurDao;
	
	
	//afficher tout les formateurs
	public List<Formateur> afficherAllFormateur()
	{
		return formateurDao.findAll();
	}
	
	
	//chercher un formateur par id
	public Optional<Formateur> selectFormateurById(int id)
	{
		Optional<Formateur> opt=formateurDao.findById(id);
		return opt;
	}
	
	
	//chercher un formateur avec son nom
	public Optional<Formateur> selectFormateurByNom(String nom)
	{
		Optional<Formateur> opt=formateurDao.findByNom(nom);
		return opt;
	}
	
	
	//ajouter ou modifier un formateur
	public void ajouterModifierFormateur(Formateur f)
	{
		formateurDao.save(f);
	}
	
	
	
	
	//supprimer un formateur
	public void supprimerFormateur(int id)
	{
		formateurDao.deleteById(id);
	}
}
