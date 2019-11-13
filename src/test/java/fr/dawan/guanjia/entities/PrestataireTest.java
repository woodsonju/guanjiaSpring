package fr.dawan.guanjia.entities;

import org.junit.Before;
import org.junit.Test;

import fr.dawan.guanjia.dao.GenericDao;
import junit.framework.TestCase;

public class PrestataireTest extends TestCase{
	
	Prestataire prestataire1;
	Prestataire prestataire2;
	Prestataire prestataire3;

	

	@Before
	public void setUp() throws Exception {
		prestataire1 = new Prestataire();
		prestataire1.setEmail("presta1@gmail.com");
		prestataire1.setNom("CasinonCapitole");
		prestataire1.setPwd("presta1");
		prestataire1.setStatut(true);
		prestataire1.setTypeUtilisateur(TypeUtilisateur.PRESTATAIRE);
		           
		prestataire2 = new Prestataire();
		prestataire2.setEmail("presta2@gmail.com");
		prestataire2.setNom("CasinonJolimont");
		prestataire2.setPwd("presta2");
		prestataire2.setStatut(true);
		prestataire2.setTypeUtilisateur(TypeUtilisateur.PRESTATAIRE);
		
		prestataire3 = new Prestataire();
		prestataire3.setEmail("presta2@gmail.com");
		prestataire3.setNom("CasinonEsquirol");
		prestataire3.setPwd("presta2");
		prestataire3.setStatut(true);
		prestataire3.setTypeUtilisateur(TypeUtilisateur.PRESTATAIRE);

		
	}

	@Test
	public void testCreate() {
		Prestataire p1 = GenericDao.create(prestataire1);
		Prestataire p2 = GenericDao.create(prestataire2);
		Prestataire p3 = GenericDao.create(prestataire3);


		System.out.println(p1);
		assertEquals("presta1@gmail.com", p1.getEmail());
		assertEquals("presta2@gmail.com", p3.getEmail());
	}

}
