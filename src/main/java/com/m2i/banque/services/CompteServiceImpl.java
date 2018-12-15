package com.m2i.banque.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.m2i.banque.repositories.CompteRepository;

@Service
public class CompteServiceImpl implements CompteService {
	
	@Autowired
	CompteRepository compteRepository;

}
