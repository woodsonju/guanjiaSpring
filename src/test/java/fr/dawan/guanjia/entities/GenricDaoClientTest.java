package fr.dawan.guanjia.entities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import fr.dawan.guanjia.dao.ClientDao;
import fr.dawan.guanjia.dao.GenericDao;


//TODO: si je mets "extends TestCase", ça ne marche plus. car c'est pour Junit3, mais j'utilise JUnit4
public class GenricDaoClientTest{
	
	
	
	
	
	
	Client client;
	private final String NOM_CLIENT="LALA";
	private final String PRENOM_CLIENT="Sasa";
	private final String EMAIL_CLIENT="dupong.lucie@gmail.com";
	private final String PWD_CLIENT="dupong.lucie";
	private final boolean STATUT_CLIENT=true;
	private final TypeUtilisateur TYPEUTILISATEUR_CLIENT=TypeUtilisateur.CLIENT;
	private String NUMTELE_CLIENT="0789562512";
//	private List<Panier> listPanier = new ArrayList<Panier>();
	
	

	Adresse adressfacturation1;
	Adresse adressfacturation2;
	Adresse adresslivraison1;
	Adresse adresslivraison2;
	
	List<Adresse> adresseFacturationList = new ArrayList<>();
	List<Adresse> adresseLivraisonList = new ArrayList<>();
	
	private final String LIBELLE_ADRFAC1 = "facturation_domicile";
	private final String NOMDEVOIE_ADRFAC1 = "1 place capitole";
	private final String CODEPOSTALE_ADRFAC1 ="31000"; 
	private final String VILLE_ADRFAC1 ="Toulouse"; 
	private final String PAYS_ADRFAC1 ="France"; 
	
	private final String LIBELLE_ADRFAC2 = "facturation_travail";
	private final String NOMDEVOIE_ADRFAC2 = "2 place capitole";
	private final String CODEPOSTALE_ADRFAC2 ="32000"; 
	private final String VILLE_ADRFAC2 ="Toulouse"; 
	private final String PAYS_ADRFAC2 ="France"; 
	
	private final String LIBELLE_ADRLIV1 = "livraison_domicile";
	private final String NOMDEVOIE_ADRLIV1 = "1 Companse Cafarelli";
	private final String CODEPOSTALE_ADRLIV1 ="41000"; 
	private final String VILLE_ADRLIV1 ="Bordeaux"; 
	private final String PAYS_ADRLIV1 ="France"; 
	
	private final String LIBELLE_ADRLIV2 = "livraison_travail";
	private final String NOMDEVOIE_ADRLIV2 = "2 Companse Cafarelli";
	private final String CODEPOSTALE_ADRLIV2 ="41000"; 
	private final String VILLE_ADRLIV2 ="Bordeaux"; 
	private final String PAYS_ADRLIV2 ="France"; 

	@Before
	public void setUp() throws Exception {
		
		
		
		
		client = new Client();
		client.setNom(NOM_CLIENT);
		client.setPrenom(PRENOM_CLIENT);
		client.setEmail(EMAIL_CLIENT);
		client.setPwd(PWD_CLIENT);
		client.setStatut(STATUT_CLIENT);
		client.setTypeUtilisateur(TYPEUTILISATEUR_CLIENT);
		client.setNumTelephone(NUMTELE_CLIENT);
		
		
		
		
		
		adressfacturation1= new Adresse();
		adressfacturation1.setLibelle(LIBELLE_ADRFAC1);
		adressfacturation1.setNomDeVoie(NOMDEVOIE_ADRFAC1);
		adressfacturation1.setCodePostale(CODEPOSTALE_ADRFAC1);
		adressfacturation1.setVille(VILLE_ADRFAC1);
		adressfacturation1.setPays(PAYS_ADRFAC1);
		adressfacturation1.setClient(client);
		adressfacturation1.setTypeAdresse(TypeAdresse.CLIENT_FACTURATION);
		
		
		adressfacturation2= new Adresse();
		adressfacturation2.setLibelle(LIBELLE_ADRFAC2);
		adressfacturation2.setNomDeVoie(NOMDEVOIE_ADRFAC2);
		adressfacturation2.setCodePostale(CODEPOSTALE_ADRFAC2);
		adressfacturation2.setVille(VILLE_ADRFAC2);
		adressfacturation2.setPays(PAYS_ADRFAC2);
		adressfacturation2.setClient(client);
		adressfacturation2.setTypeAdresse(TypeAdresse.CLIENT_FACTURATION);
		
		
		adresslivraison1= new Adresse();
		adresslivraison1.setLibelle(LIBELLE_ADRLIV1);
		adresslivraison1.setNomDeVoie(NOMDEVOIE_ADRLIV1);
		adresslivraison1.setCodePostale(CODEPOSTALE_ADRLIV1);
		adresslivraison1.setVille(VILLE_ADRLIV1);
		adresslivraison1.setPays(PAYS_ADRLIV1);
		adresslivraison1.setClient(client);
		adresslivraison1.setTypeAdresse(TypeAdresse.CLIENT_LIVRAISON);
		
		
		adresslivraison2= new Adresse();
		adresslivraison2.setLibelle(LIBELLE_ADRLIV2);
		adresslivraison2.setNomDeVoie(NOMDEVOIE_ADRLIV2);
		adresslivraison2.setCodePostale(CODEPOSTALE_ADRLIV2);
		adresslivraison2.setVille(VILLE_ADRLIV2);
		adresslivraison2.setPays(PAYS_ADRLIV2);
		adresslivraison2.setClient(client);
		adresslivraison2.setTypeAdresse(TypeAdresse.CLIENT_LIVRAISON);

		
		
		client.addAdresses(adressfacturation1);
		client.addAdressesFacturation(adressfacturation1);
		client.addAdresses(adressfacturation2);
		client.addAdressesFacturation(adressfacturation2);
		client.addAdresses(adresslivraison1);
		client.addAdressesLivraison(adresslivraison1);
		client.addAdresses(adresslivraison2);
		client.addAdressesLivraison(adresslivraison2);
		
		adresseFacturationList.add(adressfacturation1);
		adresseFacturationList.add(adressfacturation2);
		adresseLivraisonList.add(adresslivraison1);
		adresseLivraisonList.add(adresslivraison2);
		
		
	}

	@After
	public void tearDown() throws Exception {
		
	}
	

	@Test
	public void creatPrestatairePuisAdresseTest() {
		GenericDao.create(client);
		Assert.assertNotEquals(0, client.getId());
		Assert.assertNotNull(client.getAdressesFacturation());
		Assert.assertNotNull(client.getAdressesLivraison());
		
		Client c = ClientDao.findById(client.getId());
		
		System.out.println("le client récupéré est " + c.getNom());
		System.out.println("adresseFacturationList que je soushaite insérer :" + client.getAdressesFacturation());
		System.out.println("adresseFacturationList dans BDD est :" + c.getAdressesFacturation());
		System.out.println("adresseLivraisonList que je soushaite insérer :" + client.getAdressesLivraison());
		System.out.println("adresseLivraisonList dans BDD est :" + c.getAdressesLivraison());
		
		Assert.assertEquals(NOM_CLIENT, c.getNom());
		Assert.assertEquals(PRENOM_CLIENT, c.getPrenom());
		Assert.assertEquals(EMAIL_CLIENT, c.getEmail());
		Assert.assertEquals(PWD_CLIENT, c.getPwd());
		Assert.assertEquals(STATUT_CLIENT, c.isStatut());
		Assert.assertEquals(TYPEUTILISATEUR_CLIENT, c.getTypeUtilisateur());
		Assert.assertEquals(NUMTELE_CLIENT, c.getNumTelephone());
		Assert.assertEquals(adressfacturation1, c.getAdressesFacturation().get(0));
		Assert.assertEquals(adressfacturation2, c.getAdressesFacturation().get(1));
		Assert.assertEquals(adresslivraison1, c.getAdressesLivraison().get(0));
		Assert.assertEquals(adresslivraison2, c.getAdressesLivraison().get(1));
		
		
		
		
		
		
	
	}

}
