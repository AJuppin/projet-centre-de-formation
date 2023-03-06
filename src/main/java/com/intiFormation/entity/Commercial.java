package com.intiFormation.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Commercial extends Utilisateur{
	
	@OneToMany (mappedBy="commercial")
	private List<Rdv> rdvs;
	@OneToMany(mappedBy="commercial")
	private List<Historique> historiques;
	
	


	public List<Historique> getHistoriques() {
		return historiques;
	}
	public void setHistoriques(List<Historique> historiques) {
		this.historiques = historiques;
	}

	
	
	public List<Rdv> getRdvs() {
		return rdvs;
	}
	public void setRdvs(List<Rdv> rdvs) {
		this.rdvs = rdvs;
	}
	public Commercial() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
