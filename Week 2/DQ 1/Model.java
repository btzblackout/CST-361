package com.blackout;
import java.sql.*;

import java.util.*;
public class Model 
{
	static List<Profile> profile = new ArrayList<>();
	public static List<Profile> getProfile()
	{
		return profile;
	}
	
	public static void returnUserInfo() throws ClassNotFoundException, SQLException
	{
		String userName, firstName, lastName, bio;
		int monthJoined, yearJoined;
		Profile tempProfile = new Profile();
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/profile", "root", "password");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from userinfo");
			rs.next();
			userName = rs.getString(1);
			firstName = rs.getString(2);
			lastName = rs.getString(3);
			monthJoined = rs.getInt(4);
			yearJoined = rs.getInt(5);
			bio = rs.getString(6);
			tempProfile = new Profile(userName, firstName, lastName, bio, monthJoined, yearJoined);
			profile.add(tempProfile);
			

	}
	

}	