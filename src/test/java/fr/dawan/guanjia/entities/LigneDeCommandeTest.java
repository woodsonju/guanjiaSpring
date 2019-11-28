package fr.dawan.guanjia.entities;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import fr.dawan.guanjia.dao.GenericDao;

public class LigneDeCommandeTest {

	LigneDeCommande ldc1;
	
	@Before
	public void setUp() throws Exception {
		
		Panier panier1 = new Panier();
		
		ProduitPresta prodPresta1 = new ProduitPresta();
		prodPresta1.setDescription("pantalon");
		prodPresta1.setPrix(10.00);
		
		ldc1 = new LigneDeCommande();
		ldc1.setQuantite(1);
		ldc1.setPrixTotal(10.00);
		ldc1.setProduitPresta(prodPresta1);
		
		ldc1.setPanier(panier1);
		panier1.addLigneDeCommande(ldc1);

		GenericDao.create(prodPresta1);
		GenericDao.create(panier1);

		assertNotEquals(0,ldc1.getId());
	}
	
	@Test
	public void testCreate() {

		assertEquals(1, ldc1.getQuantite());
		assertEquals(10.00,ldc1.getPrixTotal(),0.001);
		assertEquals("pantalon",ldc1.getProduitPresta().getDescription());
		
		
	}
	
}
