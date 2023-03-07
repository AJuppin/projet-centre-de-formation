package com.intiFormation.service;

import java.util.List;

import com.intiFormation.entity.Rdv;

public interface IrdvService {
	

	public void ajouter(Rdv r);
	
	public List<Rdv>selectall();
	
	public void suppr(int id);
	
	public Rdv selectById(int id);
}
