package com.intiFormation.dao;



import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.intiFormation.entity.Participant;

public interface ParticipantDao extends JpaRepository<Participant, Integer> {
	
	@Modifying
	@Transactional
	@Query(value = "insert into participant (id) values (:idpar)",nativeQuery = true)
	 public void modifierPersonneParticipant( @Param("idpar") int id);
      
	@Modifying
	@Transactional
	@Query(value = "insert into utilisateur (id) values (:idpar)",nativeQuery = true)
	 public void modifierPersonneUtilisateur( @Param("idpar") int id);

}
