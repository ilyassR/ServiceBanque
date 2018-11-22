package com.m2i.banque.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
public class Employe {
	
	@Id
	@GeneratedValue
	private Long codeEmploye;
	
	private String nomEmploye;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@OnDelete(action=OnDeleteAction.CASCADE)
	private Collection<Groupe> groupes;
	
	@OneToMany(mappedBy = "employe")
	private Collection<Compte> comptes;
	
	@ManyToOne
	@JoinTable(name = "supHierarchique_employe")
	private Employe supHierarchique;
	
	public String getNomEmploye() {
		return nomEmploye;
	}

	public void setNomEmploye(String nomEmploye) {
		this.nomEmploye = nomEmploye;
	}

	public Long getCodeEmploye() {
		return codeEmploye;
	}

	public Employe getSupHierarchique() {
		return supHierarchique;
	}

	public void setSupHierarchique(Employe supHierarchique) {
		this.supHierarchique = supHierarchique;
	}

	public Collection<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(Collection<Groupe> groupes) {
		this.groupes = groupes;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	
}
