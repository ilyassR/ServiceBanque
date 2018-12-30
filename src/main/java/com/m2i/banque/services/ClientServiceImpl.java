package com.m2i.banque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.banque.models.Client;
import com.m2i.banque.repositories.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public Client getClientByCodeClient(Long codeClient) {
		return clientRepository.findByCodeClient(codeClient);
	}

}
