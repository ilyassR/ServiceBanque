package com.m2i.banque.entities;

import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public abstract class Operation {
	
	@Id
	@GeneratedValue
	private Long  numOperation;
	
	private Instant dateOperation;
	
	private double montant;

	public Instant getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Instant dateOperation) {
		this.dateOperation = dateOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Long getNumOperation() {
		return numOperation;
	}

}
