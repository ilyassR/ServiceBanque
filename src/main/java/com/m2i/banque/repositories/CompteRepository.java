/**
 * 
 */
package com.m2i.banque.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.m2i.banque.entities.Compte;

/**
 * @author IlyassRAHMOUNE
 *
 */
@Repository
public interface CompteRepository extends JpaRepository<Compte, Long> {
	
}
