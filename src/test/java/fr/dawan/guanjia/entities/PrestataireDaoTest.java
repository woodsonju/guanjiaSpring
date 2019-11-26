package fr.dawan.guanjia.entities;

import org.junit.Before;
import org.junit.Test;

import fr.dawan.guanjia.dao.GenericDao;
import junit.framework.TestCase;

public class PrestataireDaoTest extends TestCase{
	
	Prestataire prestataire1;
	Prestataire prestataire2;
	Prestataire prestataire3;
	
	Adresse adressePrestataire;

	private final String NOM_PRESTATAIRE_1 = "CasinonCapitole";
	private final String EMAIL_PRESTATAIRE_1 = "presta1@gmail.com";
	private final String PWD_PRESTATAIRE_1 = "presta1";
	private final boolean STATUT_PRESTATAIRE_1 = false;
	private final String RAISONSOCIAL_PRESTATAIRE_1 = "...";
	private final String NUMTELEPHONE_PRESTATAIRE_1 = "0564487795";
	
	private final String NOM_PRESTATAIRE_2 = "CasinonJolimont";
	private final String EMAIL_PRESTATAIRE_2 = "presta2@gmail.com";
	private final String PWD_PRESTATAIRE_2 = "presta2";
	private final boolean STATUT_PRESTATAIRE_2 = true;
	private final String RAISONSOCIAL_PRESTATAIRE_2 = "...";
	private final String NUMTELEPHONE_PRESTATAIRE_2 = "0500000000";
	
	private final String NOM_PRESTATAIRE_3 = "CasinonEsquirol";
	private final String EMAIL_PRESTATAIRE_3 = "presta3@gmail.com";
	private final String PWD_PRESTATAIRE_3 = "presta3";
	private final boolean STATUT_PRESTATAIRE_3 = true;
	private final String RAISONSOCIAL_PRESTATAIRE_3 = "...";
	private final String NUMTELEPHONE_PRESTATAIRE_3 = "051122334466";
	
	private final String LIBELLE_ADRESSE_1 = "...";
	private final String CODEPOSTALE_ADRESSE_1 = "31300";
	private final String VILLE_ADRESSE_1 = "Toulouse";
	private final String PAYS_ADRESSE_1 = "France";
	
	
	@Before
	public void setUp() throws Exception {
		prestataire1 = new Prestataire();
		prestataire1.setNom(NOM_PRESTATAIRE_1);
		prestataire1.setEmail(EMAIL_PRESTATAIRE_1);
		prestataire1.setPwd(PWD_PRESTATAIRE_1);
		prestataire1.setStatut(STATUT_PRESTATAIRE_1);
		prestataire1.setTypeUtilisateur(TypeUtilisateur.PRESTATAIRE);
		prestataire1.setRaisonSocial(RAISONSOCIAL_PRESTATAIRE_1);
		prestataire1.setNumTelephone(NUMTELEPHONE_PRESTATAIRE_1);
		           
		prestataire2 = new Prestataire();
		prestataire2.setNom(NOM_PRESTATAIRE_2);
		prestataire2.setEmail(EMAIL_PRESTATAIRE_2);
		prestataire2.setPwd(PWD_PRESTATAIRE_2);
		prestataire2.setStatut(STATUT_PRESTATAIRE_2);
		prestataire2.setTypeUtilisateur(TypeUtilisateur.PRESTATAIRE);
		prestataire2.setRaisonSocial(RAISONSOCIAL_PRESTATAIRE_2);
		prestataire2.setNumTelephone(NUMTELEPHONE_PRESTATAIRE_2);
		
		prestataire3 = new Prestataire();
		prestataire3.setNom(NOM_PRESTATAIRE_3);
		prestataire3.setEmail(EMAIL_PRESTATAIRE_3);
		prestataire3.setPwd(PWD_PRESTATAIRE_3);
		prestataire3.setStatut(STATUT_PRESTATAIRE_3);
		prestataire3.setTypeUtilisateur(TypeUtilisateur.PRESTATAIRE);
		prestataire3.setRaisonSocial(RAISONSOCIAL_PRESTATAIRE_3);
		prestataire3.setNumTelephone(NUMTELEPHONE_PRESTATAIRE_3);
		       
		
		adressePrestataire = new Adresse();
		adressePrestataire.setLibelle(LIBELLE_ADRESSE_1);
		adressePrestataire.setCodePostale(CODEPOSTALE_ADRESSE_1);
		adressePrestataire.setPays(PAYS_ADRESSE_1);
		adressePrestataire.setVille(VILLE_ADRESSE_1);
		//adressePrestataire.setPrestataire(prestataire1);
		prestataire1.setAdresse(adressePrestataire);

		
	}

	@Test
	public void testCreate() {
				
		Prestataire p1 = GenericDao.create(prestataire1);
		Prestataire p2 = GenericDao.create(prestataire2);
		Prestataire p3 = GenericDao.create(prestataire3);
		
		System.out.println(prestataire1.getAdresse().getId());
		//System.out.println(adressePrestataire.getPrestataire().getNom());
		assertEquals(NOM_PRESTATAIRE_1, p1.getNom());
		assertEquals(EMAIL_PRESTATAIRE_1, p1.getEmail());
		assertEquals(PWD_PRESTATAIRE_1, p1.getPwd());
		assertEquals(STATUT_PRESTATAIRE_1, p1.isStatut());
		assertEquals(TypeUtilisateur.PRESTATAIRE, p1.getTypeUtilisateur());
		assertEquals(RAISONSOCIAL_PRESTATAIRE_1, p1.getRaisonSocial());
		assertEquals(NUMTELEPHONE_PRESTATAIRE_1, p1.getNumTelephone());

	}

}
