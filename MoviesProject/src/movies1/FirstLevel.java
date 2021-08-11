package movies1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstLevel
 */
@WebServlet("/FirstLevel")
public class FirstLevel extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String b=request.getParameter("a");
		PrintWriter out=response.getWriter();
		if(b.equals("BollyWood"))
		{
			response.sendRedirect("B_home.jsp");
		}
		else if(b.equals("HollyWood"))
		{
			response.sendRedirect("H_home.jsp");
		}
	}

	

}
