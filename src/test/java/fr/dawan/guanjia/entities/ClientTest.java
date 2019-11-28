package fr.dawan.guanjia.entities;

import org.junit.Before;
import org.junit.Test;

import fr.dawan.guanjia.dao.GenericDao;
import junit.framework.TestCase;

public class ClientTest extends TestCase {
	
	Client client1;
	Client client2;
	Client client3;
	Client client4;
	Adresse adresseFacturation;
	Adresse adresseLivraison;
	



	@Before
	protected void setUp() throws Exception {
		client1 = new Client();
		client1.setPrenom("Jirong");
		client1.setNom("JiJi");
		client1.setEmail("jirong@gmail.com");
		client1.setPwd("jirong");
		client1.setNumTelephone("0215457545");
		client1.setTypeUtilisateur(TypeUtilisateur.CLIENT);
		
//		client2 = new Client();
//		client2.setPrenom("Clement");
//		client2.setNom("Clem");
//		client2.setEmail("clement@gmail.com");
//		client2.setPwd("clement");
//		client2.setNumTelephone("0878746545");
//		client2.setTypeUtilisateur(TypeUtilisateur.CLIENT);
//
//		client3 = new Client();
//		client3.setPrenom("Lilian");
//		client3.setNom("Lili");
//		client3.setEmail("lilian@gmail.com");
//		client3.setPwd("lilian");
//		client3.setNumTelephone("05646489788");
//		client3.setTypeUtilisateur(TypeUtilisateur.CLIENT);
//		
//
//		client4 = new Client();
//		client4.setPrenom("Woodson");
//		client4.setNom("woody");
//		client4.setEmail("woodson@gmail.com");
//		client4.setPwd("woodson");
//		client4.setNumTelephone("07845451445");
//		client4.setTypeUtilisateur(TypeUtilisateur.CLIENT);
//		
		adresseFacturation = new Adresse();
		adresseFacturation.setCodePostale("31300");
		adresseFacturation.setPays("France");
		adresseFacturation.setVille("Toulouse");
		adresseFacturation.setClient(client1);
		
		adresseLivraison = new Adresse();
		adresseLivraison.setCodePostale("31600");
		adresseLivraison.setPays("France");
		adresseLivraison.setVille("Toulouse");
		adresseLivraison.setClient(client1);

	}         

	@Test
	public void testCreate() {
		
		
		
		client1.addAdressesFacturation(adresseFacturation);
		client1.addAdressesLivraison(adresseLivraison); 
		
		
		Client cli1 = GenericDao.create(client1);
//		Client cli2 = GenericDao.create(client2);
//		Client cli3 = GenericDao.create(client3);
//		Client cli4 = GenericDao.create(client4);

		System.out.println(cli1.getNom());
		assertEquals("jirong@gmail.com", cli1.getEmail());
//		assertEquals("woodson@gmail.com", cli4.getEmail());
	}
	
	

}
