package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.PersonneDao;
import com.intiFormation.entity.Personne;

@Service
public class PersonneService implements IPersonneService {


	@Autowired
	PersonneDao personneDao;
	


	public void inserer(Personne p)
	{
		personneDao.save(p);
	}
	
	public void supp(int id)
	{
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
