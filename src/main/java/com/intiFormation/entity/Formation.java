package com.intiFormation.entity;


import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Formation {
	 
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	 private int id;
	 private String nom;
	 private int prix;
	 @Temporal(TemporalType.DATE)
	 @JsonFormat(pattern = "yyyy-MM-dd")
	 private Date date_debut;
	 @Temporal(TemporalType.DATE)
	 @JsonFormat(pattern = "yyyy-MM-dd")
	 private Date date_fin;
	 
	 @ManyToMany(mappedBy = "formations")
	 private List<Participant> participants;
	 
	 @ManyToOne
	 @JoinColumn(name="id_formateur")
	 private Formateur formateur;
	 
	 @ManyToMany(mappedBy = "formations")
	 private List<Paiement> paiements;
	 
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public List<Participant> getParticipants() {
		return participants;
	}
	public void setParticipants(List<Participant> participants) {
		this.participants = participants;
	}
	public Formateur getFormateur() {
		return formateur;
	}
	public void setFormateur(Formateur formateur) {
		this.formateur = formateur;
	}
	
	
	
	public List<Paiement> getPaiements() {
		return paiements;
	}
	public void setPaiements(List<Paiement> paiements) {
		this.paiements = paiements;
	}
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 

}
