package com.m2i.banque.domaines;

import java.time.Instant;
import java.util.Collection;

import com.m2i.banque.models.Client;
import com.m2i.banque.models.Employe;
import com.m2i.banque.models.Operation;

public class CompteEpargneDTO extends CompteDTO {
	
	private double taux;
	
	public CompteEpargneDTO(String numCompte, 
			Instant dateCreation, 
			double solde, 
			Collection<Operation> operations,
			Employe employe, 
			Client client,
			double taux) {
		super(numCompte, dateCreation, solde, operations, employe, client);
		this.taux = taux;
	}
	
	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}

}
