package fr.dawan.guanjia.entities;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

@Entity
@Inheritance (strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="utilisateur_discriminator", discriminatorType = DiscriminatorType.STRING)
public  class Utilisateur extends DbObject implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@NotEmpty 
	@Size(min = 5, max = 20, message = "{utilisateur.nom.size")
	private String nom;
	
	@NotEmpty
	@Size(min = 5, max = 20, message = "{utilisateur.prenom.size")
	private String prenom;
	
	@NotEmpty
	private String numTelephone;
	
	@NotEmpty
	@Pattern(regexp = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")
	@Email(message = "{user.email.valid}")
	private String email;
	
	@NotEmpty
	//@Length(min = 6, max = 15)
	@Size(min = 6, max = 15)
	private String pwd;
	
	@NotEmpty
	//@Length(min = 6)
	@Size()
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
