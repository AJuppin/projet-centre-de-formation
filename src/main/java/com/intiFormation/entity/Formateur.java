package com.intiFormation.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Formateur extends Utilisateur {
	

	@OneToMany (mappedBy="formateur")
	@JsonIgnore
	private List<Formation> formations;

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	
	public Formateur() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


}
