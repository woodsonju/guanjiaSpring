package fr.dawan.guanjia.entities;

import org.junit.Before;
import org.junit.Test;

import fr.dawan.guanjia.dao.GenericDao;
import fr.dawan.guanjia.dao.PrestataireDao;
import junit.framework.TestCase;

public class PrestataireCreationTest extends TestCase{
	
	

	@Test
	public void testCreation() throws Exception {
		Prestataire prestataire1 = new Prestataire();
		prestataire1.setEmail("presta1@gmail.com");
		prestataire1.setNom("CasinonCapitole");
		prestataire1.setPwd("presta1");
		prestataire1.setStatut(true);
		prestataire1.setTypeUtilisateur(TypeUtilisateur.PRESTATAIRE);
		
		
		Adresse adr1 = new Adresse();
		adr1.setCodePostale("31000");
		adr1.setPrestataire(prestataire1);
		prestataire1.setAdresse(adr1);
		
		GenericDao.create(prestataire1);
		
	}

	
}
