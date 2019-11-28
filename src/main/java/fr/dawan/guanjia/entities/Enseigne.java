package fr.dawan.guanjia.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Enseigne extends DbObject{
	private String nom;
	
	@OneToMany(mappedBy = "enseigne", cascade = CascadeType.PERSIST)
	private List<Prestataire> listPrestataire = new ArrayList<Prestataire>();
	
	
	@ManyToOne
	private Categorie categorie;


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}
}
