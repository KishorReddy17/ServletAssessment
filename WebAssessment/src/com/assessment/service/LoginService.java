package com.assessment.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.assessment.model.User;

public interface LoginService {	
	
	 User getUserDetails(HttpServletRequest request, HttpServletResponse response);

}
