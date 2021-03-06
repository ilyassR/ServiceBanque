package com.m2i.banque.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.m2i.banque.enums.EnumGroupeName;

@Entity
public class Groupe {
	
	@Id
	@GeneratedValue
	private Long numGroupe;
	
	@Enumerated(EnumType.STRING)
	private EnumGroupeName nomGroupe;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "groupes")
	//@OnDelete(action=OnDeleteAction.CASCADE)
	private Collection<Employe> employes;

	public EnumGroupeName getNomGroupe() {
		return nomGroupe;
	}

	public void setNomGroupe(EnumGroupeName nomGroupe) {
		this.nomGroupe = nomGroupe;
	}
	
	public Long getNumGroupe() {
		return numGroupe;
	}

	public Collection<Employe> getEmployes() {
		return employes;
	}

	public void setEmployes(Collection<Employe> employes) {
		this.employes = employes;
	}

}
