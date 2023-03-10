package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.intiFormation.entity.Participant;

@Service
public interface IParticipantService {

	
	
     public void inserer(Participant p);
	
	public void supp(int id);
	
	public void modif(Participant p);
	
	public List<Participant> SelectAll();
	
	public Participant chercherUn(int id);
	
	 public void modifierPersonneParticipant(int id);
	 
	 public void modifierPersonneUtilisateur(int id);
}
