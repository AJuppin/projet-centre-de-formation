package com.intiFormation.service;

import java.util.List;

import com.intiFormation.entity.Paiement;

public interface IpaiementService {
	
	public void ajouter(Paiement p);
	
	public List<Paiement>selectall();
	
	public void suppr(int id);
	
	public Paiement selectById(int id);

}
