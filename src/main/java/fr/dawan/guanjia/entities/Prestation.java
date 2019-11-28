package fr.dawan.guanjia.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Prestation extends DbObject{
	
	private String description;
	private double prixPrestation;
	
	@OneToMany(mappedBy = "prestation")
	List<LigneDeCommande> LigneDeCommande = new ArrayList<LigneDeCommande>();
	
	@ManyToMany
	private List<Prestataire> listPrestataire = new ArrayList<Prestataire>();

	public Prestation() {
		super();
	}

	public Prestation(String description, double prixPrestation, List<LigneDeCommande> listLigneDeCommande,
			List<Prestataire> listPrestataire) {
		super();
		this.setDescription(description);
		this.setPrixPrestation(prixPrestation);
		this.LigneDeCommande = listLigneDeCommande;
		this.listPrestataire = listPrestataire;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrixPrestation() {
		return prixPrestation;
	}

	public void setPrixPrestation(double prixPrestation) {
		this.prixPrestation = prixPrestation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((LigneDeCommande == null) ? 0 : LigneDeCommande.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((listPrestataire == null) ? 0 : listPrestataire.hashCode());
		long temp;
		temp = Double.doubleToLongBits(prixPrestation);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Prestation other = (Prestation) obj;
		if (LigneDeCommande == null) {
			if (other.LigneDeCommande != null)
				return false;
		} else if (!LigneDeCommande.equals(other.LigneDeCommande))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (listPrestataire == null) {
			if (other.listPrestataire != null)
				return false;
		} else if (!listPrestataire.equals(other.listPrestataire))
			return false;
		if (Double.doubleToLongBits(prixPrestation) != Double.doubleToLongBits(other.prixPrestation))
			return false;
		return true;
	}

	

	// *************************************************** METHODES D ACCES A PRESTATAIRES *********************************************************************
	
	public List<Prestataire> getPrestataire() {

		// Approche 1 : on utilise le constructeur de ArrayList prenant en paramètre une collection

		// renvoi une copie de la collection
		return new ArrayList<Prestataire>(listPrestataire) ;
	}

	public void addPrestaire(Prestataire prestataire) {
		if(!listPrestataire.contains(prestataire) && prestataire !=null) {
			this.listPrestataire.add(prestataire);
		}
	}
	
	public void removePrestaire(Prestataire prestataire) {
		if(!listPrestataire.contains(prestataire)) {
			this.listPrestataire.remove(prestataire);
		}
	}
	
	
}
