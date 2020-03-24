package com.webApp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


@WebServlet("/RegistrationSevlet")
public class RegistrationSevlet extends HttpServlet {
	
	@Resource(name = "jdbc/student")
	private DataSource dataSource;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String mNobile=request.getParameter("number");
	
		String password=request.getParameter("password1");			
		List<RegistrationModel> register = new ArrayList<RegistrationModel>();

		Connection myConn = null;
		PreparedStatement prepare = null;


		response.setContentType("text/plain");
         RegistrationModel ob;
		
		try {
			myConn = dataSource.getConnection();
			ob=new RegistrationModel();
			ob.setName(name);
			ob.setEmail(email);
			ob.setMobileNumber(mNobile);
			ob.setPassword(password);
			register.add(ob);
			String qry="insert into signup values(?,?,?,?)";
			prepare = myConn.prepareStatement(qry);
			prepare.setString(1,name);
			prepare.setString(2,email);
			prepare.setString(3,mNobile);
			prepare.setString(4,password);
			int i=0;
			i=prepare.executeUpdate();
			if(i==1) {

				response.sendRedirect("./signin.jsp");
			}
			else {
				
			}
		
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}




}
