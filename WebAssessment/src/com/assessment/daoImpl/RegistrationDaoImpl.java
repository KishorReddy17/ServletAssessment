package com.assessment.daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.assessment.dao.RegistrationDao;
import com.assessment.model.User;

public class RegistrationDaoImpl implements RegistrationDao {

	@Override
	public String authoriseUser(User user) {

		int i = 0;
		try {
			Connection connection = ConnectionProvider.getConnectionProvider();
			PreparedStatement prepare = null;

			String qry = "insert into signup values(?,?,?,?)";
			prepare = connection.prepareStatement(qry);
			prepare.setString(1, user.getName());
			prepare.setString(2, user.getEmail());
			prepare.setLong(3, Long.parseLong(user.getMobileNumber()));
			prepare.setString(4, user.getPassword());
			
			i = prepare.executeUpdate();
			connection.close();
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		if (i == 1) {
			return "Registration Successful";
		} else {
			return "Invalid";
		}
	}

}
