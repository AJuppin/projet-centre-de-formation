package com.intiFormation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.intiFormation.entity.Personne;
import com.intiFormation.entity.Utilisateur;
import com.intiFormation.service.IUtilisateurservice;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class UtilisateurController {

	@Autowired
	
	private IUtilisateurservice utilisateurService;
	
	
	
	@GetMapping("/utilisateur")
	public List<Utilisateur> getAll()
	
	{
		List<Utilisateur> utilisateur=utilisateurService.selectAll();
		
		return utilisateur;
	}
	
	@PostMapping("/utilisateur")
	public void ajouter(@RequestBody Utilisateur u)
	{
		utilisateurService.ajouter(u);
	}
	
	

	
	@PutMapping("/utilisateur")
	public void modifier(@RequestBody Utilisateur u)
	{
		utilisateurService.ajouter(u);
	}
	
	
	
	
	
}
