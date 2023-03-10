package com.intiFormation.controller;

import java.util.List;
import java.util.Optional;

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

import com.intiFormation.entity.Formateur;
import com.intiFormation.entity.Formation;
import com.intiFormation.service.FormateurServiceInterface;
import com.intiFormation.service.FormationServiceInterface;

@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/api")
public class FormationController {
	
	
	@Autowired
	private FormationServiceInterface formationService;
	
	@Autowired
	private FormateurServiceInterface formateurService;
	
	//afficher tous les formations
		@GetMapping("/formations")
		public List<Formation> getAllFormation()
		{
			List<Formation> listeF=formationService.afficherAllFormation();
			return listeF;
		}
		
		
		
		//chercher une formation avec son id
		@GetMapping("/formations/{id}")
		public Formation selectFormation(@PathVariable ("id") int id)
		{
			Formation f=formationService.selectFormationById(id).get();
			return f;
		}
		
		
		
		//chercher un formation avec son nom
		@GetMapping("/formationsParNom/{nom}")
		public Formation selectFormation(@PathVariable ("nom") String nom)
		{
			Formation f=formationService.selectFormationByNom(nom).get();
			return f;
		}
		
		
		//ajouter un formateur
		@PostMapping("/formations")
		public void addFormation(@RequestBody Formation f)
		{
			formationService.ajouterModifierFormation(f);
		}
		
		
		//modifier un formateur
		@PutMapping("/formations")
		public void modifFormation(@RequestBody Formation f)
		{
			formationService.ajouterModifierFormation(f);
		}
		
		
		
		
		//supprimer un formateur
		@DeleteMapping("/formations/{id}")
		public void supprimerFormation(@PathVariable ("id") int id)
		{
			formationService.supprimerFormation(id);
		}

		//chercher la liste des formation par id formateur
				@GetMapping("/formationsParFormateurs/{id}")
				public List<Formation> afficherFormationParFormateur(@PathVariable("id") int id)
				{
					List<Formation> listFormation=null;
					Optional<Formateur> f=formateurService.selectFormateurById(id);
					listFormation=f.get().getFormations();
					formationService.afficherAllFormation();
					return listFormation;
				}
}
