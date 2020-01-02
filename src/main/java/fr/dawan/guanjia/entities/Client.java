package fr.dawan.guanjia.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Transient;


@Entity
@DiscriminatorValue("CLIENT")
public class Client extends Utilisateur {
	
	
	@OneToMany(mappedBy = "client")
	private List<Panier> listPanier = new ArrayList<Panier>();
	
	@Transient
	private Map<String, String> preferences;
	
	@OneToMany(mappedBy="client",cascade = CascadeType.PERSIST,fetch=FetchType.EAGER)
	private Set<Adresse> adresses = new HashSet<Adresse>();
	
	@Transient
	private Set<Adresse> adressesFacturation = new HashSet<Adresse>();
	
	@Transient
	private Set<Adresse> adressesLivraison = new HashSet<Adresse>();
	
	public List<Panier> getListPanier() {
		return new ArrayList<Panier>(listPanier);
	}
	
	public void setListPanier(List<Panier> listPanier) {
		this.listPanier = listPanier;
	}
	
	public void addPanier(Panier panier) {
		if(!listPanier.contains(panier) && panier != null)
			this.listPanier.add(panier);
	}
	
	public void removePanier(Panier panier) {
		this.listPanier.remove(panier);
	}
	
	public Map<String, String> getPreferences() {
		return preferences;
	}
	
	public void setPreferences(Map<String, String> preferences) {
		this.preferences = preferences;
	}
	
	public List<Adresse> getAdressesFacturation() {
		return new ArrayList<Adresse>(adressesFacturation);
	}
	
	public void addAdressesFacturation(Adresse adresseFacturation) {
		if(adresseFacturation != null)
			this.adressesFacturation.add(adresseFacturation);
	}
	public void removeAdressesFacturation(Adresse adresseFacturation) {
			this.adressesFacturation.remove(adresseFacturation);
	}
	
	public List<Adresse> getAdressesLivraison() {
		return new ArrayList<Adresse>(adressesLivraison);
	}
	
	public void addAdressesLivraison(Adresse adresseLivraison) {
		if(adresseLivraison != null)
			this.adressesLivraison.add(adresseLivraison);
	}
	
	public void removeAdressesLivraison(Adresse adresseLivraison) {
		this.adressesLivraison.remove(adresseLivraison);
	}
	
	public Set<Adresse> getAdresses() {
		return adresses;
	}
	
	public void addAdresses(Adresse adresse) {
		if(adresse != null)
			this.adresses.add(adresse);
	}
}

