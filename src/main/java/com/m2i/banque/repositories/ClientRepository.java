package com.m2i.banque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m2i.banque.models.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
	
	public Client findByCodeClient(Long id);

}
