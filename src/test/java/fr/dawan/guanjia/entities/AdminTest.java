package fr.dawan.guanjia.entities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.dawan.guanjia.dao.GenericDao;
import junit.framework.TestCase;

public class AdminTest extends TestCase{
	
	Admin admin;
	

	@Before
	public void setUp() throws Exception {
		admin = new Admin();
		admin.setNom("JiJi");
		admin.setPrenom("Jirong");
		admin.setEmail("jiji@gmail.com");
		admin.setPwd("jirong");
		admin.setStatut(true);
		admin.setTypeUtilisateur(TypeUtilisateur.ADMIN);
	}

	@After
	public void tearDown() throws Exception {
	}
	
	
	
	@Test
	public void testCreate() {
		Admin ad = GenericDao.create(admin);
		assertEquals("jiji@gmail.com", ad.getEmail());
	}

}
