package com.m2i.banque.entities;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTS")
public class Client {
	
	@Id
	@GeneratedValue
	/*code client non modiafialble et non null*/
	@Column(name="CODE_CLI", updatable=false, nullable=false)
	private Long codeClient;
	
	@Column(name="NOM_CLI")
	private String nomClient;
	
	@OneToMany(mappedBy = "client", fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	private Collection<Compte> comptes;

	public String getNomClient() {
		return nomClient;
	}

	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}

	public Long getCodeClient() {
		return codeClient;
	}

	public Collection<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	
}
