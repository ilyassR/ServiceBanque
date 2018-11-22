package com.m2i.banque.entities;

import java.time.Instant;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity @Inheritance(strategy = InheritanceType.SINGLE_TABLE) @DiscriminatorColumn(name="Type_Compte")
public abstract class Compte {
	
	@Id
	@GeneratedValue
	private String numCompte;
	
	private Instant dateCreation;
	
	private double solde;
	
	@ManyToOne
	private Employe employe;
	
	@ManyToOne
	private Client client;

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

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}
