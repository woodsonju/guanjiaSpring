package fr.dawan.guanjia.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotEmpty;

@Entity
@DiscriminatorValue("PRESTATAIRE")
public class Prestataire extends Utilisateur {
	
	@NotEmpty
	private String raisonSocial;
	
	@NotEmpty
	private String numTelephone;
	
	
	@ManyToMany(mappedBy = "listPrestataire")
	private List<Prestation> listPrestation = new ArrayList<Prestation>();
	
	@ManyToOne
	private Enseigne enseigne;
	
	@ManyToOne
	private Categorie categorie;
	
	@OneToOne(optional=true, cascade = CascadeType.ALL)
	@JoinColumn(name="adresse_id", unique=true, nullable=true, updatable=false)
	private Adresse adresse;

	public String getRaisonSocial() {
		return raisonSocial;
	}

	public void setRaisonSocial(String raisonSocial) {
		this.raisonSocial = raisonSocial;
	}

	public String getNumTelephone() {
		return numTelephone;
	}

	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}

	public List<Prestation> getListPrestation() {
		return listPrestation;
	}

	public void setListPrestation(List<Prestation> listPrestation) {
		this.listPrestation = listPrestation;
	}

	public Enseigne getEnseigne() {
		return enseigne;
	}

	public void setEnseigne(Enseigne enseigne) {
		this.enseigne = enseigne;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
	
	
}


