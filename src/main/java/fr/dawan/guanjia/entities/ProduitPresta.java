package fr.dawan.guanjia.entities;

import javax.persistence.Entity;

@Entity
public class ProduitPresta extends DbObject{
	
	private double prix;
	private String description;
	private boolean estDisponible;

}
