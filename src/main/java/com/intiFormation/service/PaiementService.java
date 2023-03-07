package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.PaiementDao;
import com.intiFormation.entity.Paiement;

@Service
public class PaiementService implements IpaiementService {
	
	@Autowired
	private PaiementDao paiementDao;
	
	public void ajouter(Paiement p)
	{
		paiementDao.save(p);
	}
	
	public List<Paiement>selectall()
	{
		return paiementDao.findAll();
	}
	
	public void suppr(int id)
	{
		paiementDao.deleteById(id);
	}
	
	public Paiement selectById(int id)
	{
		return paiementDao.findById(id).get();
	}

}
