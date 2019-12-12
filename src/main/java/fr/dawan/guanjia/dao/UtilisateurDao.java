package fr.dawan.guanjia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import fr.dawan.guanjia.entities.Utilisateur;

public class UtilisateurDao extends GenericDao {
	
	@PersistenceContext
	protected EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public Utilisateur findByEmail(String email) {
		List<Utilisateur> utilisateurs = em.createQuery("FROM Utilisateur u WHERE u.email= :email")
			.setParameter("email", email)
			.getResultList();
		Utilisateur u = null;
		if(utilisateurs!=null && utilisateurs.size()>0)
			u = utilisateurs.get(0);	
		return u;
	}
	
	
}
