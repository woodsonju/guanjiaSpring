package fr.dawan.guanjia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import fr.dawan.guanjia.entities.Utilisateur;


public class UtilisateurDao {
	
	@PersistenceContext
	protected EntityManager em;
	
	@Transactional
	public Utilisateur create(Utilisateur utilisateur) {
		if(utilisateur != null && utilisateur.getId()==0) 
			em.persist(utilisateur);
		return utilisateur;
	}
	
	@Transactional
	public void update(Utilisateur utilisateur) {
		if(utilisateur.getId() > 0) 
			em.merge(utilisateur);
	}
	
	@Transactional
	public void udpadteByEmal(String email) {
		em.createQuery("UPDATE Utilisateur u SET u.email= :email ")
				.setParameter("email", email).executeUpdate();
		
		/**
		 * Query query = session.createQuery("update Stock set stockName = :stockName" +
    				" where stockCode = :stockCode");
		query.setParameter("stockName", "DIALOG1");
		query.setParameter("stockCode", "7277");
		int result = query.executeUpdate();
		
		
		update Student s set e=s.marks=50 where s.studentId=10;
		 */
	}
	
	@Transactional(readOnly = true)
	public Utilisateur findById(long id) {
		return em.find(Utilisateur.class, id);
	}
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List<Utilisateur> findAll(Utilisateur utilisateur) {
		Query tq = em.createQuery("SELECT u FROM Utilisateur u");
		return tq.getResultList();
	}
	
	@Transactional
	public void delete(Utilisateur utilisateur) {
		em.remove(utilisateur);
	}

	
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
	
	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public boolean EmailExists(String email) {
		List<Utilisateur> ls = em.createQuery("Select u FROM Utilisateur u WHERE u.email= :email")
				.setParameter("email", email)
				.getResultList();
		if(ls.size() > 0) //email existe déjà dans la base de données
			return true;
		return false;
	}

	public Long count() {
		Long nb = (Long) em.createQuery("SELECT COUNT(u.id) FROM Utilisateur u").getSingleResult();
		return nb;
	}
	
	
	
}
