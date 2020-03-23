package com.assessment.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.dao.RegistrationDao;
import com.assessment.daoImpl.RegistrationDaoImpl;
import com.assessment.model.User;
import com.assessment.service.RegisterService;
import com.assessment.serviceimpl.RegisterServiceImpl;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	RegisterService registerservice=new RegisterServiceImpl();
	RegistrationDao registrationDao=new RegistrationDaoImpl();
       
    public RegisterServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		
		PrintWriter out=response.getWriter();
		User user=registerservice.getUserDetails(request, response);
		
		
		 String status=registrationDao.authoriseUser(user);
		 if(status.equals("Registration Successful"))
		 {
			 response.sendRedirect("login.jsp");
		 }
		 if(status.equals("Invalid"))
		 {
			 out.print("Regestration is unsuccessful :(");
		 }
	
	}


}
