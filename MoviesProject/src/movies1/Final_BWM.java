package movies1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Final_BWM
 */
@WebServlet("/Final_BWM")
public class Final_BWM extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String b=request.getParameter("a");
		PrintWriter out=response.getWriter();
		ArrayList Al=new ArrayList();
		if(b.equals("insert"))
		{
			int mid=Integer.parseInt(request.getParameter("id"));
			String Mname=request.getParameter("mn");
			String Actorsname=request.getParameter("an");
			String Actressessname=request.getParameter("fan");
			int mratings=Integer.parseInt(request.getParameter("rd"));
			
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletproject","root","123");
				PreparedStatement st=con.prepareStatement("insert into BollyMovies values(?,?,?,?,?)");
				st.setInt(1, mid);
				st.setString(2, Mname);
				st.setString(3, Actorsname);
				st.setString(4, Actressessname);
				st.setInt(5, mratings);
				int i=st.executeUpdate();
				out.println("data saved");
			}
			catch(Exception e)
			{
				
			}
		}
			if(b.equals("update"))
			{
				int mid=Integer.parseInt(request.getParameter("id"));
				String cn=request.getParameter("cn");
				String val=request.getParameter("v");
				
					if(cn.equals("Mname"))
					{
						try
						{
							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletproject","root","123");
							PreparedStatement st=con.prepareStatement("update BollyMovies set Mname=? where mid=?");
							st.setString(1, val);
							st.setInt(2, mid);
							int i= st.executeUpdate();
							out.println("data updated");
						}
						catch(Exception e)
						{}
					}
					else if(cn.equals("ActorsName"))
					{
						try
						{
							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletproject","root","123");
							PreparedStatement st=con.prepareStatement("update BollyMovies set ActorsName=? where mid=?");
							st.setString(1, val);
							st.setInt(2, mid);
							int i= st.executeUpdate();
							out.println("data updated");
						}
						catch(Exception e)
						{}
					}
					else if(cn.equals("ActressesName"))
					{
						try
						{
							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletproject","root","123");
							PreparedStatement st=con.prepareStatement("update BollyMovies set ActressesName=? where mid=?");
							st.setString(1, val);
							st.setInt(2, mid);
							int i= st.executeUpdate();
							out.println("data updated");
						}
						catch(Exception e)
						{}
					}
			}
					if(b.equals("delete"))
					{
						int mid=Integer.parseInt(request.getParameter("id"));
						try
						{
							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletproject","root","123");
							PreparedStatement st=con.prepareStatement("delete from BollyMovies where mid=?");
							st.setInt(1, mid);
							int i= st.executeUpdate();
							out.println("data deleted");
						}
						catch(Exception e)
						{}
						
					}
					else if(b.equals("read"))
						try
						{
							Class.forName("com.mysql.jdbc.Driver");
							Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletproject","root","123");
							PreparedStatement st=con.prepareStatement("select * from BollyMovies");
							ResultSet r=st.executeQuery();
							while(r.next())
							{
								ArrayList al=new ArrayList();
								al.add(r.getInt(1));
								al.add(r.getString(2));
								al.add(r.getString(3));
								al.add(r.getString(4));
								al.add(r.getInt(5));
								Al.add(al);
							}
							
							HttpSession session=request.getSession();
							session.setAttribute("mylist", Al);
							response.sendRedirect("allbollywood.jsp");
						}
						catch(Exception e)
						{
							System.out.println(e);
						}
			
			
	}
	}

