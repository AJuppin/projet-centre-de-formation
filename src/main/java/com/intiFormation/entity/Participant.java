package com.intiFormation.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Participant extends Utilisateur{
	
	@OneToMany (mappedBy="participant")
	@JsonIgnore
	private List<Paiement> paiements;
	@ManyToMany
	@JoinTable(name = "participant_formation",
	joinColumns = {@JoinColumn(name = "id_participant")},
	inverseJoinColumns = {@JoinColumn(name = "id_formation")})
	private List<Formation> formations;
	
	
	
	public List<Paiement> getPaiements() {
		return paiements;
	}
	public void setPaiements(List<Paiement> paiements) {
		this.paiements = paiements;
	}
	public List<Formation> getFormations() {
		return formations;
	}
	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}
	public Participant() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	

}
