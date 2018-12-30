package com.m2i.banque.domaines;

import java.util.Collection;

import javax.validation.constraints.NotNull;

import com.m2i.banque.models.Compte;

public class ClientDTO {
	
	@NotNull
	private Long codeClient;
	
	@NotNull
	private String nomClient;
	
	private Collection<Compte> comptes;
	
	public ClientDTO(Long codeClient, String nomClient, Collection<Compte> comptes) {
		super();
		this.codeClient = codeClient;
		this.nomClient = nomClient;
		this.comptes = comptes;
	}
	
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
