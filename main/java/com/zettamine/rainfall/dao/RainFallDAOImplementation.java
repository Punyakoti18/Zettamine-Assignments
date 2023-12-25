package com.zettamine.rainfall.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.zettamine.rainfall.data.RainFall;
import com.zettamine.rainfall.jdbc.JdbcConnection;

public class RainFallDAOImplementation implements RainfallDAO 
{
	static Connection con;
	static Statement st;

	public RainFallDAOImplementation() {
		con=JdbcConnection.getConnection();
		try {
			st=con.createStatement();
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		
	}

	@Override
	public Integer addRainFall(RainFall rain) {
		
		int pinCode=rain.getCityPin();
		
		String sql="insert into rainfall values('"+rain.getCityPin()+"' , '"+rain.getCityName()+"' , "+
		rain.getJan()+" , "+rain.getFeb()+" , "+rain.getMar()+" , "+rain.getApr()+" , "+rain.getMay()+" ,"+
				rain.getJun()+" , "+rain.getJul()+" , "+rain.getAug()+" , "+rain.getSep()+" , "+rain.getOct()+" , "+
		rain.getNov()+" , "+rain.getDec()+")";
		
		try {
			
			boolean check=checkingPin(pinCode);
			if(check)
			{
				int row=st.executeUpdate(sql);
				return row;
			}
			else
			{
			System.out.println("InValid PinCode");
			}
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		return null;
	}

	private boolean checkingPin(int pinCode) {
		
		String pin=String.valueOf(pinCode);
		if(pin.matches("\\d{5}"))
			{
			return true;
			}
		return false;
	}

	@Override
	public List<RainFall> gettingRainFalls()
	{
		List<RainFall> list=new ArrayList<>();
		
		String sql="select * from rainfall";
		
		ResultSet rs;
		try {
			rs = st.executeQuery(sql);
			while(rs.next())
			{
				int pin=rs.getInt(1);
				String city=rs.getString(2);
				float jan=rs.getFloat(3),feb=rs.getFloat(4),mar=rs.getFloat(5),apr=rs.getFloat(6),may=rs.getFloat(7),
						jun=rs.getFloat(8),jul=rs.getFloat(9),aug=rs.getFloat(10),sep=rs.getFloat(11),oct=rs.getFloat(12),
						nov=rs.getFloat(13),dec=rs.getFloat(14);
				
				
				list.add(new RainFall(pin,city,jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec));
			}
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		return list;
	}

	@Override
	public Float getAvg(Integer cityPin) {
		
		String sql1="select * from rainfall where city_pin="+cityPin;
		boolean check=checking(sql1,cityPin);
		if(!check)
		{
			return null;
		}
			
		String sql="select city_pin,city_name,jan_fall,feb_fall,mar_fall,apr_fall,may_fall,jun_fall,jul_fall,aug_fall,sep_fall,oct_fall,nov_fall,dec_fall,"
				+ "jan_fall+feb_fall+mar_fall+apr_fall+may_fall+jun_fall+jul_fall+aug_fall+sep_fall+oct_fall+nov_fall+dec_fall "
				+ "as Total from rainfall"
				+ " where city_pin="+cityPin;

		
		ResultSet rs;
		try {
			rs = st.executeQuery(sql);
			if(rs.next())
			{
				float total=rs.getFloat(15);
				float avg=total/12;
				return avg;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return null;
	}
	
	private boolean checking(String sql1,Integer cityPin) {
		ResultSet rs;
		try {
			rs = st.executeQuery(sql1);
			if(rs.next()) {
				if(rs.getInt(1)==cityPin)
				return true;
			}
			
		} catch (SQLException e) {
			System.err.println("No Such PinCode in the DataBase.");
		}
		return false;
		
	}

	@Override
	public void close()
	{
		try {
			try {
				con.close();
				st.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
