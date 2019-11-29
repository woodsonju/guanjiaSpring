package fr.dawan.guanjia.entities;

import javax.persistence.Entity;

@Entity
public class ProduitPresta extends DbObject{
	
	private double prix;
	private String description;
	private boolean estDisponible;
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isEstDisponible() {
		return estDisponible;
	}
	public void setEstDisponible(boolean estDisponible) {
		this.estDisponible = estDisponible;
	}

}
