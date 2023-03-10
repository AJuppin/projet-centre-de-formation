package com.intiFormation.service;

import java.util.List;
import java.util.Optional;

import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intiFormation.dao.ParticipantDao;
import com.intiFormation.entity.Participant;

@Service
public class ParticipantService implements IParticipantService {

	@Autowired
	ParticipantDao participantDao;
	
	public void inserer(Participant p)
	{
		participantDao.save(p);	
	}
	
	public void supp(int id)
	{
		participantDao.deleteById(id);
	}
	
	public void modif(Participant p)
	{
		participantDao.save(p);
		
	}
	public List<Participant> SelectAll()
	{
		return participantDao.findAll();
	}
	
     public Participant chercherUn(int id)
{
	return participantDao.findById(id).get();
	
}	
    public void modifierPersonneParticipant(int id)
    {
    	participantDao.modifierPersonneParticipant(id);
    }
    
    public void modifierPersonneUtilisateur(int id)
    {
    	participantDao.modifierPersonneUtilisateur(id);
    }

}
