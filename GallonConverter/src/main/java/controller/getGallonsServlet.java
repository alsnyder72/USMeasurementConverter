package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.GallonConverter;

/**
 * Servlet implementation class getGallonsServlet
 */
@WebServlet("/getGallonsServlet")
public class getGallonsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getGallonsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userOunces = request.getParameter("userOunces");
		
		GallonConverter userMeasures = new GallonConverter(Integer.parseInt(userOunces));
		
		request.setAttribute("userMeasurementPouch", userMeasures);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request,  response);
		
		//PrintWriter writer = response.getWriter();
		//writer.println(userMeasures.toString()); // note change to userMeasures
		//writer.close();
	}

}
