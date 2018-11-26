package com.m2i.banque.ResponseDTO;

import java.time.Instant;

public class ReleveeBancaireDTO {
	
	private Instant dateOperation;
	
	private String typeOperation;
	
	private double montant;

	public Instant getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Instant dateOperation) {
		this.dateOperation = dateOperation;
	}

	public String getTypeOperation() {
		return typeOperation;
	}

	public void setTypeOperation(String typeOperation) {
		this.typeOperation = typeOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}
	
}
