package com.hotel.models;

public class Categorie {
	
	String id;
	String libelle;
	int nb_chambres;
	double tarif;
	String description;
	
	
	public Categorie() {}
	
	public Categorie(String idCategorie, String libelle, int nb_chambres, double tarif, String description) {
		super();
		this.id = idCategorie;
		this.libelle = libelle;
		this.nb_chambres = nb_chambres;
		this.tarif = tarif;
		this.description = description;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public int getNb_chambres() {
		return nb_chambres;
	}
	public void setNb_chambres(int nb_chambres) {
		this.nb_chambres = nb_chambres;
	}
	
	public double getTarif() {
		return tarif;
	}
	public void setTarif(double tarif) {
		this.tarif = tarif;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
