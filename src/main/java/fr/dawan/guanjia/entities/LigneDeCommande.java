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
	
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}

	public ProduitPresta getProduitPresta() {
		return produitPresta;
	}

	public void setProduitPresta(ProduitPresta produitPresta) {
		this.produitPresta = produitPresta;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public Prestation getPrestation() {
		return prestation;
	}

	public void setPrestation(Prestation prestation) {
		this.prestation = prestation;
	}
	
}
