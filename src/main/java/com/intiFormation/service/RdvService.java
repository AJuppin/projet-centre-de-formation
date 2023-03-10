package com.intiFormation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.intiFormation.dao.RdvDao;

import com.intiFormation.entity.Rdv;

@Service
public class RdvService implements IrdvService {
	
	
	@Autowired
	private RdvDao rdvDao;
	
	public void ajouter(Rdv r)
	{
		rdvDao.save(r);
	}
	
	public List<Rdv>selectall()
	{
		return rdvDao.findAll();
	}
	
	public void suppr(int id)
	{
		rdvDao.deleteById(id);
	}
	
	public Rdv selectById(int id)
	{
		return rdvDao.findById(id).get();
	}
	
	public List<Rdv> selectRdvByIdPersonne(int id)
	{
		return rdvDao.findByPersonne_Id(id);
	}

}
