package com.m2i.banque.services;

import com.m2i.banque.models.Client;

public interface ClientService {
	
	public Client getClientByCodeClient(Long codeClient);

}
