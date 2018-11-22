package com.m2i.banque.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="clients")
public class Client {
	
	@Id
	@GeneratedValue
	/*code client non modiafialble et non null*/
	@Column(name="code_cli", updatable=false, nullable=false)
	private Long codeClient;
	
	private String nomClient;
	
	@OneToMany(mappedBy = "client")
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
