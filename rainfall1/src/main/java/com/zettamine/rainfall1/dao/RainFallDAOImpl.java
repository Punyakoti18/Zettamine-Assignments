package com.zettamine.rainfall1.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zettamine.rainfall1.Jdbcconnection.JdbcConnection;
import com.zettamine.rainfall1.dto.RainFall;


public class RainFallDAOImpl implements RainFallDAO {

	Connection con = JdbcConnection.getConnection();
	Statement st;

	public RainFallDAOImpl() {
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public int addRainFall(int pincode, String cityName, double avgRainfall) {
		
		int rowsAffected = 0;
		String sql = "insert into annual_rainfall values(" + pincode + ",'" + cityName + "'," + avgRainfall + ")";

		try {
			rowsAffected = st.executeUpdate(sql);
		} catch (SQLException e) {
			e.getCause();
		}
		return rowsAffected;
	}

	@Override
	public List<RainFall> getMaxRainFall() {
		
		 List<RainFall> maxRainfall = new ArrayList<RainFall>();
		 
		 String sql = "select * from rainfall "
		 		+ "where average_annual_rainfall in "
		 		+ "(select max(average_annual_rainfall) from rainfall)";
		 
		 try {
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next())
			{
				RainFall anr = new RainFall(rs.getInt(1),rs.getString(2),rs.getDouble(3));
				maxRainfall.add(anr);
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getCause());
		}
		 
		return maxRainfall;
	}

}


