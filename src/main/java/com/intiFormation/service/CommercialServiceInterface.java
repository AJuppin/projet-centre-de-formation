package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import com.intiFormation.entity.Commercial;

public interface CommercialServiceInterface {
	
	public List<Commercial> afficherAllCommercial();
	public Optional<Commercial>  selectCommercial(int id);
	public void ajouterModifierCommercial(Commercial commercial);
	public void supprimerCommercial(int id);

}
