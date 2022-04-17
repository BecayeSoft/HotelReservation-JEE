package com.hotel.models;

public class Lit {
	String id;
	int nombre;
	int nb_places;
	
	public Lit() {}
	
	public Lit(String id, int nombre, int nb_places) {
		super();
		this.id= id;
		this.nombre = nombre;
		this.nb_places = nb_places;
	}
	
	
	public String getIdLit() {
		return id;
	}

	public void setIdLit(String idLit) {
		this.id= idLit;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public int getNb_places() {
		return nb_places;
	}

	public void setNb_places(int nb_places) {
		this.nb_places = nb_places;
	}
	
	
}
