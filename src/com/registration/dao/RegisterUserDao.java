package com.registration.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.registration.user.User;
import com.util.DatabaseUtility;

public class RegisterUserDao {
	
	public void saveUserDetails(User user) throws ClassNotFoundException, SQLException
	{
	Connection con =	DatabaseUtility.getDatabaseConnection();
	PreparedStatement ps = con.prepareStatement("insert into userdetails(firstname,lastname,email,password,image) values(?,?,?,?,?)");
	ps.setString(1, user.getFirstName());
	ps.setString(2, user.getLastName());
	ps.setString(3, user.getEmail());
	ps.setString(4, user.getPassword());
	ps.setBlob(5, user.getImage());
	
	ps.executeUpdate();
	}

}
