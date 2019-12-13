package fr.dawan.guanjia.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;

@Entity
public class LigneDeCommande extends DbObject{
	
	private int quantite;
	private double prixTotal;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private ProduitPresta produitPresta;
	
	@ManyToOne
	private Panier panier;
	
	@ManyToOne
	private Prestation prestation;

	public LigneDeCommande() {
		super();
	}

	public LigneDeCommande(int quantite, double prixTotal, ProduitPresta produitPresta, Panier panier,
			Prestation prestation) {
		super();
		this.quantite = quantite;
		this.prixTotal = prixTotal;
		this.produitPresta = produitPresta;
		this.panier = panier;
		this.prestation = prestation;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((panier == null) ? 0 : panier.hashCode());
		result = prime * result + ((prestation == null) ? 0 : prestation.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prixTotal);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((produitPresta == null) ? 0 : produitPresta.hashCode());
		result = prime * result + quantite;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		LigneDeCommande other = (LigneDeCommande) obj;
		if (panier == null) {
			if (other.panier != null)
				return false;
		} else if (!panier.equals(other.panier))
			return false;
		if (prestation == null) {
			if (other.prestation != null)
				return false;
		} else if (!prestation.equals(other.prestation))
			return false;
		if (Double.doubleToLongBits(prixTotal) != Double.doubleToLongBits(other.prixTotal))
			return false;
		if (produitPresta == null) {
			if (other.produitPresta != null)
				return false;
		} else if (!produitPresta.equals(other.produitPresta))
			return false;
		if (quantite != other.quantite)
			return false;
		return true;
	}
	
	
}
