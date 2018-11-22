package com.m2i.banque.entities;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Compte {
	
	@Id
	@GeneratedValue
	private String numCompte;
	
	private Instant dateCreation;
	
	private double solde;

	public Instant getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Instant dateCreation) {
		this.dateCreation = dateCreation;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

}
