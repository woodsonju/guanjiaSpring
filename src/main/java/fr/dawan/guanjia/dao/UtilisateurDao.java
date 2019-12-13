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

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Utilisateur> findAllPagination(int start, int max) {
		List<Utilisateur> ls = em.createQuery("FROM Utilisateur u")
				               .setFirstResult(start)
				               .setMaxResults(max)
				               .getResultList();
		return ls;
	}

	
	public Long count() {
		Long nb = (Long) em.createQuery("SELECT COUNT(u.id) FROM Utilisateur u").getSingleResult();
		return nb;
	}
	
	
}
