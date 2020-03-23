package com.assessment.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.assessment.dao.ReadName;


public class GetNameDaoImpl implements ReadName{
	public String getName(String email)
	{
		String name=null;
		try {
			Connection connection=ConnectionProvider.getConnectionProvider();
			PreparedStatement preparedStatement=connection.prepareStatement("select name from signup where email=?");
			preparedStatement.setString(1,email);
			ResultSet resultSet=preparedStatement.executeQuery();
			resultSet.next();
			name=resultSet.getString(1);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return name;
	}

}
