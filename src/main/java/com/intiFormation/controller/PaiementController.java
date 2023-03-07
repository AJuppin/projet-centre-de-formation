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


import com.intiFormation.entity.Paiement;
import com.intiFormation.service.IpaiementService;


@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class PaiementController {
	
	
	@Autowired
	private IpaiementService ipaiementService;
	
	
	@GetMapping("/paiements")
	public List<Paiement> selectAll()
	{
		List<Paiement> paiements=ipaiementService.selectall();
		return paiements;
	}
	
	@GetMapping("/paiements/{id}")
	public Paiement selectById(@PathVariable("id") int id)
	{
		Paiement  paiement=ipaiementService.selectById(id);
		return paiement ;
	}
	
	@PostMapping("/paiements")
	public void ajouter(@RequestBody Paiement p)
	{
		ipaiementService.ajouter(p);
	}
	
	@DeleteMapping("/paiements/{id}")
	public void supprimer (@PathVariable("id") int id)
	{
		ipaiementService.suppr(id);
	}
	
	@PutMapping("/paiements")
	public void modifier(@RequestBody Paiement p)
	{
		ipaiementService.ajouter(p);
	}
	

}
