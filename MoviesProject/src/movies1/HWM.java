package movies1;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HWM
 */
@WebServlet("/HWM")
public class HWM extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String o=request.getParameter("a");
		if(o.equals("insert"))
		{
			response.sendRedirect("H_insert.jsp");
		}
		else if(o.equals("update"))
		{
			response.sendRedirect("H_update.jsp");
		}
		else if(o.equals("delete"))
		{
			response.sendRedirect("H_delete.jsp");
		}
		else if(o.equals("read"))
		{
			response.sendRedirect("H_read.jsp");
		}
		
	}


}
