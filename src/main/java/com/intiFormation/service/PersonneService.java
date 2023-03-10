package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.HistoriqueDao;
import com.intiFormation.dao.PersonneDao;
import com.intiFormation.dao.RdvDao;
import com.intiFormation.entity.Historique;
import com.intiFormation.entity.Personne;
import com.intiFormation.entity.Rdv;


@Service
public class PersonneService implements IPersonneService {


	@Autowired
	PersonneDao personneDao;
	
	@Autowired
	HistoriqueDao historiqueDao;
	
	@Autowired
	RdvDao rdvDao;
	


	public void inserer(Personne p)
	{
		personneDao.save(p);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void supp(int id)
	{	
		List<Historique> historiques=historiqueDao.findByPersonne_Id(id);
		List<Rdv> rdvs=rdvDao.findByPersonne_Id(id);
		
		for(int i=0;i<historiques.size();i++)
	    {
	    	 Historique h=historiques.get(i);
	    	 historiqueDao.delete(h);
	    }
		
		for(int i=0;i<rdvs.size();i++)
	    {
	    	 Rdv r=rdvs.get(i);
	    	 rdvDao.delete(r);
	    }
		
		personneDao.deleteById(id);
	}
	
	

	
	
	
	
	public void modif(Personne p)
	{
		personneDao.save(p);
	}
	
	public Optional<Personne> chercherUn(int id)
	{
		
		Optional<Personne> opt= personneDao.findById(id);
		return opt;
		
	}
	
	public List<Personne> chercherPersonnes()
	{
		return personneDao.findAll();
	}
	
	
}
