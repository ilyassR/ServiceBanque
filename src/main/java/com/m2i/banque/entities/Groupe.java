package com.m2i.banque.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.m2i.banque.enums.EnumGroupeName;

@Entity
public class Groupe {
	
	@Id
	@GeneratedValue
	private Long numGroupe;
	
	private EnumGroupeName nomGroupe;

	public EnumGroupeName getNomGroupe() {
		return nomGroupe;
	}

	public void setNomGroupe(EnumGroupeName nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	
	public Long getNumGroupe() {
		return numGroupe;
	}

}
