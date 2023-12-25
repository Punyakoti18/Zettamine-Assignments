package com.zettamine.rainfall.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class JdbcConnection 
{
	private static Connection con=null;
	
	public static Connection getConnection() 
	{
	
	try {
		if(con==null)
		{
			ResourceBundle rb=ResourceBundle.getBundle("resources");
			String reg=rb.getString("jdbc.cont");
			String url=rb.getString("jdbc.url");
			String user=rb.getString("jdbc.username");
			String pass=rb.getString("jdbc.password");
			
			Class.forName(reg);
			
			Connection con=DriverManager.getConnection(url,user,pass);
			
		}
		
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
	
	return con;
	}
}
