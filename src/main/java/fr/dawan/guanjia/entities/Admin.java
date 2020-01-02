package fr.dawan.guanjia.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author Admin stagiaire
 *
 */
@Entity
@DiscriminatorValue("ADMIN")
public class Admin extends Utilisateur{

	public Admin() {
		super();
	}


	public Admin(String nom, String prenom, String numTelephone, String email, String pwd, String confirmpwd,
			boolean statut, TypeUtilisateur typeUtilisateur) {
		super(nom, prenom, numTelephone, email, pwd, confirmpwd, statut, typeUtilisateur);
	}

}
