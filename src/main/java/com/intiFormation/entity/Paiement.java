package com.intiFormation.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Paiement {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int montant;
	
	@ManyToOne
	@JoinColumn(name="id_participant")
	private Participant participant;
	
	@ManyToMany
	@JoinTable(name = "paiement_formation",
	joinColumns = {@JoinColumn(name = "id_paiement")},
	inverseJoinColumns = {@JoinColumn(name = "id_formation")})
	private List<Formation> formations;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMontant() {
		return montant;
	}

	public void setMontant(int montant) {
		this.montant = montant;
	}

	public Participant getParticipant() {
		return participant;
	}

	public void setParticipant(Participant participant) {
		this.participant = participant;
	}

	public List<Formation> getFormations() {
		return formations;
	}

	public void setFormations(List<Formation> formations) {
		this.formations = formations;
	}

	public Paiement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
