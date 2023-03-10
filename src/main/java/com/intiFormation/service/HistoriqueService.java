package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.HistoriqueDao;
import com.intiFormation.dao.PersonneDao;
import com.intiFormation.entity.Historique;
import com.intiFormation.entity.Utilisateur;


@Service
public class HistoriqueService implements IhistoriqueService {
	
	
	@Autowired
	private HistoriqueDao historiqueDao;
	
	@Autowired
	private PersonneDao personneDao;
	
	public void ajouter(Historique h)
	{
		historiqueDao.save(h);
	}
	
	public List<Historique>selectall()
	{
		return historiqueDao.findAll();
	}
	
	
	
	
	
	
	
	
	
	
	
	public void suppr(int id)
	{
		historiqueDao.deleteById(id);
	}
	
	

	
	
	
	
	
	
	
	
	
	
	public Historique selectById(int id)
	{
		return historiqueDao.findById(id).get();
	}
	
	public List<Historique> historiquesByIdPersonne(int id)
	{
		return historiqueDao.findByPersonne_Id(id);
	}

}
