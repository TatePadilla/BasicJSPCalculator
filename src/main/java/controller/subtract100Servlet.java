package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Subtract100;

/**
 * Servlet implementation class getSecondNumberServlet
 */
@WebServlet("/subtract100Servlet")
public class subtract100Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public subtract100Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String userNumber = request.getParameter("subtract100");
		
		int intUserNumber = Integer.parseInt(userNumber);
		
		Subtract100 subtracting = new Subtract100(intUserNumber);
		subtracting.setUsersNumber(intUserNumber);
		request.setAttribute("subtracting", subtracting);
		getServletContext().getRequestDispatcher("/subtract100Result.jsp").forward(request, response);
	}

}
