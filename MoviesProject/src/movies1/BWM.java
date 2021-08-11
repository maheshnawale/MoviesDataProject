package movies1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BWM
 */
@WebServlet("/BWM")
public class BWM extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String o=request.getParameter("a");
		if(o.equals("insert"))
		{
			response.sendRedirect("B_insert.jsp");
		}
		else if(o.equals("update"))
		{
			response.sendRedirect("B_update.jsp");
		}
		else if(o.equals("delete"))
		{
			response.sendRedirect("B_delete.jsp");
		}
		else if(o.equals("read"))
		{
			response.sendRedirect("B_read.jsp");
		}
		
	}

	
}
