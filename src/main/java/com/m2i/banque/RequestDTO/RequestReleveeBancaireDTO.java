package com.m2i.banque.RequestDTO;

import java.time.Instant;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

public class RequestReleveeBancaireDTO {
	
	@NotNull
	@Length(min=2, max=2)
	private String typeCompte;
	
	@NotNull
	@DateTimeFormat
	private Instant dateStartDTO;
	
	@NotNull
	@DateTimeFormat
	private Instant dateEndDTO;

	public String getTypeCompte() {
		return typeCompte;
	}

	public void setTypeCompte(String typeCompte) {
		this.typeCompte = typeCompte;
	}

	public Instant getDateStartDTO() {
		return dateStartDTO;
	}

	public void setDateStartDTO(Instant dateStartDTO) {
		this.dateStartDTO = dateStartDTO;
	}

	public Instant getDateEndDTO() {
		return dateEndDTO;
	}

	public void setDateEndDTO(Instant dateEndDTO) {
		this.dateEndDTO = dateEndDTO;
	}

}
