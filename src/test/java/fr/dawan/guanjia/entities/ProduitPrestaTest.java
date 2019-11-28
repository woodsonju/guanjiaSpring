package fr.dawan.guanjia.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import fr.dawan.guanjia.dao.GenericDao;

public class ProduitPrestaTest {

	ProduitPresta produitPresta1;
	
	@Before
	public void setUp() throws Exception {
		
		produitPresta1 = new ProduitPresta();
		
		// Attribut 1
		produitPresta1.setPrix(100.00);
		
		// Attribut 2
		produitPresta1.setDescription("pantalon");
		
		// Attribut 3
		produitPresta1.setEstDisponible(true);
		
		
	}
	
	@Test
	public void testCreate() {
				
		ProduitPresta pp1 = GenericDao.create(produitPresta1);

		assertEquals(100.00, pp1.getPrix(),0.001);
		assertEquals("pantalon",pp1.getDescription());
		assertEquals(true,pp1.isEstDisponible());
		
		
	}
}
