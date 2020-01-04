
package fr.dawan.guanjia.dao;

import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import fr.dawan.guanjia.entities.Adresse;
import fr.dawan.guanjia.entities.Client;
import fr.dawan.guanjia.entities.TypeAdresse;
import fr.dawan.guanjia.entities.Utilisateur;

public class ClientDao {

	@PersistenceContext
	protected EntityManager em;
	
	
	/*
	 * 	@Transactional(readOnly = true)
	public Utilisateur findById(long id) {
		return em.find(Utilisateur.class, id);
	}
	 */

	@Transactional(readOnly = true)
	public Client findById(long id) {
		Client client = null;

		client = em.find(Client.class, id);
		System.out.println("Client : " + client);

//		Set<Adresse> ls = client.getAdresses();
//
//		for (Adresse adresse : ls) {
//			if (adresse.getTypeAdresse().equals(TypeAdresse.CLIENT_FACTURATION)) {
//				client.addAdressesFacturation(adresse);
//			} else if (adresse.getTypeAdresse().equals(TypeAdresse.CLIENT_LIVRAISON)) {
//				client.addAdressesLivraison(adresse);
//			}
//		}

		return client;
	}

}


//package fr.dawan.guanjia.dao;
//
//import java.util.Set;
//
//import javax.persistence.EntityManager;
//
//import fr.dawan.guanjia.entities.Adresse;
//import fr.dawan.guanjia.entities.Client;
//import fr.dawan.guanjia.entities.TypeAdresse;
//
//public class ClientDao extends GenericDao {
//
//	public static Client findById(long id) {
//		EntityManager entityManager = createEntityManager();
//		Client client = null;
//		try {
//			client = entityManager.find(Client.class, id);
//
//			Set<Adresse> ls = client.getAdresses();
//
//			for (Adresse adresse : ls) {
//				if (adresse.getTypeAdresse().equals(TypeAdresse.CLIENT_FACTURATION)) {
//					client.addAdressesFacturation(adresse);
//				} else if (adresse.getTypeAdresse().equals(TypeAdresse.CLIENT_LIVRAISON)) {
//					client.addAdressesLivraison(adresse);
//				}
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			entityManager.close();
//
//		}
//		return client;
//	}
//
//}
