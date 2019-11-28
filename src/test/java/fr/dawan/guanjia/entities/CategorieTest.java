package fr.dawan.guanjia.entities;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.dawan.guanjia.dao.GenericDao;

public class CategorieTest {
	
	 //private static final String Enseigne = "Enseigne";
	 //private static final String Prestataire = "Prestataire";

	Categorie categorie1;
	 
	String   	      libelleCategorie;
	List<Enseigne> 	  enseignesCategorie;
	List<Prestataire> prestatairesCategorie;
	 	
	private final String LIBELLE_CATEGORIE ="Boucher";
	private final String NOM_ENSEIGNE="COMMERÇANT";
	private final String NOM_PRETATAIRE="boucher_Prestataire_1";

	@Before
	public void setUp() throws Exception {
		
		// On crée une catégorie
		categorie1 = new Categorie();
		
		// on affecte un libellé à la catégorie
		categorie1.setLibelle(LIBELLE_CATEGORIE);
		
		// On crée une liste d'enseignes
		enseignesCategorie = new ArrayList<Enseigne>();
		
		// on crée une enseigne
		Enseigne enseigne= new Enseigne();
		
		// On affecte un nom à l'enseigne
		enseigne.setNom(NOM_ENSEIGNE);
		
		// On ajoute l'enseigne à la liste
		enseignesCategorie.add(enseigne);
		
		// On affecte la liste d'enseigne à la cétégorie
		categorie1.setListEnseignes(enseignesCategorie);
		
		// init de la liste Prestataire
		prestatairesCategorie = new ArrayList<Prestataire>();
		
		// création d'une Prestataire
		Prestataire prestataire=new Prestataire();
		
		// création d'une Prestataire
		prestataire.setNom(NOM_PRETATAIRE);
		
		// ajout de Prestataire à la liste
		prestatairesCategorie.add(prestataire);
		
		// On affect la liste de prestataires à la catégorie
		categorie1.setListPrestataire(prestatairesCategorie);
		
		GenericDao.create(categorie1);
		
		Assert.assertNotEquals(0, categorie1.getLibelle());
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		GenericDao.delete(Categorie.class, categorie1.getId());
	}

	@Test
	public void findByIdTest() {
		Categorie f = GenericDao.findById(Categorie.class, categorie1.getId());
		Assert.assertNotNull(f);
		Assert.assertEquals(LIBELLE_CATEGORIE, f.getLibelle());
		Assert.assertEquals(NOM_ENSEIGNE, f.getListEnseignes());
		Assert.assertEquals(NOM_PRETATAIRE, f.getListPrestataire());
		
	}

}
 
	 

//	@Before
//	public void setUp() throws Exception {
//		categorie1 = new Categorie();
//		
//		categorie1.setLibelle("set_Libelle_Categorie");
//		
//		// init de la liste d'enseignes
//		enseignesCategorie = new ArrayList<Enseigne>();
//		
//		// création d'une enseigne
//		Enseigne enseigne = new Enseigne();
//		enseigne.setNom("Enseigne");
//		
//		// ajout de l'enseigne à la liste
//		enseignesCategorie.add(enseigne);
//		
//		// ajout de la liste d'enseignes à la catégorie
//		categorie1.setListEnseignes(enseignesCategorie);
//		
//		
//		// init de la liste Prestataire
//		prestatairesCategorie = new ArrayList<Prestataire>();
//		
//		// création d'une Prestataire
//		Prestataire prestataire = new Prestataire();
//		prestataire.setNom("boucher_Prestataire_1");
//		
//		// ajout de Prestataire à la liste
//		prestatairesCategorie.add(prestataire);
//		
//		// ajout de la liste Prestataire à la catégorie
//		categorie1.setListPrestataire(prestatairesCategorie);
//		
//
//		}
//
//	@Test
//	public void testCreate() {
//				
//		Categorie c1 = GenericDao.create(categorie1);
//
//		System.out.println(categorie1.getLibelle());
//		System.out.println(categorie1.getListEnseignes());
//		System.out.println(categorie1.getListPrestataire());
//		//System.out.println(adressePrestataire.getPrestataire().getNom());
//		assertEquals("set_Libelle_Categorie", c1.getLibelle());
//		
//	
//		Collection<Enseigne> Enseigne = Arrays.asList("Enseigne");
//        Collection<Prestataire> Prestataire = Arrays.asList("Prestataire");
//        assertEquals("Enseigne","boucher_Prestataire_1");
//	}
//}
