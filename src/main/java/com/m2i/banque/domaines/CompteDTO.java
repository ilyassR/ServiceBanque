package com.m2i.banque.domaines;

import java.time.Instant;
import java.util.Collection;

import javax.validation.constraints.NotNull;

import com.m2i.banque.models.Client;
import com.m2i.banque.models.Employe;
import com.m2i.banque.models.Operation;

public class CompteDTO {
	
	@NotNull
	private String numCompte;
	
	private Instant dateCreation;
	
	private double solde;
	
	private Collection<Operation> operations;
	
	private Employe employe;
	
	private Client client;

	public CompteDTO(String numCompte, Instant dateCreation, double solde, Collection<Operation> operations,
			Employe employe, Client client) {
		super();
		this.numCompte = numCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.operations = operations;
		this.employe = employe;
		this.client = client;
	}

	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

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

	public Collection<Operation> getOperations() {
		return operations;
	}

	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
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
