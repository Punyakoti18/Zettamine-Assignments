package com.zettamine.rainfall1.Jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class JdbcConnection 
{
	private static Connection con = null;
	public static Connection getConnection()
	{
		if(con == null)
		{
			ResourceBundle rs = ResourceBundle.getBundle("dbConfig");
			
			String driver = rs.getString("jdbc.driverclass");
			String url = rs.getString("jdbc.url");
			String user = rs.getString("jdbc.user");
			String pass = rs.getString("jdbc.pass");
			
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url,user,pass);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
		
		return con;
	}

}
