package com.intiFormation.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.intiFormation.dao.RoleDao;
import com.intiFormation.dao.UtilisateurDao;

import com.intiFormation.entity.Role;
import com.intiFormation.entity.Utilisateur;

@Service
public class RoleService implements IRoleService{
	
	@Autowired
	private RoleDao roleDao;

	@Autowired
	private UtilisateurDao utilisateurDao;


	public void inserer(Role r)
	{
		roleDao.save(r);
	}
	
	public void supp(int id)
	{
		
		List<Utilisateur>utilisateur=utilisateurDao.findByRole_Id(id);
		
	    for(int i=0;i<utilisateur.size();i++)
	    {
	    	 Utilisateur u=utilisateur.get(i);
	    	 u.setRole(null); 
	    	 
	    	 utilisateurDao.save(u);
	    
	    }
	
		roleDao.deleteById(id);
	}
	
	public void modif(Role r)
	{
		roleDao.save(r);
	}
	
	public Role chercherUn(int id)
	{
		
		
		
		Role role= roleDao.findById(id).get();
		return role;
		
	}
	
	public List<Role> chercherRole()
	{
		return roleDao.findAll();
	}
	
	

}
