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

import com.intiFormation.entity.Formation;
import com.intiFormation.entity.Participant;
import com.intiFormation.service.IParticipantService;



@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class ParticipantController {


	@Autowired
	private IParticipantService participantService;
	
	@GetMapping("/participants")
	public List<Participant> getAll()
	
	{
		List<Participant> participant=participantService.SelectAll();
		
		return participant;
	}
	
	
	
	@PostMapping("/participants")
	public void ajouter(@RequestBody Participant p)
	{
		participantService.inserer(p);
	}
	
	
	
	
	
	
	@PostMapping("/modifierPersonneParticipants/{id}")
	public void modifierPersonneParticipant(@PathVariable("id")int id)
	{
		participantService.modifierPersonneParticipant(id);
	}
	
	
	@PostMapping("/modifierPersonneUtilisateurs/{id}")
	public void modifierPersonneUtilisateur(@PathVariable("id")int id)
	{
		participantService.modifierPersonneUtilisateur(id);
	}
	
	
	
	
	
	
	@DeleteMapping("/participants/{id}")
	public void supprimer(@PathVariable("id")int id)
	{
		participantService.supp(id);
		
	}
	
	@PutMapping("/participants")
	public void modifier(@RequestBody Participant p)
	{
		participantService.inserer(p);
	}
	
	@GetMapping("/participants/{id}")
	public Participant selectByid(@PathVariable("id") int id)
	{
		Participant participant=participantService.chercherUn(id);
		return participant;
	}
	
	@GetMapping("/FormationParParticipant/{id}")
	public List<Formation> chercherFormation(@PathVariable("id")int id)
	{
		
		Participant participant=participantService.chercherUn(id);
		
		List<Formation> formation=participant.getFormations();
		
		return formation;
	}

	
}
