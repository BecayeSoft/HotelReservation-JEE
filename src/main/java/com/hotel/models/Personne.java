package com.hotel.models;

public class Personne {
	String idPersonne;
	String nom; 
	String prenom; 
	String email; 
	String telephone; 
	String mot_de_passe;
	int age;
	String sexe; 
	String privilege;
	
		
	public Personne() {}

	public Personne(String idPersonne, String nom, String prenom, String email, String telephone, String mot_de_passe,
			int age, String sexe, String privilege) {
		super();
		this.idPersonne = idPersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.mot_de_passe = mot_de_passe;
		this.age = age;
		this.sexe = sexe;
		this.privilege = privilege;
	}
	
	public String getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(String idPersonne) {
		this.idPersonne = idPersonne;
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
	
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	
	public String getPrivilege() {
		return privilege;
	}
	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	} 
	
	
}
