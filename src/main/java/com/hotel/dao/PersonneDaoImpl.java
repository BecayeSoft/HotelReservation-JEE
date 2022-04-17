package com.hotel.dao;

import java.util.List;

import com.hotel.models.Personne;
import com.hotel.utils.Helpers;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class PersonneDaoImpl implements Dao<Personne> {
	
	//TODO: Check the name: is it Personne or Personnes
	public static final String SELECT_ALL = "SELECT obj FROM Personne obj";
	private EntityManagerFactory factory;
	

	public PersonneDaoImpl() {
		factory = Helpers.getEntityManagerFactory();
	}

	@SuppressWarnings("unchecked")
	public List<Personne> getAll() {
		EntityManager em = null;
		List<Personne> obj = null;
		em = factory.createEntityManager();
		em.getTransaction().begin();
		obj = em.createQuery(SELECT_ALL).getResultList();
		em.getTransaction().commit();
		
		return obj;
	}

	public Personne getById(String id) {
		Personne obj;
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		obj = em.find(Personne.class, id);
		em.getTransaction().commit();
		
		return obj;
	}

	public void create(Personne obj) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
	}

	public void update(Personne obj) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
	}

	public void delete(Personne obj) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		if(em.contains(obj))
			obj = em.merge(obj);
		em.remove(obj);
		em.getTransaction().commit();
	}

}
