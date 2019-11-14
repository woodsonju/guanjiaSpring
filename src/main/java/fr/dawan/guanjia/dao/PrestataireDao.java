package fr.dawan.guanjia.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import fr.dawan.guanjia.entities.Adresse;
import fr.dawan.guanjia.entities.Prestataire;

/**
 * Quand on crée un prestataire dans la base de données
 * On crée directement son adresse
 */
public class PrestataireDao {
	public static void createPrestaire(Prestataire prestataire) {
		EntityManager em = GenericDao.createEntityManager();
		EntityTransaction transaction = em.getTransaction();
		
		try {
			transaction.begin();
			em.persist(prestataire);
			Adresse adresse = prestataire.getAdresse();
			em.persist(adresse);
		} catch (Exception e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			em.close();
		}
	}
}
