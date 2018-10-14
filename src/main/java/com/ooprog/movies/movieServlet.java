package com.ooprog.movies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/home")
public class movieServlet extends HttpServlet {
	
	    movieService movieService = new movieService();
	    public void doGet(HttpServletRequest request, HttpServletResponse response)
	            throws IOException, ServletException {

	        request.setAttribute("towatchs", movieService.retrieveToWatchs());
	        request.getRequestDispatcher("/WEB-INF/views/home.jsp").forward(request, response);
	    }

	    public void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws IOException, ServletException {
	        String toWatchList = request.getParameter("todo");
	        movieService.add(new ToWatch(toWatchList));
	        response.sendRedirect("/home");
	    }
}
