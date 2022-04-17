package com.hotel.models;

import java.time.Instant;

public class Reservation {
	String idReservation;
	Chambre[] chambres;
	Instant dateReservation;
	Instant dateEntree;
	Instant dateSortie;
	boolean isActive;
	Personne[] personnes;
	double montant;
	
	
	public Reservation() {}
	
	public Reservation(String idReservation, Chambre[] chambres, Instant dateReservation, Instant dateEntree,
			Instant dateSortie, boolean isActive, Personne[] personnes, double montant) {
		super();
		this.idReservation = idReservation;
		this.chambres = chambres;
		this.dateReservation = dateReservation;
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
		this.isActive = isActive;
		this.personnes = personnes;
		this.montant = montant;
	}
	
	
	public String getIdReservation() {
		return idReservation;
	}
	public void setIdReservation(String idReservation) {
		this.idReservation = idReservation;
	}
	
	public Chambre[] getChambres() {
		return chambres;
	}
	public void setChambres(Chambre[] chambres) {
		this.chambres = chambres;
	}
	
	public Instant getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Instant dateReservation) {
		this.dateReservation = dateReservation;
	}
	
	public Instant getDateEntree() {
		return dateEntree;
	}
	public void setDateEntree(Instant dateEntree) {
		this.dateEntree = dateEntree;
	}
	
	public Instant getDateSortie() {
		return dateSortie;
	}
	public void setDateSortie(Instant dateSortie) {
		this.dateSortie = dateSortie;
	}
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public Personne[] getPersonnes() {
		return personnes;
	}
	public void setPersonnes(Personne[] personnes) {
		this.personnes = personnes;
	}
	
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	
	
}
