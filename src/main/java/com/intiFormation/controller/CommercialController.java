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

import com.intiFormation.entity.Commercial;
import com.intiFormation.service.CommercialServiceInterface;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class CommercialController {
	
	@Autowired
	private CommercialServiceInterface commercialService;
	
	//afficher tous les commerciaux
	@GetMapping("/commerciaux")
	public List<Commercial> getAllCommercial()
	{
		List<Commercial> listeCommercial=commercialService.afficherAllCommercial();
		return listeCommercial;
	}
	
	
	//chercher un commercial par id
	@GetMapping("/commerciaux/{id}")
	public Commercial getCommercialById(@PathVariable ("id") int id)
	{
		Commercial comm=commercialService.selectCommercial(id).get();
		return comm;
	}
	
	
	
	//ajouter un commercial
	@PostMapping("/commerciaux")
	public void addCommercial(@RequestBody Commercial comm)
	{
		commercialService.ajouterModifierCommercial(comm);
	}
	
	
	//modifier un commercial
	@PutMapping("/commerciaux")
	public void modifierCommercial(@RequestBody Commercial comm)
	{
		commercialService.ajouterModifierCommercial(comm);
	}
	
	//supprimer un commercial
	@DeleteMapping("/commerciaux/{id}")
	public void supprimerCommercial(@PathVariable ("id") int id)
	{
		commercialService.supprimerCommercial(id);
	}
	
}
