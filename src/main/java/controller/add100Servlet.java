package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Add100;
/**
 * Servlet implementation class getCalcServlet
 */
@WebServlet("/add100Servlet")
public class add100Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add100Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userNumber = request.getParameter("add100");
		
		int intUserNumber = Integer.parseInt(userNumber);
		
		Add100 adding = new Add100(intUserNumber);
		adding.setUsersNumber(intUserNumber);
		request.setAttribute("adding", adding);
		getServletContext().getRequestDispatcher("/add100Result.jsp").forward(request, response);
		
	}
	
	

}
