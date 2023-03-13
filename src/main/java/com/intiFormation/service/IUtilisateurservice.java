package com.intiFormation.service;

import java.util.List;

import com.intiFormation.entity.Utilisateur;

public interface IUtilisateurservice {
	
	public Utilisateur chercherParUsername(String username);
	public void ajouter(Utilisateur u);
	public boolean verifierUsername(Utilisateur u);
	public List<Utilisateur>selectAll();
	public void supp(int id);

}
