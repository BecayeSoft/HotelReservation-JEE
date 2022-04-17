package com.hotel.models;

public class Option {
	String id;
	boolean hasBalcon;
	boolean hasVue_sur_mer;
	boolean hasSalle_sejour;
	boolean hasCuisine;
	
	
	public Option() {}
	
	public Option(String id, boolean hasBalcon, boolean hasVue_sur_mer, boolean hasSalle_sejour, boolean hasCuisine) {
		super();
		this.id = id;
		this.hasBalcon = hasBalcon;
		this.hasVue_sur_mer = hasVue_sur_mer;
		this.hasSalle_sejour = hasSalle_sejour;
		this.hasCuisine = hasCuisine;
	}
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public boolean hasBalcon() {
		return hasBalcon;
	}
	public void setBalcon(boolean hasBalcon) {
		this.hasBalcon = hasBalcon;
	}
	
	public boolean hasVue_sur_mer() {
		return hasVue_sur_mer;
	}
	public void setVue_sur_mer(boolean hasVue_sur_mer) {
		this.hasVue_sur_mer = hasVue_sur_mer;
	}
	
	public boolean hasSalle_sejour() {
		return hasSalle_sejour;
	}
	public void setSalle_sejour(boolean hasSalle_sejour) {
		this.hasSalle_sejour = hasSalle_sejour;
	}
	
	public boolean hasCuisine() {
		return hasCuisine;
	}
	public void setCuisine(boolean hasCuisine) {
		this.hasCuisine = hasCuisine;
	}

	
}
