package com.intiFormation.entity;



import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Historique {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String heure;
	 @Temporal(TemporalType.DATE)
	 @JsonFormat(pattern = "yyyy-MM-dd")
	 private Date date;
	 private int statut;
	 private String commentaire;
	 @OneToOne
	 @JoinColumn(name="id_personne")
	 private Personne personne;
	 @ManyToOne
	 @JoinColumn(name="id_commercial")
	 private Commercial commercial;
	 
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getStatut() {
		return statut;
	}
	public void setStatut(int statut) {
		this.statut = statut;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public Commercial getCommercial() {
		return commercial;
	}
	public void setCommercial(Commercial commercial) {
		this.commercial = commercial;
	}
	public Historique() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
	 

}
