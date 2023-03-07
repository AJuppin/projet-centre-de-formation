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


import com.intiFormation.entity.Rdv;
import com.intiFormation.service.IrdvService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class RdvController {
	
	
	@Autowired
	private IrdvService irdvService;
	
	
	@GetMapping("/rdvs")
	public List<Rdv> selectAll()
	{
		List<Rdv> rdvs=irdvService.selectall();
		return rdvs;
	}
	
	@GetMapping("/rdvs/{id}")
	public Rdv selectById(@PathVariable("id") int id)
	{
		Rdv rdv=irdvService.selectById(id);
		return rdv;
	}
	
	@PostMapping("/rdvs")
	public void ajouter(@RequestBody Rdv r)
	{
		irdvService.ajouter(r);
	}
	
	@DeleteMapping("/rdvs/{id}")
	public void supprimer (@PathVariable("id") int id)
	{
		irdvService.suppr(id);
	}
	
	@PutMapping("/rdvs")
	public void modifier(@RequestBody Rdv r)
	{
		irdvService.ajouter(r);
	}

}
