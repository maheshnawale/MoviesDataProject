package movies1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class FirstLevelFilter
 */
@WebFilter("/movieshome.jsp")

public class FirstLevelFilter implements Filter {

    /**
     * Default constructor. 
     */
    public FirstLevelFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		out.println("filter is executing");
		String uname=request.getParameter("t1");
		String pass=request.getParameter("p1");
		boolean valid=false;
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/servletproject","root","123");
		PreparedStatement st=con.prepareStatement("select * from login1");
		ResultSet rs=st.executeQuery();
		while(rs.next())
		{
			if(rs.getString(1).equals(uname))
			{
				if(rs.getString(2).equals(pass))
				{
					valid=true;
				}
			}
		}
		if(valid==true)
		{
			RequestDispatcher rd=request.getRequestDispatcher("movieshome.jsp");
			rd.forward(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
		}
		catch(Exception e)
		{
			
		}
		/*if(uname.equals("mahesh") && pass.equals("123"))
		{
			RequestDispatcher rd=request.getRequestDispatcher("movieshome.jsp");
			rd.forward(request, response);
			//chain.doFilter(request, response);
		}
		else
		{
			
			RequestDispatcher rd=request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			out.print("<h4 style=color:red>wrong username or password</h4>");
		}*/
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
