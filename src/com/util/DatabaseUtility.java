package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtility {
	
	public static Connection getDatabaseConnection() throws SQLException, ClassNotFoundException
	{
		Connection con = null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ravi", "ravi");
		System.out.println("connected to Database");
		return con;
	}
	

}
