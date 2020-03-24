package com.webApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

/**
 * Servlet implementation class LogInSevlet
 */
@WebServlet("/LogInSevlet")
public class LogInSevlet extends HttpServlet {
	@Resource(name = "jdbc/student")
	private DataSource dataSource;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");

		PrintWriter out = response.getWriter();

		response.setContentType("text/plain");

		Connection myconn = null;

		Statement mystmt = null;
		ResultSet myre = null;
		try {
		
			myconn = dataSource.getConnection();
			String sql = "select * from signup";

			mystmt = myconn.createStatement();
			myre = mystmt.executeQuery(sql);
			int status=0;
			while(myre.next()) 
			{
				String ReEmail=myre.getString("email");
				String RPassword=myre.getString("password");
				if(email.equals(ReEmail)&&password.equals(RPassword))
				{
					String loginUser="select name from signup where email=?";
					
					
					status=1;
					response.sendRedirect("home.jsp");
				}
				
			}
		    if(status==0)
			{
				out.print("Invalid User Name and Password");
			}
			
			

			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


	
	
}
