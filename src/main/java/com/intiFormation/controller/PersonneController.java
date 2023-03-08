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

import com.intiFormation.entity.Historique;
import com.intiFormation.entity.Personne;
import com.intiFormation.entity.Rdv;
import com.intiFormation.service.IPersonneService;


@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class PersonneController {

	
	@Autowired
	private IPersonneService personneService;
	
	@GetMapping("/personnes")
	public List<Personne> getAll()
	
	{
		List<Personne> personne=personneService.chercherPersonnes();
		
		return personne;
	}
	
	@PostMapping("/personnes")
	public void ajouter(@RequestBody Personne p)
	{
		personneService.inserer(p);
	}
	
	@DeleteMapping("/personnes/{id}")
	public void supprimer(@PathVariable("id")int id)
	{
		personneService.supp(id);
		
	}
	
	@PutMapping("/personnes")
	public void modifier(@RequestBody Personne p)
	{
		personneService.inserer(p);
	}
	
	@GetMapping("/personnes/{id}")
	public Personne selectByid(@PathVariable("id") int id)
	{
		Personne personne=personneService.chercherUn(id).get();
		return personne;
	}
	
	/*@GetMapping("/historiqueParPersonne/{id}")
	public Historique chercherHistorique(@PathVariable("id")int id)
	{
		
		Personne personne=personneService.chercherUn(id).get();
		
		Historique historique=personne.getHistorique();
		
		return historique;
	}*/
	
	@GetMapping("/rdvParPersonne/{id}")
	public List<Rdv> chercherRdv(@PathVariable("id")int id)
	{
		
		Personne personne=personneService.chercherUn(id).get();
		
		List<Rdv> rdv=personne.getRdvs();
		
		return rdv;
	}
	
}
