package fr.dawan.guanjia.dao;

import java.util.List;

import javax.persistence.EntityManager;

import fr.dawan.guanjia.entities.Adresse;
import fr.dawan.guanjia.entities.Client;
import fr.dawan.guanjia.entities.TypeAdresse;

public class ClientDao extends GenericDao {

	public static Client findById(long id) {
		EntityManager entityManager = createEntityManager();
		Client client = null;
		try {
			client = entityManager.find(Client.class, id);
			
			List<Adresse> ls = client.getAdresses();
			
			
			for (Adresse adresse : ls) {
				if(adresse.getTypeAdresse().equals(TypeAdresse.CLIENT_FACTURATION)) {
					client.addAdressesFacturation(adresse);
				}else if(adresse.getTypeAdresse().equals(TypeAdresse.CLIENT_LIVRAISON)) {
					client.addAdressesLivraison(adresse);
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			entityManager.close();

		}
		return client;
	}
	
}
