package fr.dawan.guanjia.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Adresse extends DbObject{
	
	private String libelle;
	private String codePostale;
	private String Ville;
	private String pays;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Client client;
	
	@OneToOne(optional=true, mappedBy="adresse", cascade = CascadeType.ALL)
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
	

	
}
