package fr.dawan.guanjia.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Adresse extends DbObject {
	private String libelle;
	private String nomDeVoie;
	private String codePostale;
	private String Ville;
	private String pays;
	@Enumerated(EnumType.STRING)
	private TypeAdresse typeAdresse;
	@ManyToOne(cascade = CascadeType.ALL)
	private Client client;
	@OneToOne(optional = true, mappedBy = "adresse", cascade = CascadeType.ALL)
	private Prestataire prestataire;

	public Prestataire getPrestataire() {
		return prestataire;
	}

	public void setPrestataire(Prestataire prestataire) {
		this.prestataire = prestataire;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getCodePostale() {
		return codePostale;
	}

	public void setCodePostale(String codePostale) {
		this.codePostale = codePostale;
	}

	public String getVille() {
		return Ville;
	}

	public void setVille(String ville) {
		Ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public String getNomDeVoie() {
		return nomDeVoie;
	}

	public void setNomDeVoie(String nomDeVoie) {
		this.nomDeVoie = nomDeVoie;
	}

	public TypeAdresse getTypeAdresse() {
		return typeAdresse;
	}

	public void setTypeAdresse(TypeAdresse typeAdresse) {
		this.typeAdresse = typeAdresse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((Ville == null) ? 0 : Ville.hashCode());
		result = prime * result + ((codePostale == null) ? 0 : codePostale.hashCode());
		result = prime * result + ((libelle == null) ? 0 : libelle.hashCode());
		result = prime * result + ((nomDeVoie == null) ? 0 : nomDeVoie.hashCode());
		result = prime * result + ((pays == null) ? 0 : pays.hashCode());
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
		Adresse other = (Adresse) obj;
		if (Ville == null) {
			if (other.Ville != null)
				return false;
		} else if (!Ville.equals(other.Ville))
			return false;
		if (codePostale == null) {
			if (other.codePostale != null)
				return false;
		} else if (!codePostale.equals(other.codePostale))
			return false;
		if (libelle == null) {
			if (other.libelle != null)
				return false;
		} else if (!libelle.equals(other.libelle))
			return false;
		if (nomDeVoie == null) {
			if (other.nomDeVoie != null)
				return false;
		} else if (!nomDeVoie.equals(other.nomDeVoie))
			return false;
		if (pays == null) {
			if (other.pays != null)
				return false;
		} else if (!pays.equals(other.pays))
			return false;
		return true;
	}

}
