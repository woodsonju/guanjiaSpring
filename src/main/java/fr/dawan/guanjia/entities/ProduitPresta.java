package fr.dawan.guanjia.entities;

import javax.persistence.Entity;

@Entity
public class ProduitPresta extends DbObject{
	
	private double prix;
	private String description;
	private boolean Disponible;
	
	public ProduitPresta() {
		super();
	}

	public ProduitPresta(double prix, String description, boolean estDisponible) {
		super();
		this.prix = prix;
		this.description = description;
		this.Disponible = estDisponible;
	}

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
		return Disponible;
	}

	public void setEstDisponible(boolean estDisponible) {
		this.Disponible = estDisponible;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + (Disponible ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(prix);
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
		ProduitPresta other = (ProduitPresta) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (Disponible != other.Disponible)
			return false;
		if (Double.doubleToLongBits(prix) != Double.doubleToLongBits(other.prix))
			return false;
		return true;
	}

	
}
