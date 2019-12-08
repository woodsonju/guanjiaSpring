package fr.dawan.guanjia.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Panier extends DbObject{
	
	private double prixTotal;
	
	@ManyToOne
	private Client client;
	
	//PERSIST : Quand on crée un panier dans le BDD, on charge aussi les commandes liée à ce panier. 
	@OneToMany(mappedBy = "panier", cascade = CascadeType.PERSIST) 
	private List<LigneDeCommande> lignes = new ArrayList<LigneDeCommande>();
}
