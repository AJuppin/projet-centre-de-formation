package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.intiFormation.entity.Personne;

@Service
public interface IPersonneService {

	
	public void inserer(Personne p);
	public void supp(int id);
	public void modif(Personne p);
	public Optional<Personne> chercherUn(int id);
	public List<Personne> chercherPersonnes();
	
	
}
