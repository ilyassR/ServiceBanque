package com.m2i.banque.entities;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.m2i.banque.enums.EnumGroupeName;

@Entity
public class Groupe {
	
	@Id
	@GeneratedValue
	private Long numGroupe;
	
	@Enumerated(EnumType.STRING)
	private EnumGroupeName nomGroupe;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "groupes")
	@OnDelete(action=OnDeleteAction.CASCADE)
	@JoinTable(name = "groupe_employes",
            joinColumns = { @JoinColumn(name = "groupe_numGroupe") },
            inverseJoinColumns = { @JoinColumn(name = "employe_codeEmploye") })
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
