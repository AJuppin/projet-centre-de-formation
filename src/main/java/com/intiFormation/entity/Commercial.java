package com.intiFormation.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Commercial extends Utilisateur{
	
	@OneToMany (mappedBy="commercial")
	@JsonIgnore
	private List<Rdv> rdvsCommercial;
	@OneToMany(mappedBy="commercial")
	@JsonIgnore
	private List<Historique> historiquesCommercial;
	
	


	
	public List<Rdv> getRdvsCommercial() {
		return rdvsCommercial;
	}





	public void setRdvsCommercial(List<Rdv> rdvsCommercial) {
		this.rdvsCommercial = rdvsCommercial;
	}





	public List<Historique> getHistoriquesCommercial() {
		return historiquesCommercial;
	}





	public void setHistoriquesCommercial(List<Historique> historiquesCommercial) {
		this.historiquesCommercial = historiquesCommercial;
	}





	public Commercial() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
