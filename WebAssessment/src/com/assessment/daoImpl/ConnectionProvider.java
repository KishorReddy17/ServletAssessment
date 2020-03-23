package com.assessment.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {




	public static Connection getConnectionProvider()
	{

		Connection con=null;
		try {

			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/Student","postgres","1234");
		} 

		catch (ClassNotFoundException | SQLException e) {
		
			e.printStackTrace();
		}
		return con;


	}


}
