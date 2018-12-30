package com.m2i.banque.builders;

import java.time.Instant;
import java.util.Collection;

import com.m2i.banque.domaines.CompteCourantDTO;
import com.m2i.banque.domaines.CompteEpargneDTO;
import com.m2i.banque.models.Client;
import com.m2i.banque.models.Employe;
import com.m2i.banque.models.Operation;

public class CompteDTOBuilder {

	public String numCompte;
	
	public Instant dateCreation;
	
	public double solde;
	
	public Collection<Operation> operations;
	
	public Employe employe;
	
	public Client client;
	
	public double decouvert;
	
	public double taux;
	
	public static CompteDTOBuilder aCompteDTO() {
		return new CompteDTOBuilder();
	}
	
	public CompteDTOBuilder withNumCompte(String numCompte) {
		this.numCompte = numCompte;
		return this;
	}
	
	public CompteDTOBuilder withDateCreation(Instant dateCreation) {
		this.dateCreation = dateCreation;
		return this;
	}
	
	public CompteDTOBuilder withSolde(double solde) {
		this.solde = solde;
		return this;
	}
	
	public CompteDTOBuilder withOperations(Collection<Operation> operations) {
		this.operations = operations;
		return this;
	}
	
	public CompteDTOBuilder withEmploye(Employe employe) {
		this.employe = employe;
		return this;
	}
	
	public CompteDTOBuilder withClient(Client client) {
		this.client = client;
		return this;
	}
	
	public CompteDTOBuilder withDecouvert(double decouvert) {
		this.decouvert = decouvert;
		return this;
	}
	
	public CompteDTOBuilder withTaux(double taux) {
		this.taux = taux;
		return this;
	}
	
	
	public CompteCourantDTO buildCompteCourant() {
		return new CompteCourantDTO(numCompte, dateCreation, decouvert, operations, employe, client, decouvert);
	}
	
	public CompteEpargneDTO buildCompteEpargne() {
		return new CompteEpargneDTO(numCompte, dateCreation, decouvert, operations, employe, client, taux);
	}
	
}
