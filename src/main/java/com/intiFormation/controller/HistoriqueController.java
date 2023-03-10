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
import com.intiFormation.service.IhistoriqueService;

@RestController
@RequestMapping("/api")
@CrossOrigin("http://localhost:4200")
public class HistoriqueController {
	
	@Autowired
	private IhistoriqueService ihistoriqueService;
	
	
	@GetMapping("/historiques")
	public List<Historique> selectAll()
	{
		List<Historique> historiques=ihistoriqueService.selectall();
		return historiques;
	}
	
	@GetMapping("/historiques/{id}")
	public Historique selectById(@PathVariable("id") int id)
	{
		Historique historique=ihistoriqueService.selectById(id);
		return historique;
	}
	
	@GetMapping("/historiquesByIdPersonne/{id}")
	public List<Historique> selectHistoriqueByIdPersonne(@PathVariable("id") int id)
	{
		List<Historique> historiques=ihistoriqueService.historiquesByIdPersonne(id);
		return historiques;
	}
	
	
	
	
	@PostMapping("/historiques")
	public void ajouter(@RequestBody Historique h)
	{
		ihistoriqueService.ajouter(h);
	}
	
	@DeleteMapping("/historiques/{id}")
	public void supprimer (@PathVariable("id") int id)
	{
		ihistoriqueService.suppr(id);
	}
	
	@PutMapping("/historiques")
	public void modifier(@RequestBody Historique h)
	{
		ihistoriqueService.ajouter(h);
	}
	
	

}
