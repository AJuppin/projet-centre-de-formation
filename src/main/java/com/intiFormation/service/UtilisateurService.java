package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.UtilisateurDao;
import com.intiFormation.entity.Utilisateur;

@Service
public class UtilisateurService implements IUtilisateurservice {
	
	@Autowired
	private UtilisateurDao utilisateurDao;
	
	
	public void ajouter(Utilisateur u)
	{
		utilisateurDao.save(u);
	}
	
	public List<Utilisateur>selectAll()
	{
		List<Utilisateur>utilisateur=utilisateurDao.findAll();
		
		return utilisateur;
		
	}
		public void supp(int id)
		{
			utilisateurDao.deleteById(id);
		}
	
	
	public Utilisateur chercherParUsername(String username)
	{
		return utilisateurDao.findByUsername(username);
	}
	
	public boolean verifierUsername(Utilisateur u)
	{
		List<Utilisateur> utilisateurs=utilisateurDao.findAll();
		boolean resultat=true;
		for(Utilisateur user:utilisateurs)
		{
			if(user.getUsername().equals(u.getUsername()))
			{
				resultat=false;
				break;
			}
		}
		return resultat;
	}
	
	

}
