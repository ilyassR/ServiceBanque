package com.m2i.banque.builders;

import java.util.Collection;
import java.util.List;

import com.m2i.banque.domaines.ClientDTO;
import com.m2i.banque.models.Compte;

public class ClientDTOBuilder {
	
	private Long codeClient;
	
	private String nomClient;
	
	private Collection<Compte> comptes;
	
	public static ClientDTOBuilder aClient() {
		return new ClientDTOBuilder();
	}
	
	public ClientDTOBuilder withCodeClient(Long codeClient) {
		this.codeClient = codeClient;
		return this;
	}
	
	public ClientDTOBuilder withNomClient(String nomClient) {
		this.nomClient = nomClient;
		return this;
	}
	
	public ClientDTOBuilder withCompte(List<Compte> comptes) {
		this.comptes = comptes;
		return this;
	}
	
	public ClientDTO build() {
		return new ClientDTO(this.codeClient, this.nomClient, this.comptes);
	}

}
