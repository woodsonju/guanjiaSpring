package fr.dawan.guanjia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import fr.dawan.guanjia.entities.Prestataire;

/**
 * Quand on crée un prestataire dans la base de données
 * On crée directement son adresse
 */
public class PrestataireDao extends GenericDao{
	
	@PersistenceContext
	protected EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public Prestataire findByEmail(String email) {
		List<Prestataire> prestataires = em.createQuery("FROM Prestataire p WHERE p.email= :email")
			.setParameter("email", email)
			.getResultList();
		Prestataire p= null;
		if(prestataires!=null && prestataires.size()>0)
			p = prestataires.get(0);	
		return p;
	}
	
	
}
