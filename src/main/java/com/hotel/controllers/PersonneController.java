package com.hotel.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.dao.PersonneDaoImpl;
import com.hotel.models.Personne;

/**
 * Servlet implementation class PersonneController
 */
@WebServlet(urlPatterns = { "/personnes", "/personnes/new", "/personnes/save", "/personnes/edit",
"/personnes/delete" })
public class PersonneController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String CATEGORIE_INDEX = "/WEB-INF/views/personnes/index.jsp";
	private final String CATEGORIE_FORM = "/WEB-INF/views/personnes/personne-form.jsp";
	private PersonneDaoImpl dao;  
    
	/**
     * @see HttpServlet#HttpServlet()
     */
    public PersonneController() {
        super();
        dao = new PersonneDaoImpl();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = null;
		
		if (request.getRequestURI().endsWith("new")) {
			dispatcher = request.getRequestDispatcher(CATEGORIE_FORM);
		} 
		else if (request.getRequestURI().endsWith("edit")) {
			String id = request.getParameter("id");
			Personne obj = dao.getById(id);
			request.setAttribute("personne", obj);
			dispatcher = request.getRequestDispatcher(CATEGORIE_FORM);
		} 
		else if (request.getRequestURI().endsWith("delete")) {
			String id = request.getParameter("id");
			Personne obj = dao.getById(id);
			dao.delete(obj);
			request.setAttribute("personnes", dao.getAll());
			dispatcher = request.getRequestDispatcher(CATEGORIE_INDEX);
		} 
		else {
			request.setAttribute("personnes", dao.getAll());
			dispatcher = request.getRequestDispatcher(CATEGORIE_INDEX);
		}
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Personne obj = new Personne();
		/*
		obj.setDescription(request.getParameter("description"));
		obj.setLibelle(request.getParameter("libelle"));
		obj.setNb_chambres(Integer.valueOf(request.getParameter("nb_chambres")));
		obj.setTarif(Double.valueOf(request.getParameter("tarif")));
		*/

		if (request.getParameter("id") == null || request.getParameter("id").isEmpty()) {
			dao.create(obj);
		} 
		else {
			String id = request.getParameter("id");
			obj.setId(id);
			dao.update(obj);
		}
		doGet(request, response);
	}

}
