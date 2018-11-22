package com.m2i.banque.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Client {
	
	@Id
	@GeneratedValue
	private Long code;
	
	private String nom;

	public Long getCode() {
		return code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	} 
	
}
