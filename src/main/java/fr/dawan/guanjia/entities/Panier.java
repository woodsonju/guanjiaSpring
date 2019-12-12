package fr.dawan.guanjia.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Panier extends DbObject{

	private double prixTotal;

	@ManyToOne(fetch = FetchType.EAGER)
	private Client client;

	//PERSIST : Quand on crée un panier dans le BDD, on charge aussi les commandes liée à ce panier. 
	@OneToMany(mappedBy = "panier", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER) 
	private Set<LigneDeCommande> lignes = new HashSet<LigneDeCommande>();

	
	public Panier() {
		super();
	}


	public Panier(double prixTotal, Client client, Set<LigneDeCommande> lignes) {
		super();
		this.prixTotal = prixTotal;
		this.client = client;
		this.lignes = lignes;
	}



	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}



	// *************************************************** METHODES D ACCES A LIGNES DE COMMANDE *********************************************************************

	public List<LigneDeCommande> getLignes() {

		// Approche 1 : on utilise le constructeur de ArrayList prenant en paramètre une collection

		// renvoi une copie de la collection
		return new ArrayList<LigneDeCommande>(lignes) ;
	}

	public void addLigneDeCommande(LigneDeCommande ligne) {
		if(!lignes.contains(ligne) && ligne !=null) {
			this.lignes.add(ligne);
		}
	}
	public void removeLigneDeCommande(LigneDeCommande ligne) {
		if(!lignes.contains(ligne)) {
			this.lignes.remove(ligne);
		}
	}
}
