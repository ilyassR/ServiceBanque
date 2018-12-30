package com.m2i.banque.domaines;

import java.time.Instant;
import java.util.Collection;

import com.m2i.banque.models.Client;
import com.m2i.banque.models.Employe;
import com.m2i.banque.models.Operation;

public class CompteCourantDTO extends CompteDTO {
	
	private double decouvert;

	public CompteCourantDTO(String numCompte, 
			Instant dateCreation, 
			double solde, 
			Collection<Operation> operations,
			Employe employe, 
			Client client,
			double decouvert) {
		super(numCompte, dateCreation, solde, operations, employe, client);
		this.decouvert = decouvert;
	}
	
	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
