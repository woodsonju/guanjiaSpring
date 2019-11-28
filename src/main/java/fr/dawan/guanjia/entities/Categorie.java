package fr.dawan.guanjia.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Categorie extends DbObject{
	
	private String libelle;
	
	@OneToMany(mappedBy = "categorie", cascade = CascadeType.PERSIST)
	private List<Enseigne> listEnseignes = new ArrayList<Enseigne>();
	
	
	@OneToMany(mappedBy = "categorie")
	private List<Prestataire> listPrestataire;


	public Categorie() {
		super();
	}

	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public List<Enseigne> getListEnseignes() {
		return listEnseignes;
	}


	public void setListEnseignes(List<Enseigne> listEnseignes) {
		this.listEnseignes = listEnseignes;
	}


	public List<Prestataire> getListPrestataire() {
		return listPrestataire;
	}


	public void setListPrestataire(List<Prestataire> listPrestataire) {
		this.listPrestataire = listPrestataire;
	}

}
