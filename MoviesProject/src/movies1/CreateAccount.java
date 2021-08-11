package movies1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateAccount
 */
@WebServlet("/CreateAccount")
public class CreateAccount extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
			String username=request.getParameter("t1");
			String password=request.getParameter("p1");
			
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletproject","root","123");
				PreparedStatement st=con.prepareStatement("insert into login1 values(?,?)");
				st.setString(1, username);
				st.setString(2, password);
				
				int i=st.executeUpdate();
				out.println("Account Created");
			}
			catch(Exception e)
			{
				
			}
	}
	}
	


