package fr.dawan.guanjia.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.dawan.guanjia.entities.Client;
import fr.dawan.guanjia.entities.Utilisateur;

public class AdresseDao {
	
	@PersistenceContext
	protected EntityManager em;
	
	Utilisateur u = new Client();

//	@SuppressWarnings("unchecked")
//	@Transactional(readOnly = true)
//	public List<Adresse> findByClientId(long id) {
//		String query = "SELECT adr FROM Adresse adr "
//				+ "INNER JOIN adr.client as adrclient "
//		+ "WHERE adrclient.id= :id";
//		List<Adresse> adresses = em.createQuery(query)
//				.setParameter("id", id)
//				.getResultList();	
//		return adresses;
//	}
	
//	@SuppressWarnings("unchecked")
//	@Transactional(readOnly = true)
//	public List<Adresse> findByClientId(Object client) {
//		List<Adresse> adresses = em.createQuery("FROM Adresse adr WHERE adr.client= :client")
//				.setParameter("client", client).getResultList();
//	System.out.println(adresses.get(0).getCodePostale());
//		return adresses;
//	}
}
