package com.hotel.dao;

import java.util.List;

import com.hotel.models.Option;
import com.hotel.utils.Helpers;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

public class OptionDaoImpl implements Dao<Option> {
	
	//TODO: Check the name: is it Option or Options
	public static final String SELECT_ALL = "SELECT obj FROM Option obj";
	private EntityManagerFactory factory;
	

	public OptionDaoImpl() {
		factory = Helpers.getEntityManagerFactory();
	}

	@SuppressWarnings("unchecked")
	public List<Option> getAll() {
		EntityManager em = null;
		List<Option> obj = null;
		em = factory.createEntityManager();
		em.getTransaction().begin();
		obj = em.createQuery(SELECT_ALL).getResultList();
		em.getTransaction().commit();
		
		return obj;
	}

	public Option getById(int id) {
		Option obj;
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		obj = em.find(Option.class, id);
		em.getTransaction().commit();
		
		return obj;
	}

	public void create(Option obj) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.persist(obj);
		em.getTransaction().commit();
	}

	public void update(Option obj) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		em.merge(obj);
		em.getTransaction().commit();
	}

	public void delete(Option obj) {
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		
		if(em.contains(obj))
			obj = em.merge(obj);
		em.remove(obj);
		em.getTransaction().commit();
	}

}
