package com.ooprog;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException  {
			req.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(req, res);
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException  {
			String name = req.getParameter("name");
//			String password = req.getParameter("password");
			req.getSession().setAttribute("name", name);
			res.sendRedirect("/home");
	}
	
}
