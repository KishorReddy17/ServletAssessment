package com.assessment.serviceimpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.model.User;
import com.assessment.service.LoginService;

public class LoginServiceImpl implements LoginService{

	public User getUserDetails(HttpServletRequest request, HttpServletResponse response) {
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		User user=new User();
		user.setEmail(email);
		user.setPassword(password);
		return user;
	}

}
