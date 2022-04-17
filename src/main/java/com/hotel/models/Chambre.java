package com.hotel.models;

public class Chambre {
	String id;
	int num_etage;
	String num_batiment;
	Option option;
	Categorie categorie;
	Lit[] lits;
	boolean isAvailable;
	
	
	public Chambre() {}
	
	public Chambre(String idChambre, int num_etage, String num_batiment, Option option, Categorie categorie,
			Lit[] lits) {
		super();
		this.id = idChambre;
		this.num_etage = num_etage;
		this.num_batiment = num_batiment;
		this.option = option;
		this.categorie = categorie;
		this.lits = lits;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public int getNum_etage() {
		return num_etage;
	}
	public void setNum_etage(int num_etage) {
		this.num_etage = num_etage;
	}
	
	public String getNum_batiment() {
		return num_batiment;
	}
	public void setNum_batiment(String num_batiment) {
		this.num_batiment = num_batiment;
	}
	
	public Option getOption() {
		return option;
	}
	public void setOption(Option option) {
		this.option = option;
	}
	
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	public Lit[] getLits() {
		return lits;
	}
	public void setLits(Lit[] lits) {
		this.lits = lits;
	} 

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}


}
