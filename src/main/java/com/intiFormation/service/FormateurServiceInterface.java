package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Formateur;

public interface FormateurServiceInterface {
	
	
	public List<Formateur> afficherAllFormateur();
	public Optional<Formateur> selectFormateurById(int id);
	public Optional<Formateur> selectFormateurByNom(String nom);
	public void ajouterModifierFormateur(Formateur f);
	public void supprimerFormateur(int id);

}
