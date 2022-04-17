package com.hotel.models;

public class Lit {
	String id;
	int nombre;
	int nb_places;
	
	public Lit() {}
	
	public Lit(String idLit, int nombre, int nb_places) {
		super();
		this.id= idLit;
		this.nombre = nombre;
		this.nb_places = nb_places;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
