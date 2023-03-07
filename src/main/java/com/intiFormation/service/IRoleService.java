package com.intiFormation.service;

import java.util.List;


import com.intiFormation.entity.Role;

public interface IRoleService  {
	
	public void inserer(Role r);
	public void supp(int id);
	public void modif(Role r);
	public Role chercherUn(int id);
	public List<Role> chercherRole();
}
