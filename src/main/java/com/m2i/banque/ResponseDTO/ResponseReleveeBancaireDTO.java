package com.m2i.banque.ResponseDTO;

import java.util.List;

public class ResponseReleveeBancaireDTO {
	
	private List<ReleveeBancaireDTO> releveeBancaire;
	
	private double soldeIntermediaire;

	public List<ReleveeBancaireDTO> getReleveeBancaire() {
		return releveeBancaire;
	}

	public void setReleveeBancaire(List<ReleveeBancaireDTO> releveeBancaire) {
		this.releveeBancaire = releveeBancaire;
	}

	public double getSoldeIntermediaire() {
		return soldeIntermediaire;
	}

	public void setSoldeIntermediaire(double soldeIntermediaire) {
		this.soldeIntermediaire = soldeIntermediaire;
	}

}
