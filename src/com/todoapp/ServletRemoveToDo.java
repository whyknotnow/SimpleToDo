package com.todoapp;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAO;

public class ServletRemoveToDo extends HttpServlet{
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String id = req.getParameter("id");
		DAO.INSTANCE.remove(Long.parseLong(id));
		resp.sendRedirect("/TodoApplication.jsp");
	}
}
