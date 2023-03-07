package com.intiFormation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiFormation.entity.Role;
import com.intiFormation.service.RoleService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class RoleController {


	@Autowired
	private RoleService roleService;
	
	@GetMapping("/roles")
	public List<Role> getAll()
	
	{
		List<Role> role=roleService.chercherRole();
		
		return role;
	}
	
	@PostMapping("/roles")
	public void ajouter(@RequestBody Role r)
	{
		roleService.inserer(r);
	}
	
	@DeleteMapping("/roles/{id}")
	public void supprimer(@PathVariable("id")int id)
	{
		
		
		roleService.supp(id);
		
	}
	
	@PutMapping("/roles")
	public void modifier(@RequestBody Role r)
	{
		
		roleService.inserer(r);
	}
	
	@GetMapping("/roles/{id}")
	public Role selectByid(@PathVariable("id") int id)
	{
		Role role=roleService.chercherUn(id);
		
		return role;
	}
	
	
	
	
	
	
}
