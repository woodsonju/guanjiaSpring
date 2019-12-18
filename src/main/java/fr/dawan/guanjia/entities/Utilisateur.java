package fr.dawan.guanjia.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="utilisateur_discriminator", discriminatorType = DiscriminatorType.STRING)
public  class Utilisateur extends DbObject implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String nom;
	
	private String prenom;
	
	private String numTelephone;
	
	private String email;
	
	private String pwd;
	
	private String confirmpwd;
	
	private boolean statut;
	
	@Enumerated(EnumType.STRING)
	private TypeUtilisateur typeUtilisateur;

	
	public Utilisateur() {
		super();
	}

	public Utilisateur(String nom, String prenom, String email, String pwd, boolean statut,
			TypeUtilisateur typeUtilisateur) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.pwd = pwd;
		this.statut = statut;
		this.typeUtilisateur = typeUtilisateur;
	}

	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public boolean isStatut() {
		return statut;
	}

	public void setStatut(boolean statut) {
		this.statut = statut;
	}

	public TypeUtilisateur getTypeUtilisateur() {
		return typeUtilisateur;
	}

	public void setTypeUtilisateur(TypeUtilisateur typeUtilisateur) {
		this.typeUtilisateur = typeUtilisateur;
	}

	public String getNumTelephone() {
		return numTelephone;
	}

	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}

	public String getConfirmpwd() {
		return confirmpwd;
	}

	public void setConfirmpwd(String confirmpwd) {
		this.confirmpwd = confirmpwd;
	}


	
}
