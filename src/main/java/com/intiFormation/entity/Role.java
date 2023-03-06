package com.intiFormation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nom_role;
	@OneToOne
	@JoinColumn(name="id_utilisateur")
	private Utilisateur utilisateur;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom_role() {
		return nom_role;
	}
	public void setNom_role(String nom_role) {
		this.nom_role = nom_role;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
