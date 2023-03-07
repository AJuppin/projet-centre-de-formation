package com.intiFormation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intiFormation.dao.FormateurDao;
import com.intiFormation.entity.Formateur;
import com.intiFormation.service.FormateurServiceInterface;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class FormateurController {
	
	@Autowired
	private FormateurServiceInterface formateurService;
	
	
	//afficher tous les formateurs
	@GetMapping("/formateurs")
	public List<Formateur> getAllFormateur()
	{
		List<Formateur> listeF=formateurService.afficherAllFormateur();
		return listeF;
	}
	
	
	
	//chercher un formateur avec son id
	@GetMapping("/formateurs/{id}")
	public Formateur selectFormateur(@PathVariable ("id") int id)
	{
		Formateur f=formateurService.selectFormateurById(id).get();
		return f;
	}
	
	
	
	//chercher un formateur avec son nom
	@GetMapping("/formateursParNom/{nom}")
	public Formateur selectFormateur(@PathVariable ("nom") String nom)
	{
		Formateur f=formateurService.selectFormateurByNom(nom).get();
		return f;
	}
	
	
	//ajouter un formateur
	@PostMapping("/formateurs")
	public void addFormateur(@RequestBody Formateur f)
	{
		formateurService.ajouterModifierFormateur(f);
	}
	
	
	//modifier un formateur
	@PutMapping("/formateurs")
	public void modifFormateur(@RequestBody Formateur f)
	{
		formateurService.ajouterModifierFormateur(f);
	}
	
	
	
	//supprimer un formateur
	@DeleteMapping("/formateurs/{id}")
	public void supprimerFormateur(@PathVariable ("id") int id)
	{
		formateurService.supprimerFormateur(id);
	}
	
	
	
	
	
	//@RequestMapping("/test")
	/*public void test()
	{
		System.out.println("test");
		Formateur f = new Formateur();
		f.setAge(20);
		f.setEmail("test");
		f.setNom("bob");
		f.setPassword("123");
		f.setUsername("bobUsername");
		
	Formateur f=fdao.findByNom("bob");
		System.out.println(f.getAge());
		System.out.println(f.getUsername());
	}*/

}
