package com.m2i.banque.entities;

import javax.persistence.Entity;

@Entity
public class CompteCourant extends Compte {
	
	private double decouvert;

	public double getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

}
