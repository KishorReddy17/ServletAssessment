package com.assessment.serviceimpl;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.model.User;
import com.assessment.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {

	@Override
	public User getUserDetails(HttpServletRequest request, HttpServletResponse response) {
		
		
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String mobile=request.getParameter("number");
		String password=request.getParameter("password1");			
		User user=new User();
		user.setName(name);
		user.setEmail(email);	
		user.setMobileNumber(mobile);
		user.setPassword(password);
		return user;
	}

}
