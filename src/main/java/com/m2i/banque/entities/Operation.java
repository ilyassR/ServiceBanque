package com.m2i.banque.entities;

import java.time.Instant;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity @Inheritance(strategy = InheritanceType.SINGLE_TABLE) @DiscriminatorColumn(name="Type_Operation")
public abstract class Operation {
	
	@Id
	@GeneratedValue
	private Long  numOperation;
	
	private Instant dateOperation;
	
	private double montant;
	
	@ManyToOne
	private Employe employe;

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

	public Employe getEmploye() {
		return employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

}
