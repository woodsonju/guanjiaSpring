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
	List<LigneDeCommande> listLigneDeCommande = new ArrayList<LigneDeCommande>();
	
	@ManyToMany
	private List<Prestataire> listPrestataire = new ArrayList<Prestataire>();

}
