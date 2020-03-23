package com.assessment.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.assessment.dao.LoginDao;
import com.assessment.dao.ReadName;
import com.assessment.daoImpl.GetNameDaoImpl;
import com.assessment.daoImpl.LoginDaoImpl;
import com.assessment.model.User;
import com.assessment.service.LoginService;
import com.assessment.serviceimpl.LoginServiceImpl;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	LoginService loginService=new LoginServiceImpl();
	LoginDao lodindao=new LoginDaoImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		User user=loginService.getUserDetails(request, response);
		
		
		 String status=lodindao.authoriseUser(user);
		 if(status.equals("Login Successful"))
		 {

				ReadName getNameDao=new GetNameDaoImpl();
				String name=getNameDao.getName(user.getEmail());
				HttpSession session=request.getSession();
				session.setAttribute("user", name);
			 response.sendRedirect("HomePage.jsp");
		 }
		 if(status.equals("Invalid"))
		 {
			 out.print("Email and Password didnt match");
		 }
		  
				
	}

}
