package fr.dawan.guanjia.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import fr.dawan.guanjia.dao.GenericDao;

public class PanierTest {

	Panier panier1;

	@Before
	public void setUp() throws Exception {

		// 
		Client client1 = new Client();
		client1.setNom("DUPONT");
		
		panier1 = new Panier();
		
		// 
		panier1.setPrixTotal(10.00);
		
		LigneDeCommande ldc1 = new LigneDeCommande();
		
		ldc1.setQuantite(1);
		ldc1.setPrixTotal(10.00);
		ldc1.setPanier(panier1);
		
		panier1.addLigneDeCommande(ldc1);

		client1.addPanier(panier1);
		panier1.setClient(client1);
		
		GenericDao.create(client1);
		GenericDao.create(panier1);
		
		assertNotEquals(0, panier1.getId());
		
		
	}
	
	@Test
	public void testFindById() {
				
		Panier p1 = GenericDao.findById(Panier.class, panier1.getId());

		assertEquals(10.00, p1.getPrixTotal(), 0.001);
		assertNotNull(p1.getClient());
		
		
		assertEquals("DUPONT" ,p1.getClient().getNom());
		assertEquals(1 ,p1.getLignes().size());
		assertEquals(10.00 ,p1.getLignes().get(0).getPrixTotal(), 0.01);
		

	}
}
