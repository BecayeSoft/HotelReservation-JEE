package com.hotel.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.dao.LitDaoImpl;
import com.hotel.models.Lit;

/**
 * Servlet implementation class LitController
 */
@WebServlet(urlPatterns = { "/lits", "/lits/new", "/lits/save", "/lits/edit",
"/lits/delete" })
public class LitController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String CATEGORIE_INDEX = "/WEB-INF/views/lits/index.jsp";
	private final String CATEGORIE_FORM = "/WEB-INF/views/lits/lit-form.jsp";
	private LitDaoImpl dao;  
    
	/**
     * @see HttpServlet#HttpServlet()
     */
    public LitController() {
        super();
        dao = new LitDaoImpl();
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
			Lit obj = dao.getById(id);
			request.setAttribute("lit", obj);
			dispatcher = request.getRequestDispatcher(CATEGORIE_FORM);
		} 
		else if (request.getRequestURI().endsWith("delete")) {
			String id = request.getParameter("id");
			Lit obj = dao.getById(id);
			dao.delete(obj);
			request.setAttribute("lits", dao.getAll());
			dispatcher = request.getRequestDispatcher(CATEGORIE_INDEX);
		} 
		else {
			request.setAttribute("lits", dao.getAll());
			dispatcher = request.getRequestDispatcher(CATEGORIE_INDEX);
		}
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Lit obj = new Lit(); 
		/*
		 * obj.setDescription(request.getParameter("description"));
		 * obj.setLibelle(request.getParameter("libelle"));
		 * obj.setNb_chambres(Integer.valueOf(request.getParameter("nb_chambres")));
		 * obj.setTarif(Double.valueOf(request.getParameter("tarif")));
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
