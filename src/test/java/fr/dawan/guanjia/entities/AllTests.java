package fr.dawan.guanjia.entities;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AdresseTest.class, ClientTest.class, PrestataireDaoTest.class, 
	PanierTest.class, GenericDaoClientTest.class, LigneDeCommandeTest.class })
public class AllTests {

}
