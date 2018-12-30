/**
 * 
 */
package com.m2i.banque.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.m2i.banque.models.Operation;

/**
 * @author IlyassRAHMOUNE
 *
 */
@Repository
public interface OperationRepository extends JpaRepository<Operation, Long> {
	
	@EntityGraph(attributePaths = {"compte"})
	@Query("Select op from Operation op where op.dateOperation BETWEEN :start and :end and op.compte.numCompte= :numCompte")
	List<Operation> findOperationsByDateAndCompte(Long numCompte, Date start, Date end);

}