package fr.dawan.guanjia.entities;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class LigneDeCommande extends DbObject{
	
	private int quantite;
	private double prixTotal;
	
	@ManyToOne
	private ProduitPresta produitPresta;
	
	@ManyToOne
	private Panier panier;
	
	@ManyToOne
	private Prestation prestation;
	
}
