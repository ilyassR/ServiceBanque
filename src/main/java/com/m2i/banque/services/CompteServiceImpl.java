package com.m2i.banque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.banque.builders.CompteDTOBuilder;
import com.m2i.banque.domaines.CompteCourantDTO;
import com.m2i.banque.domaines.CompteEpargneDTO;
import com.m2i.banque.repositories.CompteRepository;

@Service
public class CompteServiceImpl implements CompteService {
	
	@Autowired
	CompteRepository compteRepository;
	
	public CompteCourantDTO creerCompteCourant() {
		
		CompteCourantDTO compteCourant = CompteDTOBuilder.aCompteDTO()
				.withNumCompte("")
				.withDecouvert(2)
				.buildCompteCourant();
		
		return compteCourant;
	}
	
	public CompteEpargneDTO creerCompteEpargne() {
		
		CompteEpargneDTO compteEpargne = CompteDTOBuilder.aCompteDTO()
				.withNumCompte("")
				.withTaux(2.5)
				.buildCompteEpargne();
		
		return compteEpargne;
		
	}

}
