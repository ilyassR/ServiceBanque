package com.m2i.banque.entities;

import java.time.Instant;
import java.util.Collection;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Type_Compte" , discriminatorType = DiscriminatorType.STRING, length=2)
public abstract class Compte {
	
	@Id
	@GeneratedValue
	private String numCompte;
	
	private Instant dateCreation;
	
	private double solde;
	
	@OneToMany(mappedBy="compte")
	private Collection<Operation> operations;
	
	@ManyToOne
	@JoinColumn(name="NUM_EMP")
	private Employe employe;
	
	@ManyToOne
	@JoinColumn(name="CODE_CLI")
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

	public Collection<Operation> getOperations() {
		return operations;
	}

	public void setOperations(Collection<Operation> operations) {
		this.operations = operations;
	}
	
}
