package com.hotel.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hotel.dao.OptionDaoImpl;
import com.hotel.models.Option;

/**
 * Servlet implementation class OptionController
 */
@WebServlet(urlPatterns = { "/options", "/options/new", "/options/save", "/options/edit",
"/options/delete" })
public class OptionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String CATEGORIE_INDEX = "/WEB-INF/views/options/index.jsp";
	private final String CATEGORIE_FORM = "/WEB-INF/views/options/option-form.jsp";
	private OptionDaoImpl dao;  
    
	/**
     * @see HttpServlet#HttpServlet()
     */
    public OptionController() {
        super();
        dao = new OptionDaoImpl();
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
			Option obj = dao.getById(id);
			request.setAttribute("option", obj);
			dispatcher = request.getRequestDispatcher(CATEGORIE_FORM);
		} 
		else if (request.getRequestURI().endsWith("delete")) {
			String id = request.getParameter("id");
			Option obj = dao.getById(id);
			dao.delete(obj);
			request.setAttribute("options", dao.getAll());
			dispatcher = request.getRequestDispatcher(CATEGORIE_INDEX);
		} 
		else {
			request.setAttribute("options", dao.getAll());
			dispatcher = request.getRequestDispatcher(CATEGORIE_INDEX);
		}
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Option obj = new Option();
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
