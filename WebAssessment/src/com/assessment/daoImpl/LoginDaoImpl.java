package com.assessment.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.assessment.dao.LoginDao;
import com.assessment.model.User;

public class LoginDaoImpl implements LoginDao {

	@Override
	public String authoriseUser(User user) {
		// TODO Auto-generated method stub
		int i=0;
		try {
			Connection connection=ConnectionProvider.getConnectionProvider();
			PreparedStatement st=null;
			String gettinglogindetails="select * from signup";
			st=connection.prepareStatement(gettinglogindetails);
			ResultSet resultset=st.executeQuery();
			
			while(resultset.next()) 
			{
				String loginEmail=resultset.getString(2);
				String LogPassword=resultset.getString(4);
				

				if(user.getEmail().equals(loginEmail)&&user.getPassword().equals(LogPassword))
				{
					i=1;
					break;
				}
				else
				{
					continue;
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(i==1)
		{
			return "Login Successful";
		}
		else
		{
			return "Invalid";
		}
	}
}
