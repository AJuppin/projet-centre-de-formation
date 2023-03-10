package com.intiFormation.service;

import java.util.List;

import com.intiFormation.entity.Historique;

public interface IhistoriqueService {
	
	public void ajouter(Historique h);
	
	public List<Historique>selectall();
	
	public void suppr(int id);
	
	public Historique selectById(int id);
	
	public List<Historique> historiquesByIdPersonne(int id);

}
